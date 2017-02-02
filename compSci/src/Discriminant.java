
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class Discriminant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        double d;

        System.out.println("Enter the value for a: ");
        a = sc.nextInt();

        System.out.println("Enter the value for b: ");
        b = sc.nextInt();

        System.out.println("Enter the value for c: ");
        c = sc.nextInt();
        d = Math.pow(b,2) - 4 * a * c;
        if(d < 0){
            System.out.println("No roots");
        }
        else if(d == 0){
            System.out.println("One root");
        }
        else if(d > 0){
            System.out.println("Two Roots");
        }

    }
}