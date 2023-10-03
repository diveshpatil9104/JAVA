package no_14_errors_exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class no_75_practice_set {

    public static int arr(int numbers[]) throws MyException1{    

        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i<5) {
            try {
                System.out.println("Enter the index number of array: ");
                int num = sc.nextInt();
                return numbers[num];
            } 
            catch (InputMismatchException e) {
                System.out.println("INVALID INPUT");
                break; }
                
            catch (Exception e) {
                System.out.println("ARRAY INDEX NOT EXIST");
                i++; 
            }
            if (i>=5) {
                throw new MyException1();
            }           
        }
        return -1;
    }
                
            
    public static void main(String[] args) {

// QN NO.1 ---->  WRITE A JAVA PROGRAM WHICH DEMONSTRATE A SYANTAX ERROR , LOGICAL ERROR & RUNTIME ERROR 

// ----->> SANTAX ERROR 
/* 
        int a = 55;
        int b = 3             //      semicolon is missing which creates santax error 
        System.out.println(a+b);
   

// -----> LOGICAL ERROR 
        // WRITE A PROGRAM TO FIND FIR ST 10 PRIME NUMBERS 

        System.out.println("2");
        for (int i = 1; i < 5; i++) {
            System.out.println(2*i+1);  // here this line print also 9, but 9  is not a prime number so,this line creats logical error
            
        }


// -----> RUNTIME ERROR  

        int k ;
        Scanner sc = new Scanner(System.in); 
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is : "  + 1000/k);

        // IN ABOVE CODE WHEN USER ENTER 0 IT THROWNS RUNTIME ERROR ..WHICH IS CALLED Exception
*/ 


// QN NO.2 ----> WRITE A JAVA PROGRAM THAT PRINTS "HA..HA" DURING ARITHMATIC EXCEPTION AND "HE-HE" DURING ILLEGAL ARGUMENT 

        int a = 100;
        int b = 10;

        try{
            int ans = a/b;
            System.out.println(ans);
        }catch(IllegalArgumentException e){
            System.out.println("HE...HE");
        }catch(ArithmeticException e){
            System.out.println("HA..HA");
        }


// QN NO.3 ----> WRITE A PROGRAM THAT ALLOWS YOU TO KEEP ACCESSING AN ARRAY UNTILE A VALID INDEX IS GIVE..IF MAX RETRIES
//                (5) EXCEED PRINT "ERROR"               

        int numbers[] = {5, 7 , 3 , 7 , 69};
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i<5) {
            try {
                System.out.println("Enter the index number of array: ");
                int num = sc.nextInt();
                System.out.println("THE NUMBER AT THIS INDEX IS : "+numbers[num]);
                break;
            
            } catch (Exception e) {
                System.out.println("INVALID INPUT");
                i++;
            }
            if (i>=5) {
                System.out.println("ERROR!!");
            }            
        }

        
            
// QN NO.4 ---->MODIFIED QN NO.3 TO THROWS A CUSTOME ERROR IF MAX RETRIES ARE REACHED 
            
        int numbers2[] = {5, 7 , 3 , 7 , 69};
        int i2 = 0;

        while (i2<5) {
            try {
                System.out.println("Enter the index number of array: ");
                int num = sc.nextInt();
                System.out.println("THE NUMBER AT THIS INDEX IS : "+numbers2[num]);
                break;
            
            } catch (Exception e) {
                System.out.println("INVALID INPUT");
                i2++;
            }
            try {if (i2>=5) {    
                throw  new MyException1();
            } 
            }catch(Exception e){
                System.out.println(e.getMessage());
            }              
        }   

// QN NO.5 -----> WRAPE THE QN NO.3 INTO THE FUNCTION WHICH THROWS YOUR CUSTOME ERROR MASSAGE 

            try {
                int numbers3[] = {5, 7 , 3 , 7 , 69};
                System.out.println(arr(numbers3));
                
            
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            





    }
}

class MyException1 extends Exception{
    @Override
    public String getMessage(){
        return "this is my custome error";

    }
}



    