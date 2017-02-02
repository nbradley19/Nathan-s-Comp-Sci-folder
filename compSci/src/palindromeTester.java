
/**
 * @author Nathan Bradley
 * Date:12/06/16
 * Assignment:PalindromeTester
 */
import java.util.Scanner;
public class palindromeTester{
    public static void main(String[] args){

        String phrase = "";
        phrase = enterPhrase();

        while(!phrase.equals("stop")){ 
            phrase = scrub(phrase);
            if(isPalindrome(phrase)){
                System.out.println("***** Palindrome! *****");
            }
            else{
                System.out.println("*** Not a palindrome! ***");
            }
            drawDottedLine();
            phrase = enterPhrase();
        }
    }

    public static String enterPhrase(){
        Scanner sc = new Scanner(System.in);
        String phrase;
        System.out.println("Enter a phrase: ");
        phrase = sc.nextLine();
        while(phrase.trim().length() == 0){
            System.out.println("Please enter something: ");
            phrase = sc.nextLine();
        }
        return phrase;
    }

    public static String scrub(String phrase){

        phrase = phrase.replace(" ", "");
        phrase = phrase.replace(",", "");
        phrase = phrase.replace(".", "");
        phrase = phrase.replace("-", "");
        phrase = phrase.replace("?", "");
        phrase = phrase.replace("!", ""); 
        phrase = phrase.replace("'", "");
        phrase = phrase.toLowerCase();
        return phrase;
    }

    public static boolean isPalindrome(String phrase){

        int n = phrase.length();
        for(int i = 0; i < (n/2); i++){
            if(phrase.charAt(i) != phrase.charAt(n - 1 - i))
                return false;

        }
        return true;
    }

    public static void drawDottedLine(){
        System.out.println("------------------------");

    }
}
/**
*Enter a phrase: 
*Rise to vote, sir
****** Palindrome! *****
*------------------------
*Enter a phrase: 
*duck
**** Not a palindrome! ***
*------------------------
*Enter a phrase: 
*Go hang a salami, I'm a lasagna hog!
****** Palindrome! *****
*------------------------
*Enter a phrase: 
*donut
**** Not a palindrome! ***
*------------------------
*Enter a phrase: 
*racecar
****** Palindrome! *****
*------------------------
*Enter a phrase: 
*bob
****** Palindrome! *****
*------------------------
*Enter a phrase: 
*da
**** Not a palindrome! ***
*------------------------
*Enter a phrase: 
*dad
****** Palindrome! *****
*------------------------
*Enter a phrase: 
*stop
*/