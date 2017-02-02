
/**
 * @author Nathan Bradley
 * Date:11/01/16
 * Assignment: Loop Project
 */
import java.util.Scanner;
public class LoopProjectNB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min, max;
       
        int sum = 0, i;
        System.out.print("Enter a positive integer: ");
        min = sc.nextInt();
        while(min <= 0) {
            System.out.print("Try again! Enter a positive integer: ");
            min = sc.nextInt();
        }
        System.out.print("Now enter a larger integer: ");
        max = sc.nextInt();
        while(max <= min) {
            System.out.print("Too small! Enter an integer larger than " + min + ": ");
            max = sc.nextInt();
        }
        System.out.println();
        System.out.println("Here are the odd numbers between " + min + " and " + max + " that are not divisible by 3 or 5: ");
        for(i = min + 1; i < max; i++){
            if(i % 3 == 0){
            }
            else if(i % 5 == 0){
            }
            else if(i % 2 == 0){
            }
            else{
                System.out.print(i + " ");
                sum += i;
                
            }
        }
        System.out.println();
        if(sum == 0){
            System.out.println("None exist");
            
        }
        else{
            System.out.println("Their sum is " + sum);
            
        }
        
        

    }
}
