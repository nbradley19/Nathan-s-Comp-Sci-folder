/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */

public class testPoint{
    public static void main(String[] args){
       Point p1 = new Point(); // p1 is the origin
       Point p2 = new Point(5, 8);
       Point p3 = new Point(-3.5, 3.75);
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       double x = Math.sqrt(p2.getX() * p2.getX() + p2.getY() * p2.getY());
       //System.out.println(Math.round(x));
        System.out.println(x);
    }
}