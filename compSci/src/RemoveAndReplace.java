/**
 *@author 
 *Date: 12/1/16
 *Assignment: Remove and replace vowels from a phrase
 */

import java.util.Scanner;

public class RemoveAndReplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String phrase = "";
        System.out.println("Enter a phrase (stop to quit):");
        phrase = sc.nextLine();
        while(!phrase.equals("stop")){
            System.out.println();
            System.out.println(removeVowels(phrase));
            System.out.println();
            System.out.println(replaceVowels(phrase));
            System.out.println("\nEnter a phrase (stop to quit):");
            phrase = sc.nextLine();
        }
    }

    /**
     * Method which removes all lowercase vowels from a phrase
     * 
     * @param   any String
     * @return  the String with vowels removed
     */
    public static String removeVowels(String str){
        String s = "";
        
        return s;
    }
    
    public static String replaceVowels(String str){
        String s = "";
        for(int i = 0; i < s.length(); i++){
            if(str.charAt(i) == 'a')
                s += '@';
            else if(str.charAt(i) == 'e')
                s += '3';
        }
        
    }
}