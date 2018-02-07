
/*
 * @author Nathan Bradley
 * Date:10/18
 * Assignment: MathTutor
 */
import java.util.Random;
import java.util.Scanner;
public class MathTutor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1, num2, answer = 0;
        int i = (int)(3 * Math.random() + 1);
        num1 = (int)(9 * Math.random() + 1);
        num2 = (int)(9 * Math.random() + 1);
        
        if(i == 1) {
        	System.out.println("What is " + num1 + " * "  + num2 + "?");
        	answer = sc.nextDouble();
        	}
        else if(i == 2){
        	System.out.println("What is " + num1 + " / " + num2 + "?");
        	answer = sc.nextDouble();
        }
        else if(i == 3) {
        	System.out.println("What is " + num1 + " + " + num2 + "?");
        	answer = sc.nextDouble();
        }
        else if(i == 4) {
        	System.out.println("What is " + num1 + " - " + num2 + "?");
        	answer = sc.nextDouble();
        }
        else if(i == 5) {
        	System.out.println("What is " + num1 + " % " + num2 + "?");
        	answer = sc.nextDouble();
        }
        if(i == 1) {
        	if(answer == (num1 * num2)) {
        		System.out.println("Correct!");
        	}
        	else
        		System.out.println("Try again!");
        }
        else if(i == 2) {
        	if (answer == (num1 / num2)) {
        		System.out.println("Correct!");
        	}
        	else
        		System.out.println("Try again!");
        }
        else if(i == 3) {
        	if (answer == (num1 + num2)) {
        		System.out.println("Correct!");
        	}
        	else
        		System.out.println("Try again!");
        }
        else if(i == 4) {
        	if (answer == (num1 - num2)) {
        		System.out.println("Correct!");
        	}
        	else
        		System.out.println("Try again!");
        }
        else if(i == 5) {
        	if (answer == (num1 % num2)) {
        		System.out.println("Correct!");
        	}
        	else
        		System.out.println("Try again!");
        }
    }
}