package no_9_access_modifiers_constructors;



public class no_43_practice_set {
    public static void main(String[] args) {
        

// QN NO.1 ----->> CREATE A CLASS Cylinder AND USE GETTERS AND SETTERS TO SET THE RADIUS AND HEIGHT ..

        Cylinder cylinder = new Cylinder();
        cylinder.setheight(12);
        cylinder.setradius(9);
        System.out.println("\n HEIGHR OF CYLINDER IS : "+cylinder.getheight());
        System.out.println(" RADIUS OF CYLINDER IS : "+cylinder.getradius());

        

// QN NO.2 ------>> USE QN NO.1 CLASS FOR CALCULATING SUFACE AREA AND VOLUME OF CYLENDER..

        System.out.println("\n SURFACE AREA OF CYLENDER IS : " + cylinder.surfacearea());
        System.out.println(" VOLUME OF CYLENDER IS : " + cylinder.volume());



// QN NO.3 ------->> USE CONSTRUCTOR AND REPEAT QN NO.1 

        Cylinder2 cylinder2 = new Cylinder2(30, 69);
        System.out.println("\n HEIGHT OF CYLINDER 2 IS : "+cylinder2.getheight());
        System.out.println(" RADIUS OF CYLINDER 2 IS : "+cylinder2.getradius());



// QN NO.4 ----->> OVERLOAD THE CONSTRUCTOR USE TO INITIALIZE A RECTANGLE OF LENGTH 4 AND BREADTH 5 FOR USING CUSTOM PARAMETERS  

        Rectangle rectangle = new Rectangle( 5 ,6);
        System.out.println("\n LENGHTH OF RECHANGLE IS : " + rectangle.getlength());
        System.out.println(" LENGHTH OF BREADTH IS : " + rectangle.getbreadth());



    }
    
}

class Cylinder{

    private int radius;
    private int height;
    

    public void setradius(int n){
        this.radius = n;
    }

    public int getradius(){
        return this.radius;
    }

    public void setheight(int n){
        this.height = n;
    }

    public int getheight(){
        return this.height;
    }

                        //  math.PI is use for get accurate value of pi..

    public double surfacearea(){
        return (2 * Math.PI * radius * radius) + ( (2 * Math.PI * radius *height));
    }

    public double volume(){
        return  Math.PI * radius * radius * height;       
    }

}


class Cylinder2{

    int radius;
    int height;

    public Cylinder2(int radius , int height){
        this.radius = radius;
        this.height = height;


    }
    public int getradius(){
        return radius;
    }
    public int getheight(){
        return height;
    }

}


class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    
    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    public int getlength(){
        return length;
        
    }
    public int getbreadth(){
        return breadth;
    }




}