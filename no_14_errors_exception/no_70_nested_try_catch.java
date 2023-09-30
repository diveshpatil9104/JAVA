package no_14_errors_exception;


import java.util.Scanner;

public class no_70_nested_try_catch {
    public static void main(String[] args) {
        
        int number[] = {12 , 34 , 53 , 54 , 53 ,69};

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("ENTER THE INDEX NUMBER: ");
            int num = sc.nextInt();
            
            try {
                System.out.println(" HEY!! MY NAME IS DVESH PATIL ");
                try {
                    System.out.println("INDEX NUMBER IS: " + number[num]);
                    
                }catch (Exception e) {
                    System.out.println("EXEPTION OCCURS: " + e);
                }
                
            } catch (Exception e) {
                System.out.println("EXCEPTION OCCURS IN LEVEL ONE ");

            }


// QUIZE ----->> WRITE A JAVA PROGRAM THAT ALLOWS YOU TO KEEP ACCESING THE ARRAY UNTIL VALID INPUT GIVEN BY USER ..


            int number1[] = {12 , 34 , 53 , 54 , 53 ,69};
            boolean i = true;

        while (i) {
            
            System.out.print("ENTER THE INDEX NUMBER: ");
            int num1 = sc.nextInt();
            
            try {
                System.out.println(" HEY!! MY NAME IS DIVESH PATIL ");
                try {
                    System.out.println("INDEX NUMBER IS: " + number1[num1]);
                    i = false;
                    
                }catch (Exception e) {
                    System.out.println("EXEPTION OCCURS: " + e);
                }
                
            } catch (Exception e) {
                System.out.println("EXCEPTION OCCURS IN LEVEL ONE ");

                }
            }
        }
    }   
}





