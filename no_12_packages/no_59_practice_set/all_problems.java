package no_12_packages.no_59_practice_set;
import java.util.Scanner;



public class all_problems {
    public static void main(String[] args) {

// QN NO.2 ----->> USE A BUILD IN PACKAGE IN A JAVA TO WRITE A CLASS WHICH DISPLAY A MASSAGE BY USING SORT AFTER TAKING INPUT FROM THE USER 


        Massage mg = new Massage();
        mg.SortMassage();

/*  QN NO.3 ----->> CREATE A PACKAGE IN CLASS WITH THREE PACKAGE LEVEL Folder ----> Folder2 ----> Folder3

                        |-- Folder/
                        |   |-- Folder2/
                        |   |   |-- Folder3
                        |   |   |   |-- .class file
*/
   

// QN NO.4 ----->> PROVE THAT YOU CAN NOT ACCESS DEFAULT PROPERTY BUT CAN ACCESS PROTECTED PROPERTY FROM  OUTSIDE PACKAGE BY SUBCLASS ONLY..



    }
    
}
class Massage{
    
    public void SortMassage(){
        System.out.println("Enter your name : ");
        Scanner sc = new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println(name);


    }
}