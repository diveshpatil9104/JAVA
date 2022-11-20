package no_1_variables_and_datatypes;

import java.util.Scanner;

/**
 * no_5_takinginput
 */
public class no_5_takinginput {

    public static void main(String[] args) {
      System.out.print("taking input from user");
       
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("ENTER NUMBER 2 ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a+b;
        float sum = a+b;
        System.out.println("the sum of numbers");
        System.out.println(sum);


        // boolean b1 = sc.hasNextFloat();
        // System.out.println(b1);

        // String str = sc.nextLine();
        // System.out.println(str);

    }
}