package no_14_errors_exception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class no_69_handling_exception {
    public static void main(String[] args) {

        int []marks = new int[4];
        marks[0] = 4;
        marks[1] = 8;
        marks[2] = 12;
        marks[3] = 16;
        try (Scanner sc = new Scanner(System.in)) {             // scanner is available only for this block of code 
            
            
        try{ 
            
            System.out.print("Enter the array index: ");
            int index = sc.nextInt();

            System.out.print("Enter the number you want to Divide: ");
            int number= sc.nextInt();
              
            System.out.println("The value of index is : " + marks[index]);
            int ans =  marks[index]/number;
            System.out.println(" The result of array value/number is :" + ans);

        }
            catch(InputMismatchException e){       // HANDLING ALL EXEPTION OF INPUT MISMATCHED 
            System.out.println("Wrong Input!!");
            System.out.println("Exception: " + e);
                
            }                        
            catch(ArithmeticException e){       // HANDLING ALL EXEPTION OF TYPE ARETHMATIC
                System.out.println("Arithmetic Exception occured!!");
                System.out.println("Exception: " + e);
                
            }            
            catch(ArrayIndexOutOfBoundsException e){  // HANDLING ALL EXEPTION OF TYPE ARRAY INDEX OUT OF BOUND
                System.out.println("Array Index OutOfBounds Exception occured!!");
                System.out.println("Exception: " + e);
                
            }
            catch(Exception e){                     // HANDLING ALL OTHER EXCEPTION 
                System.out.println("Some Exception occured!!");
                System.out.println("Exception: " + e);
                
            }

            // System.out.println(index); // HERE VARIABLE DECLARED INSIDE A `try-catch` BLOCK HAVE LIMITED SCOPE AND ARE ONLY 
            //  ACCESSABLE WITHIN THAT BLOCK AND ITS ASSOCIATED BLOCK
        }
    }
}

        
        
// USING ABOVE try and catch FORMAT WE HANDLING EXCEPTION BY THEIR TYPES: 
//   (InputMimatchedException , ArithmeticException , ArrayIndexOutOfBoundsException)