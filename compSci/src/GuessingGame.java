/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, p;
        n = (int)(20 * Math.random() + 1);
        System.out.println("Enter a number between 1 and 20: ");
        p = sc.nextInt();
        System.out.println("Computer's Number: " + n);
        System.out.println("Player's Number: " + p);
        if(n == p){
            System.out.println("You Won!");
        }
        else{
            System.out.println("Better luck next time!");
        }
        
        
        
    }
}