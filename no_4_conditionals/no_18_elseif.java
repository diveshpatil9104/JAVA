package no_4_conditionals;

import java.util.Scanner;
import java.util.jar.Attributes.Name;


/**
 * no_18_elseif
 */
public class no_18_elseif {

    public static void main(String[] args) {
        // int age;
        // System.out.print("ENTER UR AGE : ");
        // Scanner sc= new Scanner(System.in);
        // age = sc.nextInt();

        // if (age>=105){
        // System.out.println(" U ARE ALREDY DIED");
        // }

        // else if (age>80){
        // System.out.println("U ARE VERY OLDER AND GOING TO DEAD ");
        // }
        // else if (age>60){
        // System.out.println("U ARE OLDER");
        // }
        // else if (age>40){
        // System.out.println("U ARE IN MIDDLE AGE ");
        // }
        // else if (age>20){
        // System.out.println("U ARE YOUNG");
        // }
        // else if (age>15){
        // System.out.println(" U ARE TEENAGER");
        // }
        // else {
        // System.out.println("U ARE CHILD");
        // }

        // ---------> SWITCH CASE <--------

        String name;


        System.out.print("ENTER UR NAME : ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();

        switch (name) {
            case "sagar":
                System.out.println("YOUR FULL NAME IS\n SAGAR AMRUT PATIL ");
                break;

 //         case "sagar"-> System.out.println("YOUR FULL NAME IS\n SAGAR AMRUT PATIL");
                //..we also use this type of format for case but remember we use only one type of format in switch 
            
            
            case "chetan":
                System.out.println("YOUR FULL NAME IS\n CHETAN SHASHIKANT PAWAR ");
                break;

            case "harshal":
                System.out.println("YOUR FULL NAME IS\n HARSHAL VIKAS PATIL ");
                break;

            case "tejas":
                System.out.println("YOUR FULL NAME IS\n TEJAS VIJAY PATIL ");
                break;

            case "divesh":
                System.out.println("YOUR FULL NAME IS\n DIVESH DEVENDRA PATIL ");
                break;
            case "bhushan" :
                System.out.println(" YOUR FULL NAME IS\n BHUSHAN NANA PATIL ");

            default:
                System.out.println("UR NOT PRESENT IN LIST ");

        }

        System.out.println("thanks for using my java code ");



    }
}
    
