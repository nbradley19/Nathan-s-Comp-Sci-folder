
/**
 * @author Nathan Bradley
 * Date: 9/27/17
 * Assignment:Average of 5 grades
 */
import java.util.Scanner;
public class GradeAve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade1, grade2, grade3, grade4, grade5;
        double average;
        System.out.println("Enter Grade 1: ");
        grade1 = sc.nextInt();
        System.out.println("Enter Grade 2: ");
        grade2 = sc.nextInt();
        System.out.println("Enter Grade 3: ");
        grade3 = sc.nextInt();
        System.out.println("Enter Grade 4: ");
        grade4 = sc.nextInt();
        System.out.println("Enter Grade 5: ");
        grade5 = sc.nextInt();
        average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5.0;
        System.out.println("Average: " + average);
        
    }
}


