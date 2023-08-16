package no_6_arrays;

import java.util.Scanner;

/**
 * no_26_arrays
 */
public class no_26_arrays {

    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students You have 2 options:
           1. create 500 variables
           2. use Arrays (recommanded) 
    THERE ARE THREE MAIN  WAYS TO CREAT AN ARRAYS IN JAVA...
        */
// 1----> DECLARATION AND MEMORY ALLOCATION..
/*      int []marks = new int[5];
        
        //INITIALIZATION
        marks[0]=100;
        marks [1]=60;
        marks [2]=70; 
        marks[3] = 80; 
        marks[4]=90;
//      marks[5]=100; throwns an error..⧮
        System.out.println(marks[4]);      
*/        


// 2----> DECLAREATION AND THEN MRMORY ALLOCATION..
 /*     int []marks;
        marks = new int[5];
        
        //INITIALIZATION
        marks[0]=100;
        marks [1]=60;
        marks [2]=73; 
        marks[3] = 80; 
        marks[4]=90;
        System.out.println(marks[4]);
*/ 
// 3----> DECLARATION , MEMORY ALLOCATION AND INITIALIZATION AT THE SAME TIME ..
/* 
        int []marks={100,70,67,86,48,96,54};
        System.out.println(marks[0]);
*/
/*------------------------INPUT AND OUTPUT----------------------

        int marks[]=new int[100];
        Scanner sc = new Scanner(System.in);
        // int phy = sc.nextInt(); for simple

        System.out.print("phy marks:");
        marks[0]= sc.nextInt();  // for array 
        
        System.out.print("chem marks:");
        marks[1]= sc.nextInt(); //chem
        
        System.out.print("math marks:");
        marks[2]=sc.nextInt(); //math
        
        marks[2]=100;  // for updating math marks..
        // marks[2]= marks[2]-99 ;  
        int sum= marks[0]+marks[1] + marks[2] ;
        

        System.out.println("phy:" + marks[0] + "\nchem:"+ marks[1] + "\nmath:" + marks[2]  + "\ntotal marks: " + sum  ); //one line print
        // System.out.println( "chem:"+ marks[1]);
        // System.out.println("math:" + marks[2]);
        // System.out.println("total marks: " + sum);
*/

// ------------------------------ PASSING ARRAY AS AN ARGUMENT ----------------------

        int marks[]= {98 , 99, 100 };
        






    }
}