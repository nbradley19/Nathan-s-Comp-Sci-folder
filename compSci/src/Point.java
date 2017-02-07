
public class Point {
	double x, y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// parameterless constructor for objects of class point
	public Point() {

	}

	// constructor with parameters for objects of class point
	public Point(double x1, double y1) {
		// initialise instance variables
		x = x1;
		y = y1;

	}

	public String toString() {
		return "(" + x + ", " + y + ")";

	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;

	}

	// Mutator for x
	public void setX(double x1) {
		x = x1;
	}

	// Mutator for y
	public void setY(double y1) {
		y = y1;

	}

	public boolean equals(Point p) {
		return (p.x == x && p.y == y);

	}
	public void location(){
		if(x > 0.0 && y > 0.0){
			System.out.println("Quadrant I");
		}
		else if(x < 0.0 && y > 0.0){
			System.out.println("Quadrant II");
		}
		else if(x < 0.0 && y < 0.0){
			System.out.println("Quadrant III");
		}
		else if(x > 0.0 && y < 0.0){
			System.out.println("Quadrant IV");
		}
		else if (x == 0.0 && y != 0){
			System.out.println("x-axis");
		}
		else if (y == 0.0 && x != 0){
			System.out.println("y-axis");
		}
		else if (y == 0.0 && x == 0.0){
			System.out.println("Origin");
		}
	}
	public double slope(Point p){
		return (y - p.y) / (x - p.x);
	}
	public Point midpoint(Point p){
		return new Point((x + p.x) / 2, (y + p.y) / 2);
		
	}
	public double distance(Point p){
		return Math.sqrt(((x - p.x) * (x - p.x)) + ((y - p.y) * (y - p.y)));
	}
	//dilates point from origin with given scale factor
	public void dilate(double k){
		x = k * x;
		y = k * y;
	}

}
