package no_11_abstract_classes_interfaces;

public class no_51_abstract {
    public static void main(String[] args) {

        new Child();  // ALLOWED TO CREATE OBJECT
        
        // Parent p = new Parent(); //   ---- error ABSTRACT CLASS IS NOT ALLOWED TO CREATE OBJECT
            
        // Child2 ch2 = new Child2();  // ----- error

        Horse horse = new Horse();
        horse.eats();
        horse.walk();
        horse.changecolour();
        
        System.out.println();                           //  just for new line 
        
        Chicken chicken = new Chicken();
        chicken.eats();
        chicken.walk();
        chicken.changecolour();
    }
    
}


abstract class Parent{
    public Parent(){
        System.out.println(" I am a constructor of base2");
    }

    abstract public void msg();    
    abstract public void msg2();        // ----->> for abstract function we should also turn parent class into abstract 

}

class Child extends Parent{

    @Override

    public void msg(){
        System.out.println("Good morning");
    }
    @Override
    public void msg2(){
        System.out.println("Good Afternoon");
    }

}

abstract class Child2 extends Parent{
    public void name(){
        System.out.println("my name is raj patil");
        
    }
    public void msg(){
        System.out.println("Good evening");
    }



}

/*
--------> ABSTRACT METHOD 
        
        THAT IS DECLARED WITHOUT AN IMPLEMENTATION

-------> ABSTRACT CLASS 

        IF A CLASS INCLUDES ABSTRACT METHIDS THEN THE CLASS ITSAY MUST BE DECLARED ABSTRACT.
        

------->  ABSTRACTION: 

    ABSTRACT CLASSES PROVIDE A WAY TO DEFINE COMMON CHARACTERISTICS AND BEHAVIORS FOR A GROUP OF RELATED CLASSES. 
    THEY ALLOW YOU TO CREATE A BLUEPRINT OR TEMPLATE FOR OTHER CLASSES, ENFORCING A CERTAIN STRUCTURE AND SET OF METHODS 
    THAT SUBCLASSES MUST IMPLEMENT. THIS HELPS IN ABSTRACTING AWAY THE COMMON FUNCTIONALITY AND PROVIDING A CLEAR INTERFACE 
    FOR DERIVED CLASSES TO FOLLOW.

 ---->> ABSTRACT CLASS ALSO HAVE CONSTRUCTOR 

2ND EXAMPLE FOR ABSTRACTION ---->>
    */

abstract class Animal{       
    String colour;   
    
    Animal(){                           //------>> CREATING CONSTRUCROR
        colour = "red";
        
    }


    void eats(){
        System.out.println("Animal eats");
    }

    abstract void walk();

}

class Horse extends Animal{

    void changecolour(){
        colour = "brown";
        System.out.println("colour : " + colour);

    }
    void walk(){
        System.out.println("Horse walk on 4 legs ");
    }

}

class Chicken extends Animal{
    void changecolour(){
        colour = "white";
        System.out.println("colour : " + colour);

    }

    void walk(){
        System.out.println("Chicken walk on 2 legs");
    }
}


