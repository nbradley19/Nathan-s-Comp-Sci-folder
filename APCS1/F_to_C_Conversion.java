import java.util.Scanner;

/**
 * @author Nathan Bradley
 * Date: 9/27/17
 * Assignment: Degrees Converter
 */

public class F_to_C_Conversion{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int degreesF;
        System.out.println("Enter the Degrees in Farenheit: ");
        degreesF = sc.nextInt();
        double degreesC;
        degreesC = (degreesF - 32) / 1.8 ;
        System.out.println(degreesF + " degrees F is " + degreesC + " degrees C");

    }
}
