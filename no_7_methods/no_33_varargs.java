package no_7_methods;

public class no_33_varargs {
 /*    static int sum(int a , int b , int c){
        return a+b+c; }                                 // to avoiding this type of overloading we use varargs method..

     static int sum(int a , int b){
            return a+b; }
      static int sum(int a , int b , int c , int d){
                return a+b+c+d;} 
*/  

// --------->> METHOD OF VARIABLE ARGUMENTS <<--------------
    static int sum(int ...array){  
        // AVALABLE AS int []arr  
        int result=0 ;
        for(int a : array){
            result= result+a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("\nWELCOME TO CODE OF VARARGS..😇 ");
        System.out.println("the sum of 4 and 5 is : " + sum(4, 5));
        System.out.println("the sum of 4 ,3 and 5 is : " + sum(4,3, 5));
        System.out.println("the sum of 4 ,3,5 and 5 is : " + sum(4, 3 ,5,5 ));
        // but this methods is very time consuming hence , we use VARIABLE ARGUMENTS 




    }
}
 