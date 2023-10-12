package no_16_advanced2_java;
/**
 * This class is demonstrate what javadoc is and how to used in the java industry
 * @author Divesh Patil
 * @version 1.9
 * @since 2023
 */

public class no_092_docmethods_tags {
    /**
     * division is the method for disvision of two numbers 
     * @param a Accepts the value of divident
     * @param b Accepts the value of divisor
     * @return  Returns the division of a/b
     * @throws ArithmeticException When divisor (i.e b) is 0
     */


            public static int division(int a , int b)  throws ArithmeticException{  
                
                return a/b;
            }
    /**
     * 
     * @param r Accepts radius of circle
     * @return  Return the area of circle
     * @throws NegativeRadiusException  When input radius is negative
     */
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
        /**
         * Thi class is use for throw our custome Exception
         */
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

// created this file JavaDocs in index.html file into docs2 folder ... 😃    
