package no_11_abstract_classes_interfaces;

public class no_52_interfaces {
    public static void main(String[] args) {
        
    
/* 
     INTERFACE IN ENGLISH IS A POINT WHERE TWO SYSTEM MEET AND INTERACT
    IN JAVA INTERFACE IS A GROUP OF RELATE METHODS WITH EMPTY BODIES 
    OBJECT OF INTERFACE IS NOT POSSIBLE 

----->> INTERFACES PROPERTIES 

-   ALL METHODS ARE PUBLIC , ABSTRACT & WITHOUT IMPLEMENTATION
-   USE TO ACHIVE TOTAL ABSTRACTION 
-   VARIABLE IN A INTERFACES ARE FINAL , PUBLIC AND STATIC 

*/

        Queen queen = new Queen(); 
        queen.moves();

        
        Rook rook = new Rook();
        rook.moves();

        King king = new King();
        king.moves();

        Bear bear = new Bear();
        bear.eatgrass();
        bear.eatmeat();


    }
}

interface ChessPlayer{
    
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){                    //----> public is compulsary
        System.out.println("\n Up - Down - Right - Down - Diagonal\n");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println(" Up - Down - Right - Left\n");
    }
    
}

class King implements ChessPlayer{

    public void moves(){
        System.out.println(" 1 STEP = Up - Down - Left - Right\n");
    }
}


// -----> MULTIPLE INTERFACES

interface Herbivore{
    void eatgrass();


}

interface Carnivore{
    void eatmeat();

}

class Bear implements Herbivore , Carnivore {

    public void eatgrass(){
        System.out.println("\nBear eating glass");
    }

    public void eatmeat(){
        System.out.println("Bear eating meat\n");
    }

}   

/*

        Multiple Inheritance:---->>
        java supports multiple interface inheritance, meaning a class can implement multiple interfaces. 
        This allows you to inherit functionality from multiple sources, which is not possible with class inheritance 
        (where a class can inherit from only one superclass).








*/
