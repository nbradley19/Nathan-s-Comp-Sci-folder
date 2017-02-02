
public class Point {
	double x, y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//parameterless constructor for objects of class point
	public Point(){
		
		
		
	}
	//constructor with parameters for objects of class point
	public Point(double x1, double y1){
		//initialise instance variables
		x = x1;
		y = y1;
		
	}
	public String toString(){
		return "(" + x + ", " + y + ")";
		
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
		
	}
}
