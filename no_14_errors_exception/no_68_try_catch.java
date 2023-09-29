package no_14_errors_exception;

public class no_68_try_catch {
    public static void main(String[] args) {

        int a = 10;
        int b =0 ;
        // int c = a/b;

//      System.out.println(c);  // IN THIS CODE b=0 IT THROWNS RUNTIME ERROR ..WHICH IS CALLED Exception 
//      if we use this method the code throwns error and thank you!! code is not run 

// IN JAVA EXCEPTION ARE MANAGED USING try and catch BLOCKS SANTAX

        try{
           int c=a/b;
            System.out.println("the result is : " + c);
        }
        catch(Exception e){
            System.out.println("We failed to devide. \nReason: " + e);
 
        }
        System.out.println(" thank you!!");     // it is runnable even after error bcoz of try-catch block 
        
    }
}


/* 
 - AN EXCEPTION IS AN EVENT THAT OCCURS WHEN A PROGRAM IS EXECUTED DISRUPTING THE NORMAL FLOW OF INSTRUCTION 
 
● THERE ARE MAINLY TWO TYPES OF EXCEPTION IN JAVA :

1. CHECKED EXCEPTION   - COMPILE TIME EXCEPTION (HANDLED BY COMPILER) 
2. UNCHECKED EXCEPTION - RUNTIME EXCEPTION 

---- COMMONLY OCCURING EXCEPTION 

1. NULL POINTER EXCEPTION
2. ARETHMATIC EXCEPTION
3. ARRAY INDEX OUT OF BOUND EXCEPTION
4. ILLEGAL INDEX EXCEPTION
5. NUMBER FORMAT EXCEPTION

*/







