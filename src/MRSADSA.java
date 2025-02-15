



import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;




/**
 * The ECDSA (Elliptic Curve Digital Signature Algorithm) as 
 * specified in ANSI X9.62, FIPS 186-2 and IEEE P1363.
 * <P>
 * ECDSA (the Elliptic Curve Digital Signature Algorithm) is used 
 * to generate a digital signature of a message digest or hash. 
 * The signature consists of c and d which are two large integers.
 * This signature algorithm is described in more detail in 
 * sections 7.2.7 and 7.2.8 of the IEEE P1363 standard.
 * @author <a href="http://www.dragongate-technologies.com">Dragongate Technologies Ltd.</a>
 * @version 0.90
 */
public class MRSADSA {
	public BigInteger c;
	public BigInteger d;

	private MRSAPrivKey s;
	private MRSAPubKey W;
	private int f[];
	private MessageDigest sha;

	private BigInteger[] ECSP_DSA() {
		BigInteger sig[] = { BigInteger.valueOf(0), BigInteger.valueOf(0)};
		MRSAPrivKey u;
		MRSAPubKey V;
		while ((sig[0].compareTo(BigInteger.valueOf(0)) == 0)
			|| (sig[1].compareTo(BigInteger.valueOf(0)) == 0)) {
			u = new MRSAPrivKey(s.dp);
			V = new MRSAPubKey(u);
			sig[0] = Utils.OS2IP(Utils.FE2OSP(V.W.x)).mod(s.dp.r);
			BigInteger uinv = u.s.modInverse(s.dp.r);
			BigInteger temp =
				Utils.OS2IP(f).add(s.s.multiply(sig[0]).mod(s.dp.r)).mod(s.dp.r);
			sig[1] = (uinv.multiply(temp)).mod(s.dp.r);
		}

		return sig;
	}

	private boolean ECVP_DSA() {
		if (!(((BigInteger.valueOf(1).compareTo(c) <= 0)
			& (c.compareTo(W.dp.r) < 0))
			& ((BigInteger.valueOf(1).compareTo(d) <= 0)
				& (d.compareTo(W.dp.r) < 0))))
			return false;

		BigInteger h = d.modInverse(W.dp.r);
		BigInteger h1 = Utils.OS2IP(f).multiply(h).mod(W.dp.r);
		BigInteger h2 = c.multiply(h).mod(W.dp.r);

		MRSAPoint P = W.dp.E.add(W.dp.E.mul(h1, W.dp.G), W.dp.E.mul(h2, W.W));

		if (P.isZero())
			return false;

		BigInteger i = Utils.OS2IP(Utils.FE2OSP(P.x)).mod(W.dp.r);
		if (c.compareTo(i) == 0)
			return true;
		else
			return false;
	}

	public MRSADSA() {
	}

	public MRSADSA(BigInteger c, BigInteger d) {
		this.c = c;
		this.d = d;
	}

	public void initSignature(MRSAPrivKey s) throws NoSuchAlgorithmException {
		sha = MessageDigest.getInstance("SHA");
		this.s = (MRSAPrivKey) s.clone();
	}

	public void initVerify(MRSAPubKey W) throws NoSuchAlgorithmException {
		sha = MessageDigest.getInstance("SHA");
		this.W = (MRSAPubKey) W.clone();
	}

	public void update(byte[] data) {
		sha.update(data);
	}

	public void sign() {
		f = Utils.revIntArray(Utils.toIntArray(sha.digest()));
		BigInteger[] sig = ECSP_DSA();
		c = sig[0];
		d = sig[1];
	}

	public boolean verify() {
		f = Utils.revIntArray(Utils.toIntArray(sha.digest()));
		return ECVP_DSA();
	}

	public String toString() {
		String str = new String("c:").concat(c.toString(16)).concat("\n");
		str = str.concat("d:").concat(d.toString(16)).concat("\n");

		return str;
	}

	protected Object clone() {
		return new MRSADSA();
	}

}
