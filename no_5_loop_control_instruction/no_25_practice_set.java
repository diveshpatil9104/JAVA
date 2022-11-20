package no_5_loop_control_instruction;
import java.util.Scanner;


/**
 * no_25_practice_set
 */
public class no_25_practice_set {

    public static void main(String[] args) {
        
// QN NO.1 ----> WRITE A PROGRAM TO PRINT THE FOLLOWING PATTERNS
//               ****
//               ***
//               **
//               *

/*      int n=4;
        for (int line=1; line<=4; line++ ){
            for (int star = 1; star<=n-line+1; star++){
            System.out.print("*");
        } 
        System.out.println();
    }
*/
//QN NO.2 ----> WRITE A PROGRAM TO SUM FIRST 20 EVEN NUMBERS USING WHILE LOOP..

   
    Scanner sc= new Scanner(System.in);
/*    System.out.print("enter the even number: ");
    int a = sc.nextInt();
        
        int sum=0;
        int i=0;
        while (i<a) {
            sum=sum+(2*i);
            i++;
            
        } 
        System.out.print("sum of even numbers:" + sum);
*/       
            




//QN NO.3 ----> WRITE A PROGRAM TO PRINT MULTIPLICATION TABLE OF A GIVEN NUMBER BY USER..

 /*     System.out.print("ENTER THE TABLE WHICH U WANT : ");
        int a = sc.nextInt();
        int sum =0;
        
        for(int i = 1; i<=10; i++){
           sum= a*i;
           System.out.printf("%d X %d = %d \n" , a ,i ,sum);
           
        }
*/




//QN NO.4 ----> WRITE A PROGRAM TO PRINT MULTIPLICATION TABLE OF 10 IN REVERSE OEDER..

 /*        
        int a = 10;
        for(int i = 10; i>=1; i-- ){
            System.out.printf("%d x %d = %d\n" ,a ,i, a*i);
        } 
*/




//QN N0.5 ----> WEITE A PROGRAM TO FIND FACTORIAL OF A GIVEN  NUMBER USING FOR LOOPS..

/*      System.out.print("ENTER THE NUMBER FOR FACTORIAL: ");// factorial of 4 ---->  4 * 3 *  2 * 1 ...
        int a =sc.nextInt();
        int fact =1;
        for(int i =1; i<=a; i++){
            fact*=i;  //fact = fact * i
        }    
        System.out.println("FACTORIAL OF GIVEN NUMBER IS : "+ fact);
*/       

 //QN NO.6 ----> REAPEAT QN 5 USING while LOOP...
 
/*       System.out.print("ENTER THE NUMBER FOR FACTORIAL: ");// factorial of 4 ---->  4 * 3 *  2 * 1 ...
        int a =sc.nextInt();
        int fact =1;
        int i = 1;
        while (i<=a) {        
            fact*=i;
            i++;
        }
        System.out.println("FACTORIAL OF GIVEN NUMBER IS : "+ fact);


//QN NO.7 ----> REPEAT 1 USING WHILE LOOP




//QN NO.8 ----> WHAT CAM BE DONE USING ONE TYPE OF LOOP CAN ALSO BE DONE USING THE OTHER TWO TYPES OF LOOPS---TRUE OR FALSE

//                 System.out.println("true");
 

//QN NO.9 ----> A DO WHILE LOOP IS EXETED :
//               1] AT LEAST ONCE
//               2] AT LEAST TWICE
//               3] AT MOST ONCE

//   System.out.println("ANSWER IS: 1]---> AT LEAST ONECE");


//QN NO.10 ----> REPEAT QN 2 USING FOR LOOP...


/*      int sum=0;
        int a= 3;
        for(int i = 0; i<a; i++){
          sum = sum+(2*i);
            
        }
        System.out.println(sum);
*/           

//QN NO.11---->  WRITE A PROGRAM TO CALCULATE THE SUM OF THE NUMBERS OCCURING IN THE MULTIPLICATION TABLE OF USERS INPUT...

/*      System.out.print("ENTER THE NUMBER of TABLE: ");
        int a =sc.nextInt();
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum= sum+(a*i);

        }
        System.out.println("THE SUM OF TABLE: " + sum);
*/ 

// QN NO.12 ---->Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

/*
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.print("Enter the number ");
            number = sc.nextInt();
        if( number % 2 == 0) {
            evenSum += number;
            } 
        else {
             oddSum += number;
        }
        System.out.print("Do you want to continue? Press 1 for yes or 0 for no ");
        choice = sc.nextInt();
        
        } while(choice==1);


       System.out.println("Sum of even numbers: " + evenSum);
       System.out.println("Sum of odd numbers: " + oddSum);
*/

      
// QN NO.13 ----> PRINT STAR PATTERNS
             
//               *  
//               ** 
//               ***
//               ****
/*
        int a=4;
        for(int i = 1; i<=a; i++){
            for(int j = 1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
        }
*/

// QN NO.14 ----> PRINT THE FOLLOWING PATTERN ...

//                A
//                BC
//                DEF
//                GHIJ

        int a= 4;
        char ch = 'A';

        for(int i=1; i<=a; i++){
            for(int j = 1; j<=i; j++){
            System.out.print(ch);
            ch++;
        }
            System.out.println();
        }     
           

        

 }
}