package no_16_advanced2_java;

import java.io.FileWriter;

/**
 * This is the ans of question 1 of no_098_practice_set file
 * @author Divesh Patil
 * @version 6.9
 */

public class no_098_practice_set {
    // QN NO.1 ----> CREATE A JAVA DOC FROM USING PROGRAM ...IF TOU USE IntelliJ DO NOT USE TOOLS OPTION.  USE TERMINAL 

    /**
     * this method is use for logic of tow numbers and perameters are x and y 
     * @since 2023
     * @param x Accepts the value integer number as a  x
     * @param y Accepts the value of wnd integer number as a y 
     * @return Returns the value of z which is x + y if x>y.. else (x + y)*5
     * 
     * 
     */
     
    public static int logic(int x ,int y){   

        int z;

        if (x>y) {
            z=x+y;
       } 
        else{
         z = (x+y)*5;
         }

         return z;    

    }
    /**
     * 
     * This is a main method 
     */
    public static void main(String[] args) {

        int a = 5;
        int b =7; 
       

        
        int c = logic(a, b);     
        System.out.println(c);
   
       

        int a1 = 2;
        int b1 =1;  
        
        int c1 = logic(a1, b1);

         System.out.println(c1);



// QN NO.2 ----> CREATE A CLASS AND ADD A METHOD WITH deprecated ANNOTATION WHAT IS IT'S EFFECT ON PROGRAM 
            @SuppressWarnings("Deprecation")    // SurfaceWarning annotation for stops the warning (compiler ki aawaj dabane keliye..)
            MyDeprecated deprecated = new MyDeprecated();
            deprecated.meth1();
            deprecated.meth2();   
// @Deprecated annotation is one that programmers are discouraged from using. An element may be deprecated 
//      for any of several reasons, for example, its usage is likely to lead to errors..⧮



// QN NO.3 ----> SURPASS THE GENERATED WARNING FROM TWO 
          
            @SuppressWarnings("Deprecation")    // SurfaceWarning annotation for stops the warning (compiler ki aawaj dabane keliye..)
            MyDeprecated deprecated1 = new MyDeprecated();
            deprecated1.meth1();
            deprecated1.meth2();   


// QN NO.4 -----> CREATE AN INTERFACE AND GENERATE AN INSTANCE FROM IT 

            Instace MyInterface = new Instace() {
                public void meth1(){
                    System.out.println("ths is method in instance");
                }
            
            };
            MyInterface.meth1();

// ---------------------------- OR -------------------------------------

            Instace MyInterface1= ()->{System.out.println("\nthis is 2nd method for generate instance of interface ");};
            MyInterface1.meth1();


// QN NO.5 ----->   WRITE A PROGRAM TO GENERATE MULTIPLICATION TABLE OF A GIVEN NUMBER AND WRITE IT TO A FILE..

            String table = "";
            for (int i = 1; i <= 10; i++) {
            table += "19 x " + i + " = " + 19 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_099_qn_5_table.txt");
            fileWriter.write(table);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }

// Qn no.6 -----> REPEAT 5 FOR 1-9 TABLE AND STORED IT TO FOLDER 

           String table2 = "";
            for (int i = 1; i <= 10; i++) {
            table2 += "2 x " + i + " = " + 2 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table2.txt");
            fileWriter.write(table2);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }


//     FOR TABLE 3

           String table3 = "";
            for (int i = 1; i <= 10; i++) {
            table3 += "3 x " + i + " = " + 3 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table3.txt");
            fileWriter.write(table3);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }


//     FOR TABLE 4

           String table4 = "";
            for (int i = 1; i <= 10; i++) {
            table4 += "4 x " + i + " = " + 4 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table4.txt");
            fileWriter.write(table4);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }


//     FOR TABLE 5
  
            String table5 = "";
            for (int i = 1; i <= 10; i++) {
            table5 += "5 x " + i + " = " + 5 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table5.txt");
            fileWriter.write(table5);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }

                
//     FOR TABLE 6

           String table6 = "";
            for (int i = 1; i <= 10; i++) {
            table6 += "6 x " + i + " = " + 6 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table6.txt");
            fileWriter.write(table6);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }

                
//     FOR TABLE 7

            String table7 = "";
            for (int i = 1; i <= 10; i++) {
            table7 += "7 x " + i + " = " + 7 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table7.txt");
            fileWriter.write(table7);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
              
                
//     FOR TABLE 8

            
            String table8 = "";
            for (int i = 1; i <= 10; i++) {
            table8 += "8 x " + i + " = " + 8 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table8.txt");
            fileWriter.write(table8);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
                           
            
//     FOR TABLE 9
        
            String table9 = "";
            for (int i = 1; i <= 10; i++) {
            table9 += "9 x " + i + " = " + 9 *i + "\n";
        }

    try {
        FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_101_ans_of_6th/ table9.txt");
            fileWriter.write(table9);
            fileWriter.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            
// QN NO.7 ----> CREATE A FILE WHICH STORES FACTORIAL OF NUMBER...

    int fact = 1;
    
    
    int n = 5;
    for ( int i = 1; i <= n; i++) {
        fact = fact*i;
    
    }
        
        try {
            int i = n;
            FileWriter fileWriter = new FileWriter("/Users/divesh/java programs/no_16_advanced2_java/no_100_7th_ans.txt");
            String factString = Integer.toString(fact);
            fileWriter.write("factorial of " + i + " is : "+factString);
            fileWriter.close(); }
            catch(Exception e){
                System.out.println(e);
            }

    }
}
    


interface Instace{
    void meth1();
}

class MyDeprecated{
    public void meth1(){
        System.out.println("my name is raj patil ");
    }
    @Deprecated
    public void meth2(){
        System.out.println("this is deprecated anootation");
    }
}