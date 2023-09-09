package no_10_inheritance;

public class no_44_inheritance {
    public static void main(String[] args) {
//      INHERITANCE IS USED TO BORROW PROPERTIES AND METHODS FROM AN EXISTING CLASS 

        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        
        // b.sety(4);                            // ---->> this lines of code produce error bcoz we extends base is derived so..y is not in Base class 
        // System.out.println(b.gety());




        Derived d = new Derived();           // ----->> here we also set setX from derived class ...bcoz we have all copies of base class due to inheritance 
        d.setX(69);
        System.out.println(d.getX());

        d.setY(43);
        System.out.println(d.getY());
    }
    
}



class Base {

    int x;

    public int getX() {
        System.out.println(" I am in Base and setting x now ");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


}


class Derived extends Base{         // INHERITACE IN JAVA IS DECLARED USING the extends KEYWORD (HERE Derived CLASS GET ALL PROPERTIES OF Base CLASS )

    int y;
    public int getY(){
        return y;

    }
    public void setY(int y){
        this.y = y;
    }
}