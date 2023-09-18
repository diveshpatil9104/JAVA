package no_12_packages.no_59_practice_set;
/*  QUESTION N0 - 1 ----->>       
    CREATING THREE CLASSES Calculator , ScCalculator , HybCalculator AND GROUP THEM INTO A PACKAGE CALLED Sci
*/    

    class Calculator{
            public void calculate(int a , int b){
                System.out.println(" Your result is: " + (a+b));
            }
        }
    class ScCalculator{
        public void ScCalculate(int a , int b){
            System.out.println(" Your result is: " + (Math.sin(a)+Math.sin(b)));
        }
    }
    class HybCalculator{
        public void HybCalculate(int a , int b){
            System.out.println("Your result is: " + (a+b));
            System.out.println("Your result is: " + Math.sin(a+b));
        }
    }

public class problem_1 {
    public static void main(String[] args) {
        System.out.println("my name is raj patil");



    }
}

// THEIS QUESTION ANSWER IN Problem1 PACKAGE..(FOLDER)