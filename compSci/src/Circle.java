
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
		return "The radius of the Circle is " + radius + " and the circumference is " + circumference();
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

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double circumference() {
		return (2 * Math.PI * radius);
	}

}
