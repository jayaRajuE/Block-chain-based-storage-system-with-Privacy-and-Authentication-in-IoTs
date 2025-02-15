



import java.io.Serializable;




/**
 * The ECIES (Elliptic Curve Integrated Encryption Scheme)
 * as specified in ANSI X9.63 and the IEEE P1363a Draft.
 * <P>
 * ECIES (the Elliptic Curve Integrated Encryption Scheme) 
 * combines elliptic curve asymmetric encryption and the AES 
 * symmetric encryption algorithm with the SHA-1 hash algorithm 
 * to provide an easy to use encryption scheme with message 
 * authentication support. An ECIES ciphertext object (V, C, T)
 * consisting of EC public key V, encrypted message C and 
 * authentication tag T is generated from a message M and the 
 * recipient?fs EC public key Wi. The recipient decrypts this 
 * ciphertext with their EC private key and an exception is 
 * thrown if the authentication tag is invalid. This encryption
 * scheme is described in more detail in section 11.3 of the 
 * IEEE P1363a draft standard.
 * @author <a href="http://www.dragongate-technologies.com">Dragongate Technologies Ltd.</a>
 * @version 0.90
 */
public class MRSAIES implements Serializable
{
	public MRSAPubKey V;
	public int[] C;
	public int[] T;

	public MRSAIES ()
	{
	}

	public MRSAIES (MRSAPrivKey u, MRSAPubKey W, byte[] p)
	{
		int P1[] = new int[0]; // This is 0
		int P2[] = new int[0]; // This is 0
		/*int P[] = new int[3]; // Key Derivation Parameters
		for (int i=0; i<3; i++) {
			P[i] = i;
		}*/

		Fq z = MRSA.ECSVDP_DH (u.dp, u.s, W.W);
		int Z[] = Utils.FE2OSP (z);
	
		int K[] = MRSA.KDF2 (Z, 32, P1); // 256 bits

		int K1[] = new int[16]; // 128 bit symmetric encryption key
		int K2[] = new int[16]; // 128 bit MAC key
		for (int j=0; j<K1.length;j++) {
			K1[j] = K[j];
		}
		for (int k=0; k<K2.length;k++) {
			K2[k] = K[k+K1.length];
		}
		
		V = new MRSAPubKey (u);
		C = MRSA.AES_CBC_IV0_Encrypt (K1, Utils.toIntArray(p), 128);
		T = MRSA.MAC1 (K2, Utils.concatenate(C, P2));
	}
	
	public MRSAIES (MRSAPubKey V, int[] C, int[] T)
	{
		this.V = V;
		this.C = C;
		this.T = T;
	}

	public byte[] decrypt(MRSAPrivKey s) throws Exception
	{
		int P1[] = new int[0]; // This is 0
		int P2[] = new int[0]; // This is 0
		/*int P[] = new int[3]; // Key Derivation Parameters
		for (int i=0; i<3; i++) {
			P[i] = i;
		}*/

		Fq z = MRSA.ECSVDP_DH (s.dp, s.s, V.W);
		int Z[] = Utils.FE2OSP (z);

		int K[] = MRSA.KDF2 (Z, 32, P1); // 256 bits

		int K1[] = new int[16]; // 128 bit symmetric encryption key
		int K2[] = new int[16]; // 128 bit MAC key
		for (int j=0; j<K1.length;j++) {
			K1[j] = K[j];
		}
		for (int k=0; k<K2.length;k++) {
			K2[k] = K[k+K1.length];
		}
		int M[] = MRSA.AES_CBC_IV0_Decrypt (K1, C, 128);

		if (!Utils.compare (T, MRSA.MAC1 (K2, Utils.concatenate(C, P2)))) {
			throw new Exception ("ECIES: Authentication Tag Invalid");
		}

		return Utils.toByteArray(M);
	}

	public byte[] decrypt(MRSAPrivKey s, MRSAPubKey V, int[] C, int[] T) throws Exception
	{
		this.V = V;
		this.C = C;
		this.T = T;
		return decrypt (s);
	}

	public String toString()
	{
		String str = new String("V:").concat(V.toString().concat("\n"));
		str = str.concat("C:").concat(Utils.intArrayToString(C)).concat("\n");
		str = str.concat("T:").concat(Utils.intArrayToString(T)).concat("\n");
		
		return str;
	}

	protected Object clone()
	{
		return new MRSAIES();
	}

}
