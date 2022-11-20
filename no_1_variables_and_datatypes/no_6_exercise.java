package no_1_variables_and_datatypes;
import  java.util.Scanner;

/**
 * no_6_exercise
 */
public class no_6_exercise {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("ENTER THE MARKS OF GIVEN SUBJECTS ;");
     System.out.print("marathi : ");
     int a = sc.nextInt();

     System.out.print("english : ");
     int b = sc.nextInt();

     System.out.print("math : ");
        int c =sc.nextInt();

     System.out.print("hindi : ");
        int d= sc.nextInt();

     System.out.print("science : ");
        int e = sc.nextInt();

    System.out.print("the sum of ur marks is : ");
    int sum = a+b+c+d+e;
    System.out.println(sum);
    
    System.out.print("ur % is : ");
    int per = sum/5 ;
    System.out.print(per);


    }
}