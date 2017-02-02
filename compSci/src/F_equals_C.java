
/**
 * @author Nathan Bradley
 * Date:10/04/16
 * Assignment: Degrees Converter
 */

public class F_equals_C{
    public static void main(String[] args){
        double degreesF = 1;
        double degreesC;
        degreesC = (degreesF - 32) / 1.8 ;
        System.out.println(degreesF + " degrees F is " + degreesC + " degrees C");
        if(degreesC == degreesF){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
       
    }
    }
}
