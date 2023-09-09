package no_10_inheritance;

/**
 * no_47_constructors_in_inheritance
 */
public class no_45_constructors_in_inheritance {

    public static void main(String[] args) {

        // Base1 b = new Base1();
        // Base1 b = new Base1(1);

        // Derived1 d = new Derived1();
        // Derived1 d = new Derived1(3 , 4);
        
        // ChildOfDerived child1 = new ChildOfDerived();
        new ChildOfDerived(34, 43 , 45);


      
    }
}


class Base1 {               // parent class

    Base1(){
        System.out.println("\n I am a constructor");
    }

    Base1(int x){
        System.out.println(" I am a overloaded constructor with value of x as: "+ x);
    }
}


class Derived1 extends Base1 {       // child class
    Derived1(){
        System.out.println(" I am a derived class constructor");
    }

    Derived1(int x , int y){
        super(x);
        System.out.println( " I am overloaded constructor with value of y is: " + y );
    }

}


class ChildOfDerived extends Derived1{     // grand child class

    ChildOfDerived (){
        System.out.println(" I am a chile of derived class constructor");

    }

    ChildOfDerived(int x , int y, int z){
        super(x , y);
        System.out.println( " I am overloaded constructor with value of z is: " + z);

     }

}




/*
----->> CONSTRUCTORS IN INHERITANCE 

    WHEN DERIVED1 CLASS IS EXTENDED FROM BASE1 CLASS , THE CONSTRUCTOR OF THE BASE CLASS IS EXECUTED FIRST FOLLOWED BY 
    THE CONSTRUCTOR OF DERIVED CLASS..

        FOR THE ABOVE INHERITANCE , THE CONSTRUCTORS ARE EXECUTED IN THE FOLLOWING ORDER
                
        1 ---- 2 ---- 3
                                            |     CONSTRUCTORS ARE
        C1 ---->> PARENT                    |        EXECUTE IN 
        C2 ---->> CHILD                     |     TOP TO BOTTOM ORDER 
        C3 ---->> GRAND CHILD              ⬇


        
---->> CONSTRUCTORS DURING CONSTRUCTOR OVERLOADING

    WHEN THERE ARE MULTIPLE CONSTRUCTORS IN A PARENT CLASS , THE CONSTRUCTOR WITHOUT ANY PARAMETERS IS CALLED 
    FROM THE CHILD CLASS .. 
    
    IF WE WANT TO CALL CONSTRUCTOR WITH PARAMETERS FROM THE PARENT CLASS , WE CAN USE SUPER KEYWORD

    super(a , b);

*/








 