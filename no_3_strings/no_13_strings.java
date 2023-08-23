package no_3_strings;
import java.util.Scanner;

/**
 * no_13_strings
 */
public class no_13_strings {

    public static void main(String[] args) {
        //   String name = new String("my name is raj patil");
        // String name = " my name is raj patil";  //it is also method for print string ...
        // System.out.print(" and and also divesh");
        // System.out.println(name);
        
        // int a = 6;
        // float b = 5.6454f;
        // System.out.printf("the value of a is %d and value of of b is %f" , a ,b); //---->(here, both ARE
        // System.out.format("the value of a is %d and value of of b is %f" , a ,b); //----->  SAME)
       
    // -----> input string frm user <-----
        Scanner sc = new Scanner(System.in);
        System.out.print("enter ur name : ");
        String str = sc.nextLine(); // ( and sc.next(); for single word )
        System.out.println(str);


        

    
    }
}
