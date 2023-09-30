package no_14_errors_exception;

import java.util.Scanner;

public class no_71_exception_class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num;
        num = sc.nextInt();

        if(num<9){
            try {
                System.out.println("number is smaller than 9");
                 throw new MyException();
                
                 // throw new ArithmeticException("Not Found!!");
                
            } catch (Exception e) { 
              System.out.println(e.getMessage());   
              System.out.println(e.toString()); 
              //System.out.println(e);   // print toString function 
              e.printStackTrace();       // GIVING ERROR TRACE 
              
            }
            System.out.println("End of error");
        }
        else{
            System.out.println(" Entered number is correct");
        }
        
    }
}


class MyException extends Exception{
    @Override
    public String toString(){
        return "i am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }
    // @Override
    // public void printStackTrace(){
    //     System.out.println(" i am stacktrace");
    // }
    

}



/* 
------ Exception CLASS IN JAVA 
WE CAN WRITE OUR CUSTOME EXCEPTION USING Exception CLASS IN JAVA 

THE Exception CLASS HAVE FOLLOWING IMPORTANT METHOD : 

1. String toString();           ----->> EXECUTED WHEN SOUT(e) IS RUN
2. void print StackTrace();     ----->> PRINT STACK TRACE
3. String getMessage();         ----->> PRINT THE EXCEPTION MESSAGE

*/















