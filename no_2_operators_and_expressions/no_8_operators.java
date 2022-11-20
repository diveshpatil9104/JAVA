package no_2_operators_and_expressions;



/**
 * no_8_operators 
 */
public class no_8_operators {

    public static void main(String[] args) {
   
//    sum = a + b  a and b are operand and (+) is operator
   
        //1) Arithmetic operators
        // int a = 3;
        // int b = 6-a;  //here (=) or (-) is operator
        // int b= 6+a;
        //int b = 6*a;
        //int b = 6/a;
        // int b= 6 % a; //modulo operator (this is use for remainder eg --> 10%5 => 0 )
        // 4.8 % 1.1 --> returns decimal remainder 
        // System.out.println("substract is : " + b);
   
    //2) Assigment operators
    int b=9;
    b*= 3;  // (b= b*3 --> b*=3)
    b+=3;   // (b=b+3)
    b-=3;   // (b=b-3)
    b/=3;   // (b=b/3)
    b%=3;   // (b = b%3)
    System.out.println(b);

    //3) comparison operator (relatinal operator)
    System.out.println(65 < 5);
    System.out.println(65 > 5);
    System.out.println(65 <= 5);
    System.out.println(65 >= 5);
    System.out.println(65 == 5);
    System.out.println(65 != 5); //this is for not equal to ..
   
   
    //4) logical operator
    System.out.println((64>5) || (64>98));     
    System.out.println(64>5 && 64>98);     
    // System.out.println( (55>8) ! (89==89)); //true Statement convert into false and false to true
   
    //5) bitwise operators
    System.out.println(2&3);

//     10
//     11
//    -----
//     10 
    }
}