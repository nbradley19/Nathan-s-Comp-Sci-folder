
public class testTriangle {

	public static void main(String[] args) {

		Triangle tABC = new Triangle(new Point(5, 2), new Point(7, 3), new Point(-1, 6));
		System.out.println(tABC);
		Triangle tDEF = new Triangle(new Point(-2, 8), new Point(-5, 1), new Point(1, 1));
		System.out.println(tDEF);
		System.out.println(tABC);
		tABC.reflect('x');
		System.out.print(tABC);
		tABC.dilate(-3.5);
		System.out.println(tABC);
		tABC.getArea();
		System.out.println(tABC);
		tABC.getPerimeter();
		System.out.println(tABC);
		tABC.rotate(90);
		System.out.println(tABC);

	}

}
