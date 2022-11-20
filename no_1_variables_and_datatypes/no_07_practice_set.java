package no_1_variables_and_datatypes;
import java.util.Scanner;

/**
 * no_07_practice_set
 */
public class no_07_practice_set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
  //  QN.1 = WRITE A PROGRAM TO SUM OF THREE NUMBERS IN JAVA..
    
    // System.out.print("first number : ");
    // float  num1 = sc.nextFloat(); 
    // System.out.print("second number : ");
    // float num2 = sc.nextFloat();
    // System.out.print("third number : ");
    // float num3 = sc.nextFloat();
    // System.out.println("the sum of three numbers ; ");
    // float sum = num1+num2+num3;
    // System.out.println(sum);

   
    // QN.2 = WRITE A PROGRAM TO CALCULATE CGPA USING MARKS OF THREE SUBJECT OUT OF 100

        // System.out.println("enter the marks of given subjects : ");
        // System.out.print("physics : ");
        // int a = sc.nextInt();
        // System.out.print("chemistry : ");
        // int b=sc.nextInt();
        // System.out.print("math : ");
        // int c=sc.nextInt();
        // int sum = (a+b+c)/3;
        // System.out.print("ur CGPA is : ");
        // System.out.println(sum);


    //   QN.3 = WRITE A JAVA PROGRAM WHICH ASK THE USER TO ENTER HIS/HER NAME AND JOIN THEM WITH
    //             "HELLO <NAME>,HAVE A GOOD DAY"
        
            // System.out.print("please enter ur name : ");
            // String str = sc.nextLine();
            // System.out.print("Hello ");
            // System.out.print(str);
            // System.out.print(", Have a good day ");


    //   QN.4 = WRITE A JAVA PROGRAMS TO CONVERT KILOMETERS TO MILES

            // System.out.print("enter the kilometers : ");
            // float f1 = sc.nextFloat();
            // float m1 = f1/1.609f;
            // System.out.print(f1);
            // System.out.print("  into the miles is : ");
            // System.out.print(m1);


        // QN. 5 = WRITE A PROGRAM TO DETECT WHETHER A NUMBER ENTERED BY THE USER IS INTEGER OR NOT 

        // System.out.print("enter the integer number : "); 
        // boolean b = sc.hasNextInt();
        // System.out.println(b);

        

        // QN. 6 = ENTER COST OF 3 ITEMS FROM THE USER (USING FLOAT DATATYPES ) A PENCILE , PEN ,ERASER .
        //         U HAVE TO OUTPUT THE TOTAL COST OF THE ITEMS BACK TO THE USER AS THEIR BILL.
        //         (ADD ON : U CAN ALSO TRY ADDING 18% GST TAX TO THE ITEMS AS AN ADVANCED PROBLEM..)

        System.out.print("enter the price of pencile : ");
        float f1 = sc.nextFloat();
        System.out.print("enter the price of pen : ");
        float f2 = sc.nextFloat();
        System.out.print("enter the price of eraser : ");
        float f3 = sc.nextFloat();
        float bill=f1+f2+f3;
        System.out.println("ur bill : "+ bill);
        
        //bill with 18% gst add on
        float newbill= bill +(bill* 0.18f);
        System.out.println("ur bill with 18% gst : " + newbill);
        System.out.println("congratulation practice set of chapter 1 is completed");

    }
}     