

/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */
import java.util.Scanner;
public class CountVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phrase;
        int count = 0;
        System.out.println(" Enter text (stop to quit): ");
        phrase = sc.nextLine();
        while(!phrase.equals("stop") && !phrase.equals("STOP")){
            for(int i = 0; i < phrase.length(); i ++){
                if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A' ||
                phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E' ||
                phrase.charAt(i) == 'i' || phrase.charAt(i) == 'I' ||
                phrase.charAt(i) == 'o' || phrase.charAt(i) == 'O' ||
                phrase.charAt(i) == 'u' ||phrase.charAt(i) == 'U'){
                   count++; 
                }
            }
            
            System.out.println("The number of vowels in " + phrase + " is " + count);
            System.out.println();
            System.out.println(" Enter text (stop to quit): ");
            phrase = sc.nextLine();
            
            count = 0;
    }
}
}