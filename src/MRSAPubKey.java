


import java.io.Serializable;


public class MRSAPubKey implements Serializable
{
	/**
	 * The EC Domain Parameters
	 */
	public MRSADomainParameters dp; // the EC domain parameters for this key pair

	/**
	 * The public key
	 */
	public MRSAPoint W; // the public key

	/**
	 * Generate a public key from private key sk
	 */
	public MRSAPubKey (MRSAPrivKey sk)
	{
		dp = (MRSADomainParameters)sk.dp.clone();
		W = dp.E.mul (sk.s, dp.G);
	}
	
	/**
	 * Generate a public key with ECDomainParameters dp
	 * and public key W
	 */
	public MRSAPubKey (MRSADomainParameters dp, MRSAPointF2m W)
	{
		this.dp = (MRSADomainParameters)dp.clone();
		this.W = (MRSAPointF2m)W.clone();
	}

	public String toString()
	{
		String str = new String("dp: ").concat(dp.toString()).concat("\n");
		str = str.concat("W: x:").concat(W.x.toString()).concat("\n");
		str = str.concat("   y:").concat(W.y.toString()).concat("\n");
		return str;

	}

	protected Object clone()
	{
		return new MRSAPubKey(dp, (MRSAPointF2m)W);
	}

}
