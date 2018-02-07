
/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class CountVowelsNB{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = "";
        int count = 0;
        System.out.print("Enter text: ");
        s = sc.nextLine();
        for(int i = 0; i < s.length(); i ++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A' ||
            s.charAt(i) == 'e' || s.charAt(i) == 'E' ||
            s.charAt(i) == 'i' || s.charAt(i) == 'I' ||
            s.charAt(i) == 'o' || s.charAt(i) == 'O' ||
            s.charAt(i) == 'u' ||s.charAt(i) == 'U'){
               count++; 
            }
        }
        System.out.println("The number of vowels in " + s + " is: " + count);
        
        
    }
}