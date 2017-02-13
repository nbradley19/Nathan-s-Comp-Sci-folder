//Triangle class will create triangles which we can do various calculations, classifications, and transformations on.



import java.awt.Point;

public class Triangle {
	private Point pA;
	private Point pB;
	private Point pC;

	public Triangle(Point pX, Point pY, Point pZ) {
		pA = pX;
		pB = pY;
		pC = pZ;

	}

	// @param pA, pB, or pC
	// @return the desired point
	public String toString() {
		return "Triangle ABC:	A: " + pA + "	B: " + pB + "	C: " + pC;
	}

	public Point getA() {
		return pA;
	}

	public Point getB() {
		return pB;
	}

	public Point getC() {
		return pC;
	}
	public Point getSide(){
		return pB;
	}
}