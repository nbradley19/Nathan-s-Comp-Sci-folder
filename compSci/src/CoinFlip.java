
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class CoinFlip{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, countH = 0;
        double flip, pctH;
        System.out.print("Enter the number of times you want to flip the coin: ");
        n = sc.nextInt();
        while(n > 0){
            for(int i = 1; i <= n; i++){
                flip = Math.random();
                if(flip < .5){
                    countH++;
                    if(n <= 25)
                        System.out.print("H ");
                }
                else{
                if(n <= 25)
                    System.out.print("T ");
                }
            }
        
        pctH = 100.0 * countH / n;
        System.out.println("Number of heads: " + countH + " (" + pctH + "%)");
        System.out.println("Number of Tails: " + (n - countH) + " (" + (100 - pctH + "%)"));
        
        System.out.print("\n\nEnter the number of times you want to flip the coin: ");
        n = sc.nextInt();
        countH = 0;
    }
    }
}