
package javaapplication3;
import java.util.Scanner;

/**
 *
 * @author LUCIE
 */
public class JavaApplication3 {

    public static void main(String[] args) {
       TwoNumbers object1 = new TwoNumbers (12,18);
       TwoNumbers object2 = new TwoNumbers (17,17);
       
       System.out.println(object1);
       System.out.println(object2);
       
       object1.addNumbers(5, 14);
       
        System.out.println(object1);
        
        object2.addObject(object1);
        
       System.out.println(object1);
       System.out.println(object2);
       
       TwoNumbers c = object1.Sum(object2);
       System.out.println(object1);
       System.out.println(object2);
       System.out.println(c);
       
        
    }
    
}
