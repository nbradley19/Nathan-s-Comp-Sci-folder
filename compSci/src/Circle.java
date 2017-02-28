
public class Circle {
	private Point center;
	private double radius;

	public Circle() {
		center = new Point();
		radius = 1;
	}

	public Circle(Point p, double r) {
		// constructor
		center = p;
		radius = r;
	}

	public String toString() {
		return "";
	}

	public Point getCenter() {
		return center;
	}

	public double getRadius() {
		return radius;
	}

	public void setCenter(Point p) {
		center = p;
	}

	public void setRadius(double r) {
		radius = r;
	}

	public double area(double r) {
		return Math.pow((Math.PI * r), 2);
	}

	public double circumference(double r) {
		return (2 * Math.PI * r);
	}

}
