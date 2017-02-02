/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class Prints{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCopies;
        System.out.println("Enter the number of copies to be printed: ");
        numCopies = sc.nextInt();
        if (numCopies < 100){
            System.out.println("Price per copy is : $0.30");
            System.out.println("Total cost is : " + numCopies * .30);
        }
        else if (numCopies < 500){
            System.out.println("Price per copy is : $0.28");
            System.out.println("Total cost is : " + numCopies * .28);
        }
        else if (numCopies < 750){
            System.out.println("Price per copy is : $0.27");
            System.out.println("Total cost is : " + numCopies * .27);
        }
        else if (numCopies < 1000){
            System.out.println("Price per copy is : $0.25");
            System.out.println("Total cost is : " + numCopies * .25);
        }
    }
}