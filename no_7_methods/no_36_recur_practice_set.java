package no_7_methods;



public class no_36_recur_practice_set {

//  ---------------------------------------- VARIOUS FUNCTION / METHODS ---------------------------------------------------------------------


    
// ----->> for QN no.1                          

    public static void dec_number(int n){
        if (n == 0) {     
            return;
        }    
        
        System.out.print(n + " "); 
        dec_number(n-1);                
    } 
       
// ----->> for QN no.2

    public static void inc_number(int n){
        if (n==0) {
            return;
        }

        inc_number(n-1);
        System.out.print(n+" ");
    }

// ----->> for QN no.3

    public static int fact_number(int n ){
        if (n==0 || n==1){
            return 1;
        }
        

         return n* fact_number(n-1);
        
    }

// ----->> for QN no.4

    public static int sum_natural(int  n ){
        if (n==1) {

            return 1;
            
        }
        return n+sum_natural(n-1);

    }

// ----->> for QN no.5

    public static int fibbo_number(int n){
        if (n == 1) {
            return 0;
        } else if (n==2){
            return 1;
        }

        
        return fibbo_number(n-1)+fibbo_number(n-2);
        
    }

// ----->> for QN no.6

    public static boolean sorrted_arr( int arr[] , int i){

        if (arr[i] == arr.length-1) {
            return true;
            
        }else if (arr[i] > i+1){
            return false;
        }

        return sorrted_arr(arr, i+1);


    }


// ----->> for QN no.7 
    
    public static int fir_occar(int arr[] , int key , int i){

        if(i==arr.length){
            return -1;
            
        }
        else if (arr[i]==key){
            return i;
        }
        return fir_occar(arr, key , i+1); 
    }
 

// ----->> for QN no.8

    public static int last_occar(int arr[] , int key , int i){
        if (i==arr.length) {
            return -1; 
         }    
         int isfound = last_occar(arr, key, i+1);
         if (isfound == -1 && arr[i] == key) {
            return i;
            
         }
         return isfound;

    }

// ----->> for QN no.9

    public static int power(int i , int n){
        if (n==0) {
            return 1;            
        }

        return i * power( i , n - 1);
    }

// ----->> for QN no.10 

    public static int opti_power( int i , int n){

        if (n==0) {
            return 1;
        }  
        int halfpower = opti_power(i, n/2);
        int halfpowersq = halfpower*halfpower;

        //if n is odd then 
        if (n%2 != 0) {
            halfpowersq = i* halfpowersq;
            
        }
        return halfpowersq;
        
        
    }

// ----->> for QN no.11

    public static int tiling_problem( int n ){   // 2 * n is the floor size and n determine the length

        if (n==0 || n==1) {
            return 1;
        
        }
            
        // prossecing 
        // vertical choice 
        int vertical_choice = tiling_problem(n-1);

        // horizantal choice 
        int horizantal_choice = tiling_problem(n-2);

        return vertical_choice + horizantal_choice;


    }

// ----->> for QN no.12

    public static void remove_duplicate (String str , int idx , StringBuilder newstr, boolean map[] ){

        if (idx == str.length()) {
            System.out.println(newstr);
            return;
        }    
        
        // processing

       char currchar = str.charAt(idx);
       
       if (map[currchar-'a'] == true) {
         //duplicate 
        
        remove_duplicate(str, idx+1, newstr, map);
        } 
        else{
            map[currchar - 'a'] = true;
            remove_duplicate(str, idx+1, newstr.append(currchar), map); 
            
        }
        
    }   

    
// ----->> for QN no.13

     public static int pairing(int n ){
        if (n==1 || n==2) {
            return n;
            
        }
        // single 
        int single = pairing(n-1);

        // pair
        int pair = pairing(n-2);

        return single + (n-1) * pair;
     }

// ----->> for QN no.14

