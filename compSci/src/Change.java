
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class Change{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cents, quarters, dimes, nickels, pennies;
        System.out.println("Enter the change in cents: ");
        cents = sc.nextInt();
        System.out.println(); //skip a line
        System.out.println("The minimum number of coins is:");
        quarters = cents / 25;
        System.out.println("\tQuarters: " + quarters);
        cents %= 25; //remaining change is cents %25
        dimes = cents / 10;
        System.out.println("\tDimes: " + dimes);
        cents %= 10;
        nickels = cents / 5;
        System.out.println("\tNickels: " + nickels);
        cents %= 5;
        pennies = cents / 1;
        System.out.println("\tPennies: " + pennies);
        cents %= 1;
    }
}