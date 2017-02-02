
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class GuessingGameTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,p;
        int counter = 0;
        n = (int)(100 * Math.random() + 1);
        System.out.println("Enter a number between 1 and 100: ");
        do{
            p = sc.nextInt();
            if(n == p)
                   System.out.println("Correct");
                   else if(n < p)
                   System.out.println("Too high. Try again.");
                   else
                   System.out.println("Too low. Try again.");
                   counter++;
        }while(n != p);  
        System.out.println("Number of attempts " + counter); 
    }
}