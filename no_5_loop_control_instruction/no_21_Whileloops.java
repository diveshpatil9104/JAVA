package no_5_loop_control_instruction;

/**
 * no_21_loops
 */
public class no_21_Whileloops {

    public static void main(String[] args) {

//  --------------------->> while loop <<-------------------------       

        int i = 1;
        while (i<=3) {     // ----> while loop checks the condition and then executes the code
            System.out.println(i);  // this keeps executing as long as the condition is true
            i++;
     }
     System.out.println("finish running while loop...");

    //     while(true) {
    //         System.out.println("I AM AN INFINITE WHILE LOOP"); // if the condition never becomes false , the while loop keeps getting executed  
    //                                                               // such loop is known as an infinite loop
    //    }

//----> QUICK QUIZE = WRITE A PROGRAM TO PRINT NATURAL NUMBERS FROM 100 TO 200..

    int a = 100;
    while (a>=100 && a<=200) {
        System.out.println(a);
        a++;
        
    }



    }                                                                           
}
