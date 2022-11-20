package no_2_operators_and_expressions;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

import java.beans.Expression;
import java.nio.file.DirectoryNotEmptyException;

/**
 * no_12_practice_set
 */
public class no_12_practice_set {

    public static void main(String[] args) {
        
// QN.1--> WHAT WILL BE THE RESULT OF FOLLOWING ExPRESSION..
        // Float a = 7 / 4 * 9 / 2;

    float  a = 7.0f / 4.0f * 9.0f / 2.0f;
    System.out.println(a); //7.87
    

// QN.2--> WRITE A JAVA PROGRAM TO ENCRYPT A GRADE BY ADDING 8 TO IT ..DECRYPT IT TO 
//         SHOW THE CORRECT GRADE..

        char ch = 'B';
         ch = (char) (ch+8);
        // incraption---->>
        System.out.println(ch);
        
        //decraption---->>
         ch = (ch-=8);
        System.out.println(ch);


// QN.3--> USE COMPARISON OPERATORS TO FIND OUT WHETHER A GIVEN NUMBER IS GRETHER THAN  
//         THE USER ENTERED NUMBER OR  NOT..

    Scanner sc = new Scanner(System.in);
    int given = 100;
    System.out.print("enter ur number : " );
    float input = sc.nextFloat();
    System.out.println( given > input );


// QN.4--> WRITE THE FOLLOWING ExPRESSIONIN A JAVA PROGRAM :
//         v * v - u * u / 2 * p * s;

        int v = 2;
        int u = 2;
        int s = 5;
        int p = 1;    
        float ans = v * v - u * u / 2 * p * s;
                    // = 2 * 2 - 2 * 1 * 1 * 5
                    // = 4 - 2 * 5 
                    // = 4 - 10
                    // = -6
        System.out.println(ans);


// QN.5--> FIND THE VALUE OF THE FOLLOWING Expression..

    int c = 7;
    int b = 7 * 49 / 7 + 37 / 7;
            // 343 / 7 + 37 / 7
                // 49 + 37 / 7
                // 49 + 5
    System.out.println(b);


// QN.6---->  What will be the output of the following programs :
//  i.     
    //  int x = 2, y = 5;
    //  int exp1 = (x * y / x);
    //  int exp2 = (x * (y / x));
    //  System.out.print(exp1 + " , ");
    //  System.out.println(exp2);
     System.out.println("output will be : (5 , 4)");
    
// ii.
    // int x, y, z;
    // x = y = z = 2;
    // x += y; //4
    // y -= z; //0
    // z /= (x + y); // Z = Z / (4 + 0)
    // System.out.println(x + " " + y + " " + z);
    System.out.println("output will be : (4 , 0 , 0)");
    
//iii.
    // int x = 9, y = 12;
    // int a = 2, b = 4, c = 6;
    // int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
                        // ====> explanation <====
        //  = 4/3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 *(2 + 2)) / (2 + 4 * 12)
        //  = 4/3 * 43 + 9 * 26 + 15 * 4 / 50
        //  = 43 + 234 + 60 / 50
        //  = 43 + 234 + 1
        //  = 278
    // System.out.println(exp);
    System.out.println("output will be : (278)");

// iv.
    // int x = 10, y = 5;
    // int exp1 = (y * (x / y + x / y));
    // int exp2 = (y * x / y + y * x / y);
    // System.out.println(exp1); //20
    // System.out.println(exp2); //20
    System.out.println("output will be : (20 , 20)");

    System.out.println("congratulation practice set of chapter 2 is completed");



    


    }
}