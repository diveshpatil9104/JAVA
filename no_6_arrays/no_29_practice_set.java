package no_6_arrays;
import java.util.Scanner;





/**
 * no_29_practice_set
 */
public class no_29_practice_set {


// ----->> function for QN NO.8             int number[] = { 1 , 3, 8 , 5 , 6 , 7};


    public static boolean search( int numbers[]){
        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i-1]>numbers[i]) {
                
                return false;

                
            }
            
        }
        return true;

    }    

// ----->> function for QN NO.9
    public static int linsearch( String menu[] , String key){
        for( int i = 0; i < menu.length; i++){
                if ( menu[i] == key) {
                    return i;
                    } 
                }    
                    
            return -1;    


            }

    

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

        int matA[][] = new int [2][3];
        matA[0][0]= 1; 
        matA[0][1]= 2; 
        matA[0][2]= 3; 
        matA[1][0]= 1; 
        matA[1][1]= 2; 
        matA[1][2]= 3; 

        int matb[][] = new int [2][3];
        matb[0][0]= 1; 
        matb[0][1]= 2; 
        matb[0][2]= 3; 
        matb[1][0]= 1; 
        matb[1][1]= 2; 
        matb[1][2]= 3; 

        int sum[][] = new int [2][3];

        System.out.println(" Printing first matrix");

        for (int i = 0; i < matA.length; i++) {
            for(int j = 0; j<3; j++){
                System.out.print(" " + matA [i][j]);
            }
            System.out.println();
            
        }

        System.out.println(" Printing second matrix ");

        for (int i = 0; i < matb.length; i++) {
            for(int j = 0; j< 3; j++){
                System.out.print(" " + matb[i][j]);
            }
            System.out.println();
            
        }

        System.out.println("Sum of two matrix is : ");

        for (int i = 0; i < sum.length; i++) {
            for( int j = 0; j< 3; j++){
            sum[i][j] = matA[i][j] + matb[i][j];    

            System.out.print( " " + sum[i][j]);
            }   
            
         System.out.println();
        }
       

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

            int number[] = { 1 , 3, 4 , 5 , 6 , 7};
            System.out.println(search(number));






// QN NO.9 ------> WRITE A PROGRAM TO FIND THE SPECIFIC FOOD BY USER IN THE MENU WHICH IS ARRAY. 

            String menu[] = { "pavbhaji" , "vadapaav" , "paneer" , "chicken" , "aalu bhaji" , "puran poli" , "dosa" , "samosa"};
            String key = "vada rassa";
            int index = linsearch(menu, key);
                if (index ==-1) {
                    System.out.println(" sorry food is not in menu ");
                    
                }
                else {
                System.out.println("your food present in index : " + index);}
             


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



// QN NO.14-------> write a program to find the  max subarray sum..
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

// QN NO.15 -------> write a program to find the  max subarray sum using KADANE'S ALGORITHM..

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

 /*   QN NO.16 ---->> TRAPPING RAINWATER 
            
            Given n non-negative integers representing an elevation map where the width of each bar is 1 , compute how much
            water it can trap after raining 

            height =[ 4, 2, 0 , 6 , 3 ,2 ,5]
 */
            int height[] = { 4 , 2 , 0, 6 , 3 , 2 , 5 };
            int n = height.length;
             
            // calculating left max boundary array 
            
            int leftmax[] =  new int[n];
            leftmax[0] = height[0];

            for (int i = 1; i < height.length; i++) {
                leftmax[i] = Math.max(height[i], leftmax[i -1]); 
                // System.out.print(leftmax[i] + " ");   //just checking array is correct or not..

            }
            // calculating right max boundary array
            
            int rightmax[]= new int [n];
            rightmax[n-1] = height[n-1];

            for (int i = n-2; i >= 0; i--) {
                rightmax[i] = Math.max(height[i], rightmax[i+1]);
                // System.out.print(rightmax[i] + " " );  //just checking array is correct or not..
            
            }

            int trapped_water = 0;
            //loop

            for (int i = 0; i < n; i++) {
//                 water level = minimum of (left boundary , right boundary)
                    int water_level = Math.min(leftmax[i], rightmax[i]);

//                  trapped water = (water level - height of bar) * width of bar    (width of bar  =  1)
                    trapped_water +=  water_level - height[i];
               }

               System.out.println( "TRAPPED RAINWATER IN BAR : " + trapped_water);



/*  QN NO.17 -----> BUY AND SELL STOKES :
               
               YOU ARE GIVEN AN ARRAY PRICES WHERE prices[] IS THE PRICE OF A GIVEN STOKES ON THE ith DAY. YOU WANT TO
               MAXIMIZE YOUR PROFIT BY CHOOSING A SINGLE DAY IN THE FUTURE TO SELL THAT STOCK. 
               RETURN THE MAXIMUM PROFIT YOU CAN ACHIEVE FROM THIS TRANSACTION. IF YOU CANNOT ACHIEVE ANY PROFIT. return 
  
               int prices[] = {7 , 1 , 5 , 3 , 6 , 4}
*/  
            
            int prices[] = {7 , 1 , 5 , 3 , 6 , 4};
            int buy_prize = Integer.MAX_VALUE;  // + infinity value (maximum value)

            int max_profit = 0;

            for (int i = 0; i < prices.length; i++) {
                if ( buy_prize < prices[i]) {      // case for profit 
                    int profit =  prices[i] - buy_prize;   // todays profit 

                    max_profit = Math.max(max_profit, profit); 
                
                } else {
                    buy_prize = prices[i];
                }
                System.out.print( "$" + max_profit + " "  );
            }       
                System.out.println("\n");





/*  QN NO.19 ----> Spiral matrix  ->> this qn is was asked in GOOGLE , APPLE , MICROSOFT ,AMAZON, ORACLE INTERVIEWS


                    1 | 2 | 3 | 4
                    5 | 6 | 7 | 8 
                    9 |10 | 11| 12
                    13| 14| 15| 16

                expected output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 


*/
             int matrix[][] = { { 1 , 2 , 3 , 4 } , { 5 , 6 , 7 , 8  },
                                { 9 , 10 , 11 , 12 } , { 13 , 14 , 15 , 16 } };

            
            int start_row = 0;
            int start_coll = 0;
            int end_row = matrix.length -1;
            int end_coll = matrix[0].length-1;      
            
            while (start_row <= end_row && start_coll<=end_coll) {

                //top
                for (int j = start_coll; j<=end_coll; j++ ){
                    System.out.print(matrix[start_row][j] + " ");
                
                }
                

                // Right 
                for(int i = start_row+1; i<=end_row; i++){
                    System.out.print(matrix[i][end_coll] + " ");
                
                }
            
                
                // Bottom 
                for(int j = end_coll-1; j>=start_coll; j--){
                    if (start_row==end_row) {
                        break;

                    }
                    System.out.print(matrix[end_row][j] + " ");

                }
            

                // Left
                for(int i = end_row-1; i>=start_row+1; i--){
                    if (start_coll==end_coll) {
                        break;
                        
                        
                    }
                    System.out.print(matrix[i][start_coll] + " ");
                }
            
            start_coll ++;
            start_row ++;
            end_coll --;
            end_row --;

             }
           
            System.out.println();
             


            











    }

}                                                               







