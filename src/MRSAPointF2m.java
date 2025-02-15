


import java.io.Serializable;


public class MRSAPointF2m extends MRSAPoint implements Serializable{
	/**
	 * Construct a new point P = O the point at infinity
	 */
	public MRSAPointF2m() {
		x = new F2m();
		y = new F2m();
	}

	/**
	 * Construct a new point P = (x, y) on the curve 
	 * @param x : the x coordinate of the point
	 * @param y : the y coordinate of the point
	 */
	public MRSAPointF2m(F2m x, F2m y) {
		this.x = (F2m) x.clone();
		this.y = (F2m) y.clone();
	}

	/**
	 * Returns the additive inverse of this point (-P).
	 */
	public MRSAPoint negate() {
		return new MRSAPointF2m((F2m) x, (F2m) y.add(x));
	}

	protected Object clone() {
		return new MRSAPointF2m((F2m) x, (F2m) y);
	}
}
