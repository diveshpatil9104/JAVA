package no_7_methods;

import java.util.Scanner;

public class no_34_recursion {
    
    // factorial of n ---->> n * n-1 * n-2 * n-3 ....1
    static int factorial(int n ){
        //base condn is required in recursion..  without this stack will be overflow due to so many calls 
        if (n==0 || n==1) {
            return 1 ; 
            
        }
        else {
            return n * factorial(n-1);
        }
        
    }
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nEnter the number: ");
            int x = sc.nextInt();
            
                
                System.out.println("\nfactorial of "+ x +  " is :" + factorial(x));
        }
       
        
    }
}   
