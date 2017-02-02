/**
 * @author Nathan Bradley
 * Date:
 * Assignment:
 */

public class testStudent{
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1);
        Student s2 = new Student("Tyrone", "Shoelace", 9, 88, 99, 76);
        System.out.println(s2);
        Student s3 = new Student(s2);
        System.out.println();
        System.out.println(s3);
        System.out.println(s1.getFirstName());
        System.out.println(s1.getLastName());
        System.out.println(s2.getGrade());
        
        
    }
}