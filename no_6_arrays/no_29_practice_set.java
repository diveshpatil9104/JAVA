package no_6_arrays;
import java.util.Scanner;

import no_2_operators_and_expressions.no_10_resulting_datatypes;

/**
 * no_29_practice_set
 */
public class no_29_practice_set {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//QN NO.1----> CREATE AN ARRAY  AND CALCULATE THEIR SUM
/*
       int sum=0;
       int[] marks = {32,45,65,86,75,75,99};
            for(int i=0; i<marks.length; i++){
                sum=sum+marks[i];
                
            }

                System.out.println(sum);
 */



// QN NO.2----> WRITE A JAVA PROGRAM TO FIND OUT WHETHER A GIVEN INTEGER IS PRESENT IN AN ARRAY OR NOT
/*        
        int[]list={43,65,86,53,64,75,24,64}; 
        System.out.print("enter the number: ");
        int a =sc.nextInt();
        boolean  inArray= false;

        for(int element:list){
            if (element==a) {
                 inArray=true;
                break;
            }
        }
        if(inArray){
            System.out.printf("%d IS PRESENT IN ARRAY\n" ,a);
        }
        
         else{
            System.out.printf("%d IS NOT PRESENT IN ARRAY\n" ,a);

        }
        
 */     



// QN NO.3----> CALCULATE THE AVG. MARKS FROM AN ARRAY CONTAINING MARKS OF ALL STUDENTS IN PHYSICS USING FOT-LOOP..

/*      int[] phymarks = {32,45,65,86,75,75,99,100};
        int sum=0;
        for(int marks: phymarks){   // this santax means give me a phymarks in marks one by one ...
            sum = sum+ marks;



        }System.out.println( "avg. marks of students in the class: " +sum/phymarks.length);
*/ 


// QN NO.4----> CREATE A JAVA PROGRAM TO ADD TWO MATRICES OF SIZE 2 X 3 ..






// QN NO.5----> WRITE A JAVA PROGRAM TO FIND THE MAXIMUM ELEMENT IN JAVA ARRAY.
/* 
    
        int largest = Integer.MIN_VALUE; // - infinity  (minimum value)
        int numbers[] = { 2 , 13 , 6 , 16 , 10};

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest= numbers[i];
                
            }
         }    
            
            System.out.println("largest number in array is : " + largest);
*/



// QN NO.6----> WRITE A JAVA PROGRAM TO FIND THE MINIMUM ELEMENT IN JAVA ARRAY.
/* 
        int lowest = Integer.MAX_VALUE;   // + infinity value (maximum value)
        int numbers[] = { 2 , 13 , 6 , 16 , 10};
        for (int i = 0; i < numbers.length; i++) {
            if (lowest > numbers[i]) {
                lowest = numbers[i];
                
            }
         }    
       System.out.println( "lowest number is : " + lowest);

*/



// QN NO.7----> WRITE A JAVA PROGRAM TO REVERSE AN ARRAY..
/*
        int[] marks = {32,45,65,86,75,75,99};
            for (int i=marks.length-1; i>=0;i-- ){
                System.out.println(marks[i]);
            }
*/


// QN NO.8----> WRITE A JAVA PROGRAM TO FIND WHETHER AN ARRAY IS SORTED OR NOT ...












// QN NO.9 ------> WRITE A PROGRAM TO FIND THE SPECIFIC FOOD BY USER IN THE MENU WHICH IS ARRAY. 











/* QN NO.10 -------> WRITE A PROGRAMS TO FOLLOWING PAIRS OF GIVEN ATTAY IN JAVA..

              int numbers[] = { 2 , 4 , 6 , 8 , 10};

              EXPECTED OUTPUT ---->>
                (2,4) (2,6) (2,8 ) (2,10)
                (4,6) (4,8) (4,10 )
                (6,8) (6,10) 
                (8,10) 
*/

/*        int numbers[] = { 2 , 4 , 6 , 8 , 10};
        int  np = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];   // 2 , 4 ,6 ,8 , 10

            for( int j= i+1; j< numbers.length; j++){
                System.out.print( "(" + curr + " , "+ numbers[j]+ ") ");
                np++;
            }
            System.out.println();
        }
        System.out.println("numbers of pairs :" + np);

*/


/* QN NO.12 -------> write a program to print subarray
 
            int numbers[]={ 2 , 4 , 6, 8 ,10};

            expexted output -->

            2                           
            2 4 
            2 4 6
            2 4 6 8
            2 4 6 8 10

            4
            4 6 
            4 6 8
            4 6 8 10

            6
            6 8
            6 8 10

            8
            8 10
            
            10
*/             
        

 /*       int numbers[]={ 2 , 4 , 6, 8 ,10};
        System.out.println(numbers.length + "\n");
        int ts = 0;
       
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for(int j = i; j < numbers.length; j++){
                int end = j;

                for( int k = start; k<= end; k++) { 
                    
                System.out.print(numbers[k] + " ");     // printing subarray
                  
                }
            ts++;
            System.out.println();
            }
       
        System.out.println();

        }
        System.out.println( "total subarray: " + ts);
*/ 



// -------> write a program to find the  max subarray sum..
            // int numbers[]={ 2 , 4 , 6, 8 ,10};

/* 
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            int numbers[]={ 2 , 4 , 6, 8 ,10};
            for (int i = 0; i < numbers.length; i++) {
                for(int j = i; j< numbers.length; j++){
                    currsum = 0;

                    for(int k= i; k<= j; k++){

                        currsum = currsum + numbers[k];
                    }
               
                    System.out.println(currsum);
                    if (maxsum<currsum) {
                        maxsum = currsum;
                        
                    }
                }
            }
            System.out.println("maxsum is :" + maxsum);
*/

// -------> write a program to find the  max subarray sum using KADANE'S ALGORITHM..

// KADANE'S ALGORITHM ---->Kadane's Algorithm finds the maximum sum subarray, 
//                           and if all elements are negative, the maximum sum will be 0...time  complexity is very less 



            //int numbers[]={ -2 , -3 , 4, -1 ,-2 , 1, 5 , -3};

/* 
            int numbers[]={ -2 , -3 , 4, -1 ,-2 , 1, 5 , -3};


            int maxsum = Integer.MIN_VALUE;
            int currsum = 0;

            for (int i = 0; i < numbers.length; i++) {
                currsum = currsum + numbers[i];
                if (currsum<0) {
                    currsum = 0;
                 }
                    
                 maxsum = Math.max(currsum, maxsum);   // ------>> means>> if (maxsum<currsum) { maxsum = currsum;  }
                       
                    
               
            }

            System.out.println("our max subarray sum is : " + maxsum);
*/







  }
                                                                     


} 




