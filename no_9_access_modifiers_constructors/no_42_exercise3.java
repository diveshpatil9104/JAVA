package no_9_access_modifiers_constructors;
import java.util.Random;
import java.util.Scanner;


/**
 * no_44_exercise3
 */
public class no_42_exercise3 {

    public static void main(String[] args) {
/*        
        
QN ---->>   Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods:
    1. Constructor to generate the random number
    2. takeUserInput() to take a user input of number
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter for noofGuesses
        Use properties such as nooffuesses (int), etc to get this task done!
*/

    
        
    
        Game g = new Game();
        boolean b = false;
        while (!b) {
    
        g.takeuserinput();
        b = g.isCorrectNumber();

        }
       
   }
}



 
class Game{
    int number;
    int noofGuesses = 0;
    int inputnumber;


    

    // public int getNoofGuesses() {
    //     return noofGuesses;
    // }                               ------>>   Unnecessary functions

    // public void setNoofGuesses(int noofGuesses) {
    //     this.noofGuesses = noofGuesses;
    // }

    public Game(){
        Random rando = new Random();
        this.number = rando.nextInt(100);

    }

    public void takeuserinput(){
        System.out.print(" Guess the number : ");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();


    }

    public boolean isCorrectNumber(){
        noofGuesses++;
        if (inputnumber==number) {
            System.out.format(" yes you gussed it right congratualation it was %d \n you gussed in %d " , number , noofGuesses);
            return true;
            
        }else if (inputnumber<number) {
            System.out.println(" To less !! ");
            
        }else if (inputnumber >number) {
            System.out.println(" To high !!");
            
        }
        return false;

    }


}