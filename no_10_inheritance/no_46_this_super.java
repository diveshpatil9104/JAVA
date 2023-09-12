package no_10_inheritance;

/**
 * no_46_this_super
 */
public class no_46_this_super {

    public static void main(String[] args) {

        // Ekclass e = new Ekclass(2);
        // System.out.println(" " + e.geta());

        // Doclass d = new Doclass(5 );
        new Doclass(5 );


        
    }
}

class Ekclass{

    int a;

    public int geta(){
        return a;
    }
    Ekclass(){
        System.out.println(" I am constructor");
    }

    Ekclass(int a ){
        this.a = a;         //"this" REFERS TO THE INSTANCE VARIABLE "a"

    }
}


class Doclass extends Ekclass{
    Doclass(int c){
        super(c);         // Calls the constructor of the Parent class with "c" parameter
        System.out.println( " I am a constructor with value of c is :  " + c);
    }


}


/* ----->> THIS KEYWORD

-  THIS IS THE WAY OF US TO REFERENCE OF AN OBJECT OF THE CLASS WHICH IS BEING CREATED / REFERENCE

- THIS IS A REFERENCE TO THE CURRENT INSTANCE OF THE CLASS IN WHICH IT IS USED. IT ALLOWS YOU TO 
  ACCESS INSTANCE VARIABLES, METHODS, AND CONSTRUCTORS OF THE CURRENT OBJECT.

- COMMON USES OF THIS INCLUDE DIFFERENTIATING BETWEEN INSTANCE VARIABLES AND METHOD PARAMETERS
  WITH THE SAME NAME AND CALLING OVERLOADED CONSTRUCTORS FROM WITHIN OTHER CONSTRUCTORS.



----->> SUPER KEYWORD

A REFERENCE VARIABLE USED TO REFER IMMIDIATE PARENT CLASS OBJECT

-   SUPER IS A REFERENCE TO THE SUPERCLASS (PARENT CLASS) OF THE CURRENT CLASS. IT IS USED TO ACCESS OR CALL MEMBERS (METHODS OR VARIABLES) 
    OF THE PARENT CLASS WHEN THERE IS A METHOD OR VARIABLE WITH THE SAME NAME IN BOTH THE PARENT AND CHILD CLASSES.

-   SUPER() IS ALSO USED TO CALL A CONSTRUCTOR OF THE PARENT CLASS FROM A CONSTRUCTOR OF THE CHILD CLASS. 
    THIS IS ESPECIALLY USEFUL WHEN THE PARENT CLASS CONSTRUCTOR REQUIRES PARAMETERS.

*/