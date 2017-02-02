/**
 * @author Nathan Bradley
 * Date:
 * Assignment:HiLo Game
 */
import java.util.Scanner;
public class HiLoGame{
    public static void main(String[] args){
        int points = 1000;
        int num, guess, bet; 
        String play;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("You have " + points + " points.\n");
        while(points < 0){
            //prompt, generate random number, guess high or low, win or lose
            System.out.print("Play again? ");
            play = sc.next();
            if(play == 'n')
                break;
            
        }
        
    }
}