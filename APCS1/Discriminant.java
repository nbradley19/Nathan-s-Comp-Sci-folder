
/**
 * @author Nathan Bradley
 * Date:
 * Assignment: Discriminant
 */
import java.util.Scanner;
public class Discriminant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        double disc;
        System.out.println("Enter the value for a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value for b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value for c: ");
        c = sc.nextDouble();
        disc  = (b * b) - 4 * a * c;
//        System.out.println(disc);
        if(disc >  0.000001) {
        	System.out.println("Two roots");
        }
        else if(Math.abs(disc) <= 0.000001) {
        	System.out.println("One root");
        }
        else {
        	System.out.println("No Roots");
        }
        	
        
    }
}