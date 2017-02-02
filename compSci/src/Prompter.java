
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class Prompter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min, max, guess;
        int counter = 0;
        System.out.println("Enter an integer: ");
        min = sc.nextInt();
        System.out.println("Enter an integer larger than the first: ");
        max = sc.nextInt();
        while(max <= min + 1){
            System.out.println("Must be at least 2 larger than " + min + ". Try again.");
            max = sc.nextInt();
        }
        do{
           System.out.print("Enter an integer between " + min + " and " + max + " : ");
           guess = sc.nextInt();
        }while(guess <= min || guess >= max);
        System.out.println("Correct");
                  
        } 
    }

    
