package no_14_errors_exception;


public class no_72_throw_throws {
    public static int division(int a , int b)  throws ArithmeticException{  // HERE WE DECLARED AN EXCEPTION..
        
        return a/b;
    }
    public static double area( int r) throws NegativeRadiusException{
        if (r<0) {
            throw new NegativeRadiusException();
            
        }
        return Math.PI*r*r;

    }

    public static void main(String[] args) {

        try {
            int num = division(3, 0);
            System.out.println(num);

        } catch (Exception e) {
            System.out.println("0 IS EXCEPTION");
            // System.out.println(e.getMessage());          // print inbuild function in exception  

        }    

    //double rad = area(4);       // ------>> this line thrown errors bcoz we declared exception in area method 

    try {
        double rad =area(4);
        System.out.println(rad);
    
    } catch (Exception e) {
        System.out.println(e.getMessage());
        

    }


    }
}

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Negative Radius Is Not Allowed";
    }
    @Override
    public String getMessage(){
        return "Negative Radius Is Not Allowed";
    }
}

/* 
------- THE throw KEYWORD
 THE throw KEYWORD IS USED TO THROW AN EXCEPTION EXPLICETLY BY PROGRAMMER  

------ THE throws KEYWORD
    THE JAVA throws KEYWORD IS USE TO DECLARED AN EXCEPTION THAT GIVES AN IMFORMATION TO PROGRAMMER THAT THERE MIGHT BE 
    AN EXCEPTION SO , IS BETTER TO BE PREPARED WITH A try-catch BLOCK 



*/






