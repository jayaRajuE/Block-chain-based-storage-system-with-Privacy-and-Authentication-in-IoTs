




import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;


public class MRSAPrivKey implements Serializable{
	/**
	 * The EC Domain Parameters
	 */
	public MRSADomainParameters dp;

	/**
	 * The Private Key
	 */
	public BigInteger s;

	/**
	 * Generate a random private key with ECDomainParameters dp
	 */
	public MRSAPrivKey(MRSADomainParameters dp)
	{
		
		this.dp = (MRSADomainParameters) dp.clone();
		SecureRandom rnd = new SecureRandom();
		s = new BigInteger(dp.m, rnd);
		s = s.mod(dp.r);
	}

	/**
	 * Generate a private key with ECDomainParameters dp
	 * and private key s
	 */
	public MRSAPrivKey(MRSADomainParameters dp, BigInteger s) 
	{
		this.dp = dp;
		this.s = s;
	}

	public String toString() {
		String str = new String("dp: ").concat(dp.toString()).concat("\n");
		str = str.concat("s: ").concat(s.toString()).concat("\n");
		return str;
	}

	protected Object clone() {
		return new MRSAPrivKey(dp, s);
	}

}
