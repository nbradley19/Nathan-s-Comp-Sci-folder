/**
 * @author Nathan Bradley Date: Assignment:
 */

public class testPoint {
	public static void main(String[] args) {
		Point p1 = new Point(); // p1 is the origin
		Point p2 = new Point(5, 8);
		Point p3 = new Point(-3.5, 3.75);
		Point p4 = new Point(-3.5, 3.75);
		Point p5 = p4;
		Point p6 = new Point(-3.5, 10);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		double x = Math.sqrt(p2.getX() * p2.getX() + p2.getY() * p2.getY());
		// System.out.println(Math.round(x));
		System.out.println(x);
		// p2.setX(4.8);
		// p2.setY(7.8);
		System.out.println(p2);
		System.out.println(p2.equals(p3) + " should be false");
		System.out.println(p4.equals(p3) + " should be true");
		p1.location();
		p2.location();
		p3.location();
		System.out.println(p2.slope(p3));
		System.out.println(p3.slope(p6));
		System.out.println();

		// System.out.println("Dilation of (5,8) with a scale factor of .5");
		// System.out.println("Translation of  of (5,8) right 2, down 5");
		// System.out.println("Rotation of (5,8) 90 degrees");
		// System.out.println("Rotation of (5,8) 180 degrees");
		// System.out.println("Rotation of (5,8) 270 degrees");
		// System.out.println("Translation of of (5,8) right 2, down 5");
		// System.out.println("Reflection of (5,8) over the x-axis");
		System.out.println("Reflection of (5,8) over the y-axis");
		// p2.dilate(.5);
		// p2.translate(2, -5);
		// p2.rotate90();
		// p2.rotate180();
		// p2.rotate270();
		// p2.reflect('x');
		p2.reflect('y');
		System.out.println(p2);

	}
}