


import java.io.Serializable;
import java.math.BigInteger;


public class MRSACurveF2m extends ECurve implements Serializable {

	public MRSACurveF2m(F2m a4, F2m a6) 
	{
		System.out.println("A4"+a4+"   a6"+a6);
		
		this.a4 = (F2m) a4.clone();
		this.a6 = (F2m) a6.clone();
	}

	public MRSAPoint add(MRSAPoint P0, MRSAPoint P1) {
		BigInteger a, b, lambda, x0, y0, x1, y1, x2, y2;
		a = a4.val;
		b = a6.val;
		x0 = P0.x.val;
		y0 = P0.y.val;
		x1 = P1.x.val;
		y1 = P1.y.val;

		MRSAPointF2m P2 = new MRSAPointF2m();

		if (P0.isZero())
			return P1;

		if (P1.isZero())
			return P0;

		if (P0.x.compareTo(P1.x) != 0) {
			lambda =
				F2m.F2x_mul(
					F2m.F2x_add(y0, y1),
					F2m.F2x_inv(F2m.F2x_add(x0, x1)));
			x2 = F2m.F2x_add(a, F2m.F2x_mul(lambda, lambda));
			x2 = F2m.F2x_add(x2, lambda);
			x2 = F2m.F2x_add(x2, x0);
			x2 = F2m.F2x_add(x2, x1);
		} else if (P0.y.compareTo(P1.y) != 0) {
			return P2;
		} else if (P1.x.isZero()) {
			return P2;
		} else {
			lambda = F2m.F2x_add(x1, F2m.F2x_mul(y1, F2m.F2x_inv(x1)));
			x2 = F2m.F2x_add(a, F2m.F2x_mul(lambda, lambda));
			x2 = F2m.F2x_add(x2, lambda);
		}

		y2 = F2m.F2x_mul(F2m.F2x_add(x1, x2), lambda);
		y2 = F2m.F2x_add(y2, x2);
		y2 = F2m.F2x_add(y2, y1);

		P2.x.val = x2;
		P2.y.val = y2;
		return P2;
	}

	/**
	 * Based on Algorithm IV.1 on p. 63 of "Elliptic Curves in Cryptography"
	 * by I. F. Blake, G. Seroussi, N. P. Smart.
	 */
	public MRSAPoint mul(BigInteger n, MRSAPoint P) {
		MRSAPoint Q;
		MRSAPoint S = new MRSAPointF2m();
		BigInteger k;

		if (n.compareTo(BigInteger.valueOf(0)) == 0)
			return new MRSAPointF2m();

		if (n.compareTo(BigInteger.valueOf(0)) < 0) {
			k = n.negate();
			Q = P.negate();
		} else {
			k = n;
			Q = P;
		}

		for (int j = k.bitLength() - 1; j >= 0; j--) {
			S = add(S, S);
			if (k.testBit(j)) {
				S = add(S, Q);
			}
		}

		return S;
	}

	protected Object clone() {
		return new MRSACurveF2m((F2m) a4, (F2m) a6);
	}

}
