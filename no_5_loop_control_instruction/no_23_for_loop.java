package no_5_loop_control_instruction;

import java.math.MathContext;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * no_23_for_loop
 */
public class no_23_for_loop {

    public static void main(String[] args) {
 
//------------------>>    for loop    <<----------------------
// A for loop IS USE TO EXECUTE A PIECE OF CODE FOR SPECIFIC NUMBER OF TIMES..

    for (int i=0; i<=10; i++){
        System.out.println(i);
}
//   2i ---->   Even Numbers ===> 0 , 2 , 4 , 6 , 8....2n----> 2*1 = 2 
// 2i+1 ---->   Odd Numbers ====> 1 , 3 , 5 , 7 , 9....2n+1 ----> 2*1+1 = 3

// -----> QUICK QUIZ = WRITE A PRIGRAM TO PRINT FIRST 20 ODD NUMBERS USING for loop..

        for (int a=0; a<20; a++) {
        System.out.println(2*a+1);
    }

// =================>>     DECREMENT FOR LOOPS     <<==================
System.out.println("DECREMENT FOR LOOPS ===>");
    for (int i=10; i!=0; i--) { 
        System.out.println(i);
    }

// -----> QUICK QUIZ = WRITE A PROGRAM TO PRINT FIEST 20 NATURAL NUMBERS IN REVERSE ORDER..

    int s = 20;
    while (s>=1) {
        System.out.println(s);
        s--;
    
}



 }
}