     public static void printbinstring(int n , int lastplace , String str){

        if (n==0) {
            System.out.println(str);
            return;
        }
        // processing
        printbinstring(n-1, 0, str+"0");

        if (lastplace==0) {
            printbinstring(n-1, 1, str+"1");
        
        }
    }


     
//  -------------------------------------------- MAIN FUNCTION ---------------------------------------------------------------------




     
     public static void main(String[] args) {

        System.out.println("\nTHIS PRACTICE SET CONTAINS RECURSION PROBLEMS ----->> \n");


//  QN NO.1 ---->> PRINT NUMBERS FROM N TO 1 IN REVERSE ORDER 

//        int n = 10;
//        dec_number(n);


//  QN NO.2 ---->> PRINT NUMBERS FROM N TO 1 IN INCREASING ORDER 

        // int num = 10;
        // inc_number(num);


//  QN NO.3 ---->> PRINT FACTORIAL OF N 

        int num2 = 5;
        System.out.println(fact_number(num2));


//  QN NO.4 ---->> SUM OF N NATURAL NUMBERS

        // int num3= 10;
        // System.out.println(sum_natural(num3));


  

//  QN NO.5 ---->> PRINT NTH FIBONACII NUMBERS     (0 1 1 2 3 5 8 13 ...) SUM OF n-1 and n-2

        int num3= 5;
        System.out.println(fibbo_number(num3));


//  QN NO.6 -----> CHECK GIVEN ARRAY IS SORTED OR NOT 

        int numbers[] = { 1 , 2 , 3 , 4 , 5};  
       System.out.println(sorrted_arr(numbers, 0)); 


//  QN NO.7 ------> WRITE A RECURSION  FUNCTION FIND FIRST OCCURANCE OF AN ELEMENT IN ARRAY 


        int numbers2[] = { 1 , 4 ,5 ,6 ,7 ,8 , 9 , 5};
        int key =5;
        fir_occar(numbers2, key ,0);
        
        if (fir_occar(numbers2, key, 0)==-1) {
             System.out.println("key not found");
        }
       
 
        
//  QN NO.8 ------> WRITE A RECURSION  FUNCTION FIND LAST OCCURANCE OF AN ELEMENT IN ARRAY 

                int numbers3[] = { 1 , 4 ,5 ,6 ,5 ,8 , 5 , 8};
                int key2 = 5;
               

                System.out.println( last_occar(numbers3, key2, 0));
             

//  QN NO.9 ------> PRINT X^n    ( 2^10 ----> 1024)

            int num4 = 2;
            int power = 10;

            System.out.println(power(num4 , power));


//  QN NO.10 ------> //  QN NO.9 ------> PRINT X^n IN OPTIMIZE WAY    ( 2^10 ----> 1024)

            int num5 = 2;
            int power2 = 10;

            System.out.println(power(num5 , power2));




/* 
  QN NO.10 ------>       TILING  PROBLEM
                Given a "2 x n" floor and tiles of size "2 × 1", count the number of ways to tile the given board using the 2 x 1 tiles.
              ( A tile can either be placed horizontally or vertically.)  // qn asked in amazon and google 
*/


        int n = 4;
        System.out.println(tiling_problem(n));



// QN NO.11 ------>  REMOVE DUPLICATES IN A STRING :: " DIIVESHH PAATILL"       ---->> ASKED IN GOOGLE AND MICROSOFT 
//                     STRING CHARACTER SHOLD BE "a - z"  ONLY 


        String str = "ddiveesshh";
        StringBuilder newstr = new StringBuilder("");     // THIS DATA TYPE IS SAME AS String but this is faster in processing 
        boolean map[] = new boolean[26]; 

        remove_duplicate( str, 0, newstr, map);
    


        
/*    
  QN NO.12 ------>    FRIENDS PAIRING PROBLEME              ------>> ASKED IN GOLDMAN SACHS
        
        Given n friends, each one can remain single or can be paired up with some other friend. 
        Each friend can be paired only once. Find out the total number of was in which friends can remain single 
        or can be paired up. 
*/
        int friends = 10;
        System.out.println( pairing(friends) + "\n" );




//  QN NO.14 ------> Binary string problem     
//  print all binary string of size n without consecutive ones.. (consecutive one means eg 110100  1 is double ) ---->> asked in paytm 
        

        printbinstring(3, 0, "");
        

    

    }


}   