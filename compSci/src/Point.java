
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
	public double setX(double x1) {
		return x1;
	}

	// Mutator for y
	public double setY(double y1) {
		return y1;

	}

	public boolean equals(Point p) {
		return (p.x == x && p.y == y);

	}
	public void location(){
		if(x > 0 && y > 0){
			System.out.println("Quadrant I");
		}
		else if(x < 0 && y > 0){
			System.out.println("Quadrant II");
		}
		else if(x < 0 && y < 0){
			System.out.println("Quadrant III");
		}
		else if(x > 0 && y < 0){
			System.out.println("Quadrant IV");
		}
		else if (x == 0){
			System.out.println("x-axis");
		}
		else if (y == 0){
			System.out.println("y-axis");
		}
	}

}
