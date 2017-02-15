
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
		return "Triangle ABC:	A: " + pA + "	B: " + pB + "	C: " + pC + "\nPerimeter: " + getPerimeter();

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

	public Point getVertex(int num) {
		if (num == 1)
			return pA;
		else if (num == 2)
			return pB;
		else
			return pC;

	}

	public double getPerimeter() {
		return pA.distance(pB) + pB.distance(pC) + pC.distance(pA);
	}

	public double getArea() {

		double s = getPerimeter() / 2;
		double area = Math.sqrt(s * (s - pB.distance(pC))) * (s - pC.distance(pA)) * (s - pA.distance(pB));
		return area;

	}

	public String classify() {
		double a, b, c;
		a = pB.distance(pC);
		b = pA.distance(pC);
		c = pB.distance(pA);
		if (getArea() == 0) {
			return "Not a triangle";
		}
		if (a == b && b == c)
			return "Equilateral";

		else if (a == b || b == c || a == c)
			return "isosceles";
		else
			return "Scalene";

	}

	// mutator method to change a vertex
	public void setVertex(int num, Point p) {
		if (num == 1)
			pA = p;
		else if (num == 2)
			pB = p;
		else
			pC = p;
			
	}

	public void dilate(double sf) {
		pA.dilate(sf);
		pB.dilate(sf);
		pC.dilate(sf);
		
	}

	public void rotate(int degrees) {

	}

	public void reflect(char axis) {

	}
}