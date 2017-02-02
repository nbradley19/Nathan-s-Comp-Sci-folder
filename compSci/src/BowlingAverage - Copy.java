/*
Nathan Bradley
Week of 1/3/17
Program to find the average of three games of bowling
 */

import java.util.Scanner;

public class BowlingAverage{

    public static void main (String [] args){

        int game1, game2, game3; // Variables which will be used
        double average;

        Scanner sc = new Scanner(System.in);
        //code goes here for entering 3 valid scores
        System.out.println("What was your score for game 1?");
        game1 = sc.nextInt();
        while(game1 < 0 || game1 > 300){
            System.out.println("You are lying. Re-enter.");
            System.out.println("What was your score for game 1?");
            game1 = sc.nextInt();
        }
        System.out.println("What was your score for game 2?");
        game2 = sc.nextInt();
        while(game2 < 0 || game2 > 300){ // 0 > game2 > 300
            System.out.println("You are lying. Re-enter.");
            System.out.println("What was your score for game 2?");
            game2 = sc.nextInt();
        }
        System.out.println("What was your score for game 3?");
        game3 = sc.nextInt();
        while(game3 < 0 || game3 > 300){
            System.out.println("You are lying. Re-enter.");
            System.out.println("What was your score for game 3?");
            game3 = sc.nextInt();
        }

        average = calcAverage(game1, game2, game3);
        //code goes here
        // print the output
        System.out.println("Your score was " + average);
        // code goes here
    }

    /**
     * Method which finds the average of three games of bowling
     * 
     * @param  a, b, and c represent each game bowled
     * @return   the average of the three games 
     */
    public static double calcAverage(int a, int b, int c){
        double average =(a + b + c) / 3.0;
        average = Math.round(100 * average) / 100.0;
        return average;

    }
}
