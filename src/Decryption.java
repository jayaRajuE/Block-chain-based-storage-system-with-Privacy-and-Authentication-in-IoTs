



import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;

public class Decryption implements Serializable
{
	MRSAPrivKey skB;
	MRSAIES crypt;
	DerIOBuffer der;
	MRSAIES crypted1;
	int[] crypted;
	public Decryption()
	{

	}

	public String decrypt(int[] crypt)
	{
	String decrypteddata="";
	//int a[]=(int [])crypt;

		try {
			System.out.println("IN DEC"+crypt);
			//crypted1=(DerIOBuffer)crypt;
			MRSADomainParameters dp = MRSADomainParameters.NIST_B_163();
			MRSAPrivKey skB = new MRSAPrivKey(dp, BigInteger.valueOf(230));
 			MRSAPubKey pkB = new MRSAPubKey(skB);
 			der=new DerIOBuffer();
			MRSAIES decrypt = der.toECIES(crypt);
			System.out.print("(2)Cipher Text: ");
			System.out.println(decrypt.toString());
			byte[] pt2 = decrypt.decrypt(skB); // decrypt the data
			System.out.print("(3)Plain Text: ");
			//System.out.println(new String(pt2));
			decrypteddata= new String(pt2);
			System.out.println(decrypteddata);


			}
		catch (Exception e)
			{
				e.printStackTrace();
			}
		return decrypteddata;
	}
}




