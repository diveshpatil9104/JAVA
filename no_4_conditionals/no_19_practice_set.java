package no_4_conditionals;
import java.util.Scanner;




/**
 * no_19_practice_set
 */
public class no_19_practice_set {

    public static void main(String[] args) {
        
// QN NO.1 ----> WHAT WILL BE THE OUTPUT OF THE GIVEN PROGRAM 
//        int a = 10;  
//        if (a == 11){
//              System.out.println(" i am 11");
//  }
//         else {
//              System.out.println ("i am not 11");
//   }
        System.out.println(" YOUR ANS IS: I AM NOT 11 ");


// QN NO.2 ----> WRITE A PROGRAM TO FIND OUT WHETHER A STUDENT IS PASS OR FAIL , IF IT REQUIRES TOTAL 40% AND ATLEAST 33%
//               IN EACH SUBJECT TO PASS..ASSUMR 3 SUBJECTS AND TAKE MARKS AS AN INPUT FROM THE USER 

    /*    Scanner marks = new Scanner(System.in);
        System.out.print("ENTER YOUR NAME: ");
        String name = marks.nextLine();
        System.out.print("ENTER THE MARKS OF CHEMESTRY : ");
        int a = marks.nextInt();

        System.out.print("ENTER THE MAERS OF PHYSICS : ");
        int b = marks.nextInt();

        System.out.print("ENTER THE MARKS OF MATH : ");
        int c = marks.nextInt();
        int totalm = a + b + c;
        System.out.println(name + " YOUR TOTAL MARKS IS : " + totalm);
        float per = (a + b + c) / 3 ;
        System.out.println(name + " YOUR PERCENTAGE IS: "+ per);


        if (a<33) {
            System.out.println(name.toUpperCase() + " YOU ARE FAIL");

        }
        else if (b < 33) {
            System.out.println(name.toUpperCase() + " YOU ARE fAIL");
        }

        else if (c < 33){
            System.out.println(name.toUpperCase() + " YOU ARE fAIL");
        }
        else if (per < 40){
            System.out.println(name.toUpperCase() + " YOU ARE fAIL");
        }
       
        else {
            System.out.println(name.toUpperCase() + " CONGRATS!! YOU ARE PASS ");
        }

-------------------------------------------OR-------------------------------------------------------

        if ((a < 33) || (b < 33) || (c < 33)  || (per < 40)) {
        System.out.println( name + " sorry ur fail ");
        }
        else {
        System.out.println(name + " congrats !! ur pass");
      }
 */ 

// QN NO.3 ----> CALCULATE INCOME TAX PAID BY AN EMOLOYEE TO THE GOVERMENT AS PER THE SLOTE MENTIONED BELOW..
//                 INCOME SLOTE            TAX
//                2.5 L - 5.0 L            05 %
//                5.0 L - 10.0 L           20 %        
//                 ABOVE 10.0 L            30 %

   /*   Scanner sc = new Scanner(System.in);
        System.out.print("ENTER UR INCOME : ");
        double a = sc.nextDouble();
        

        if (a>=250000 && a<500000){
            System.out.println("UR TAX: " + (a/100)*5);
        }
        else if (a>=500000 && a<1000000){
            System.out.println("UR TAX: " + (a/100)*20);
        }
        else if (a>=1000000){
            System.out.println("UR TAX: " + (a/100)*30);
        }
        else {
            System.out.println("UR INCOME IS BELOW 2.5L ...SO U ARE NOT ABLE TO TAX PAY");
        }
     */


// QN NO.4 ----> WRITE A JAVA PROGRAM TO FIND OUT THE NUMBER DAY OF THE GIVEN THE NUMBER 
//               [1 FOR MONDAY , 2 FOR TUESDAY , 3 FOR WEDNESDAY....AND SO ON ]

/*      Scanner day = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF THE DAY IN WEEK : ");
        int a = day.nextInt();

        switch(a){

            case 1 :
            System.out.println("monday");
            break;

            case 2 :
            System.out.println("tuesday");
            break;

            case 3 :
            System.out.println("wednesday");
            break;

            case 4 :
            System.out.println("thusrsday");
            break;

            case 5 :
            System.out.println("friday");
            break;

            case 6 :
            System.out.println("saturday");
            break;

            case 7 :
            System.out.println("sunday");
            break;

            default :
            System.out.println("there is no day at this number");



        }
        System.out.println("thanks for using my code....😌");
*/


// QN NO.5 ----> WRITE A JAVA CODE TO FIND WHETHER A YEAR ENTERED BY USER IS A LEAP YEAR OR NOT... 

/*      Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE YEAR: ");
        int y = sc.nextInt();
        //int leap = y % 4 ; 
        
        if (y % 4==0) {
            System.out.println("YES!! IT IS A LEAP YEAR");
        }
        else {
            System.out.println("NOT!! IT IS NOT A LEAP YEAR");
        }
*/


// QN NO.6 ----> WRITE A PROGRAM TO FIND OUT THE TYPE OF WEBSITE FROM THE URL ....
//              .com ----> commercial website 
//              .org ----> organization website
//              .in  ----> indian website

         Scanner sc= new Scanner(System.in);
        System.out.print(" ENTER THE URL OF WEBSITE: ");
        String url = sc.nextLine();

        if(url.endsWith(".com")){
            System.out.println("IT IS COMMERCIAL WEBSITE");
        }
        else if (url.endsWith(".org")) {
            System.out.println("IT IS ORGANIZATION WEBSITE");
        }
        else if (url.endsWith(".in")) {
            System.out.println("IT IS INDIAN WEBSITE");   
        }
        else {
            System.out.println("RECOED NOT FOUND !!🧐");
        }
    
    System.out.println("THANKS!! PRACTICE SET OF CHAPTER 4 IS COMPLETED");


    
    }
}
