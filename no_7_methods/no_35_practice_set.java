package no_7_methods;

import java.util.Scanner;

public class no_35_practice_set {

//FOR QN NO.1----> (MULTIPLICATION TABLE )

    static void mul(int x){
        int sum = 0;
        for(int i = 1 ; i<=10 ; i++){
            sum= i*x;
           System.out.println(sum); } 
    }    
    
//FOR QN NO.2---->  (STATR PATTERN)

    static void pattern(int x){
        for (int line =1; line<=x; line++ ){
            for(int star = 1; star<=line; star++ ){
                System.out.print("*");
            }
           System.out.println();
        } 

    } 

//FOR QN NO.3 ---->    (RECURSIVE  FUNCTION FOR SUM OF FIRST N NATURAL NUMBERS)

    static int natural(int x){
        //base condn is required in recursion..
        if(x==1){
            return 1;
        }
        else{
            return x + natural(x-1);
        }
    }
        
//FOR QN NO.4 ---->    (INVERT STAR PATTERN)

    static void pattern2(int x){
        for(int line = 1; line<=x; line++){
            for(int star =1; star<=x-line+1; star++){
                System.out.print("*");

            }
                System.out.println( );
        }
    }



// FOR QN NO.5 ---->   (RECUSIVE FOR fibonacii SERIES )

    static int fibonacii(int a){   // 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 .....(first two numbers is addition for 3rd number) 
        //base condn is required 
        if (a==1) {
            return 0;
        }
        else if(a==2){
            return 1 ;
        }
        else{
            return fibonacii(a-1)+fibonacii(a-2);
        }
    
    }

 // FOR QN NO.6 ----> (AVERAGE  OF THE SET OF NUMBERS PASSED AS ARGUMENT ..)

    static float avg( int...arr){
        int average =0;
        float num = arr.length;
        for( int result:arr){
            average = (average + result);}
            float ans = average / num;
        return ans;

    }

// FOR QN NO.7 ---->   (STAR PATTERN USING RECURSION)

    static void pattern2rec(int n){
        if (n>0) {
            pattern2rec( n-1);
            for( int star = 1 ;star<=n ; star++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
// FOR QN NO.8 ---->  (DEGREE CELCIUS TO FARENHEIT)

    static int conv(int x){
        int formula = (x * 9/5) + 32 ; 
        return formula;
    }

 
// FOR QN NO.9 ---->   (iterative aproach FOR sum of natural numbers)

    static void naturalin(int x){
        int i=1;
        int sum = 0;
        while (i<=x) {
           sum = sum + i;
           i++;
        }
        System.out.println(sum);
    }

// FOR QN NO.10 ----> (verify even or not)

    static boolean isEven(int number){

        if (number%2==0) {
            return true;
            }
        else{
            return false;
        }
    }

// FOR QN NO. 11 ---->  (verify prime or not )

    static boolean isprime(int number){
        if (number==2) {
            return true;
            
        }
        for(int i =2; i<=number-1; i++){   

            //for(int i =2; i<=math.sqrt(number); i++)  //----> more optimize way for prime no.s math.sqrt is inbuild function (for square root)
            if(number%2==0){
                return false;
                
            }

        }
        return true;


    }        
            

// FOR QN NO. 12 ---->   (DECIMAL TO BINARY )

    static void dectobin(int decNum){
        int mynum = decNum;
        int pow = 0;
        int binNum = 0;
        while (decNum>0) {
            int rem = decNum%2;
            binNum = binNum + (int)(rem* Math.pow(10 , pow));
            pow++;
            decNum = decNum/2;

            
        }
        System.out.println("binary of  "+ mynum + " : " + binNum);
        
    
    }





//  FOR QN NO. 13 ------> (BINARY TO DECIMAL)

    static void bintodec(int binNum){
        int mynum = binNum;
        int pow = 0 ;
        int decNum = 0;
        while (binNum>0) {
            int lastDigit=binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum =binNum/10;
            
        }
        System.out.println("decimal of  "+ mynum + " : " + decNum);
    }

    

    public static void main(String[] args) {
    
//  QN NO.1 ----> WRITE A JAVA METHOD TO PRINT A MULTIPLICATION TABLE OF A GIVEN NUMBER N AS INPUT..🙃

        Scanner sc = new Scanner(System.in);
 /*
  
 
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        mul(a);

*/


// QN NO.2 ----> WRITE A PROGRAM USING FUNCTION TO PRINT THE FOLLOWING PATTERN ..
  //                   *
 //                    **
 //                    ***
 //                    ****

 
//       int n = 4;
//      pattern(n);


// QN NO.3 ---->WRITE A RECURSIVE  FUNCTION TO CALCULATE SUM OF FIRST N NATURAL NUMBERS..😐
 /*
        System.out.print("enter the number : ");
        int c = sc.nextInt();
        System.out.println(natural(c));
*/
        
// QN NO.4 ----> WRITE A PROGRAM USING FUNCTION TO PRINT THE FOLLOWING PATTERN ..
  //                   ****
 //                    ***
 //                    **
 //                    *

 //     int n = 4;
//      pattern2(n);


// QN NO.5 ----> WRITE A FUNCTION TO FIND nth NUMBER OF FIBONACCI SERIES USING RECURSION..(nth term means start from 1 and index or not mension mean star from 0)

 //        int result = fibonacii(7);
 //       System.out.println(result);



 // QN NO.6 ----> WRITE A FUNCTION TO FIND AVERAGE OF THE SET OF NUMBERS PASSED AS ARGUMENT ..

//   System.out.println("average of : " +avg(2 , 3 , 8 ,7,8 ));


        
// QN NO.7 ----> REPEAT 2 USING RECURSION ..


 //           pattern2rec(4);

// QN NO.8 ----> WRITE A FUNCTION WHICH CONVERT DEGREE CELCIUS TO FARENHEIT...

/* 
        System.out.print("Enter the temp in celcius: ");
        int ans= sc.nextInt();

        System.out.println(ans + "in FARENHEIT is :" + conv(ans));
*/
    

// QN NO.9 ----> Repeat 3 usnig iterative aproach

/* 
    System.out.print("enter the number :");
    int ans = sc.nextInt();
    naturalin(ans);
*/


// QN NO.10 ----> WRITE A METHOD NAME isEven THAT ACCEPTS INT ARGUMENT... THE METHOD SHOULD RETURN TRUE IF THE ARGUMENT IS EVEN 
//               ..OR FALSE OTHERWISE ..ALSO WRITE A PROGRAM TO TEST UR METHOD 🫥
/* 
    System.out.print("ENTER THE NUMBER : ");
    int num = sc.nextInt();
    System.out.println(isEven(num));
*/



// QN NO. 11 ----> CHECK THE INPUT NUMBER IS PRIME OR NOT ...🥱
/* 

    System.out.print("enter the number : "); 
    int num = sc.nextInt();
    System.out.println(isprime(num));
*/
 
//  QN NO. 12 ----> CONVERT DECIMAL TO BINARY...🥵

/* 

    System.out.print(" Enter the decimal number : ");
    int ans = sc.nextInt();
    dectobin(ans);

 */      



//  QN NO. 13 ------> CONVERT BINARY TO DECIMAL ...🥵
/* 

        System.out.print(" Enter the binary number : ");
        int ans = sc.nextInt();
        bintodec(ans);
 */      


  
  










    }   
}