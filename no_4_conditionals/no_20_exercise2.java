package no_4_conditionals;
import java.util.Random;
import java.util.Scanner;



/**
 * no_20_exercise2
 */
public class no_20_exercise2 {

    public static void main(String[] args) {

//  EXERCISE ====> MAKE ROCK , PAPER , SESSOR GAME USING COMPUTER GENERATOR NUMBERS (RANDOME METHOD)... 


    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER \n0 FOR ROCK\n1 FOR PAPER\n2 FOR SCISSOR  ");
    int userInput = sc.nextInt();

    Random rm = new Random();
    int computerInput = rm.nextInt(3);

    if (userInput == computerInput){
        System.out.println("DRAW");
    }
    else if (userInput ==0 && computerInput ==2 || userInput==2 && computerInput==1 || userInput==1 && computerInput==0){
        System.out.println("YOU WIN ");
    }
    else {
        System.out.println("YOU LOSE ");
    }

    if (computerInput==2){
        System.out.println("COMPUTER CHOICE: SCISSOR");
    }
    else if (computerInput==1){
        System.out.println("COMPUTER CHOICE: PAPER");
    }
    else if (computerInput==0){
        System.out.println("COMPUTER CHOICE: ROCK");
    }
    }
}


//  NOTE : IN THIS PROGRAM SOME CONCEPT ARE NEW ....LIKE (RANDOME METHOD) THESE CONCEPTS WE LEARN IN NEXT LECTURES..