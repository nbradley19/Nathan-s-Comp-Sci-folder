
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class EvenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a Positive Integer: ");
        num = sc.nextInt();
        if(num % 2 == 0) {
        	System.out.println(num + " is even.");
        }
        else if(num % 2 != 0) {
        	System.out.println(num + " is odd.");
        }
        
    }
}