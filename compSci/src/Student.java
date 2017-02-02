
//Write a description of class Student here.

//@author Nathan Bradley 
//@version (a version number or a date)

public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int grade, test1, test2, test3;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        firstName = "John";
        lastName = "Doe";
        grade = 0;
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    public Student(Student stu){
        firstName = stu.firstName;// = stu.getFirstName();
        lastName = stu.lastName;
        grade = stu.grade;
        test1 = stu.test1;
        test2 = stu.test2;
        test3 = stu.test3;
        System.out.println(stu.firstName);

        
    }
    
    //copy constructor
    public Student(String first, String last, int gr, int t1, int t2, int t3){
        firstName = first;
        lastName = last;
        grade = gr;
        test1 = t1;
        test2 = t2;
        test3 = t3;

        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return "Name: " + lastName + ", " + firstName + "\nGrade: " + grade + "\nTest 1 = " + test1 +
        "\nTest 2 = " + test2 + "\nTest 3 = " + test3;

    }
    //accessor method for firstName
    public String getFirstName(){
    	
    	return firstName;
    }
    public String getLastName(){
    	return lastName;
    	
    }
    public int getGrade(){
    	return grade;
    	
    }
   // public int getScore(int )
    public double average(){
    	return (test1 + test2 + test3) / 3.0;
    }
    public int median(){
    	if((test1 > test2 && test1 < test3) || (test1 < test2 && test1 > test3))
    		return test1;
    
    	else if((test2 > test1 && test2 < test3) || (test2 < test1 && test2 > test3))
    		return test2;
    	else
    		return test3;
    }
    
}
