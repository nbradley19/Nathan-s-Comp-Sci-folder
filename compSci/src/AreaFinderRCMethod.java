/**
 *@author Nathan Bradley
 *Date: 11/16/16
 *Assignment: Area Finder
 */

import java.util.Scanner;

public class AreaFinderRCMethod{
    public static void main(String[] args){
        String shape, units;
        double radius, length, width, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of a shape: ");
        shape = sc.next();
        while(!shape.equals("quit")){
            if(shape.equalsIgnoreCase("circle")){
                System.out.print("What is the radius?: ");
                while(!sc.hasNextDouble()){
                    sc.next();
                    System.out.print("Please enter a real number for the radius: ");
                }
                radius = sc.nextDouble();
                System.out.print("What are the units?: ");
                units = sc.next();
                area = Math.PI * radius * radius;
                System.out.println("The area is " + area + " square " + units); 
            }
            else if(shape.equalsIgnoreCase("rectangle")){
                System.out.print("What is the length?: ");
            }
        }
    }
    public static double round2(
}
            