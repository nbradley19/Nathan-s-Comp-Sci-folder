
/**
 * @author Nathan Bradley
 * Date: 
 * Assignment:
 */
import java.util.Scanner;
public class PrompterNB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int min, max, mid = 0;
        int counter = 0;
        System.out.println("Enter a min: ");
        min = sc.nextInt();
        System.out.println("Enter a max: ");
        max = sc.nextInt();
        do {
        	System.out.println("Enter a number between " +  min +  " and " +  max + ": ");
     		mid = sc.nextInt();
     		if(min < mid && mid < max) {
         		System.out.println("Good Work!");
         		System.out.println("Number of fails: " + counter);
         	}
     		else {
     			System.out.println("Min needs to be less than max");
     			counter++;
     		}
       	
        	 
            } while (max > min);
        
        	
        } 
       
    }
