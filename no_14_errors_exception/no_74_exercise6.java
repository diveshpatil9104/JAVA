package no_14_errors_exception;

import java.util.Scanner;

public class no_74_exercise6 {

    public static void OprationValidator(int operator ) throws InvalidInputException {  
        if (operator != 1 && operator != 2&& operator!=3 && operator !=4 ) {
            throw new InvalidInputException();
            
        }

    }

    public static void InputValidator(double num1 , double num2) throws MaxInputException{
        if (num1 > 100000 || num2>10000) {
            throw new MaxInputException();
            
        }
    }

    public static void Multiply(double num1 , double num2) throws MaxMultiplicationException {
        if (num1 >7000||num2>7000) {
            throw new MaxMultiplicationException();           
        }
    }

    public static void Divide(double num1 , double num2) throws DivideException{
        if(num2==0){
            throw new DivideException();
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                int oper;
                double num1 , num2 , result;
                
                System.out.println("\nChoose your Operation : ");
                System.out.println("\n1. + \n2. - \n3. * \n4. / \n");
                System.out.println("YOUR CHOICE: ");
                oper = sc.nextInt(); 

                try {
                    OprationValidator(oper);
                } catch (InvalidInputException e) {
                    System.out.println(e);
                    System.out.println("Try Again!");
                    continue;
                }
                
                System.out.print("\n Enter First Number : ");    
                num1 = sc.nextInt();
                System.out.print("Enter Second Number: ");
                num2 = sc.nextInt();

                try {
                    InputValidator(num1, num2);
                    
                } catch (MaxInputException e) {
                    System.out.println(e);
                    break;
                    
                }

                // try {
                //     Multiply(num1, num2);        ------>> we do not use same for multiplication as Inputvalidator    
                // } catch (Exception e) {                      becoz we not write result in methods so instend of this we use switch
                //     // TODO: handle exception
                // }
                
                switch (oper) {
                    case 1:
                       try {
                        InputValidator(num1, num2);
                        result = num1+num2;
                       System.out.println("Result is: " + result);
                       break;
                       

                    } catch (MaxInputException e) {
                        System.out.println(e);
                        break;

                    }
                        
                    case 2:
                        try {
                        InputValidator(num1, num2);
                        result = num1-num2;
                       System.out.println("Result is: " + result);
                       break;
                       

                    } catch (MaxInputException e) {
                        System.out.println(e);
                        break;

                    }
                    
                    case 3: 
                    try {
                        Multiply(num1, num2);
                        result = num1*num2;
                       System.out.println("Result is: " + result);
                       break;


                    } catch (MaxMultiplicationException e) {
                        System.out.println(e);
                        break;

                    }
                       
                    case 4:
                    try {
                        Divide(num1, num2);
                        result = num1/num2;
                       System.out.println("Result is: " + result);
                       break;

                        
                    } catch ( DivideException e) {
                        System.out.println(e);
                        break;

                    }
                }
            }
        }
    }
}
  
class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input should be smaller than 100000";
            
    }
}
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "Input not valid!!";
    }
}


class MaxMultiplicationException extends Exception{
    @Override 
    public String toString(){
        return "Multiplication input shound be smaller than 7000";
            
    }
}

class DivideException extends Exception{
    @Override
    public String toString(){
        return "DIVIDED BY 0 NOT ALOOW!!";
    }
}

    
    
    /*
       EXERCISE 6 -  YOU HAVE TO CREATE A CUSTOME CALCULATOR WITH FOLLOWING OPERATIONS:
       1. ADDICTION
       2. SUBSTRACTION
       3. MULTIPLICATION
       4. DIVISION
    WHICH THROWS THE FOLOOWING EXCEPTION :
    
    1. INVALID INPUT EXCEPTION
    2. CAN-NOT DIVIDED BY 0 EXCEPTION
    3. MAX INPUT EXCEPTION IF ANY OF INPUT IS GRATER THEN 100000
    4. MAX MULTIPLIER REACHED EXCEPTION - DON'T ALLOW ANY MULTIPLICATION INPUT TO BE GREATER THAN 7000;
    
    */
    
    
    
