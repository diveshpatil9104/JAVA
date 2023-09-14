package no_10_inheritance;

public class no_50_practice_set {

    public static void main(String[] args) {
        

// QN NO.1 -----> CREATE THE CLASS Circle AND USE INHERITANCE TO CREATE ANOTHER CLASS Cylinder FROM IT 

            Circle circle = new Circle(3);
            System.out.println("\n Area of circle : " + circle.AreaOfCircle());

            Cylinder2 cylinder = new Cylinder2(4 , 6);
            System.out.println(" Volume of cylinder : "+cylinder.VolumeOfCylinder());



// QN NO.2 -----> CREATE A CLASS Rectangle AND USE INHERITANCE TO CREATE ANOTHER CLASS Cuboid.
//                TRY TO KEEP IT AS CLOSE TO REAL WORLD SCENARIO AS POSSIBLE...FIND AREA OF RECTANGLE AND SURFACE AREA OF CUBOID

            Rectangle1 rectangle = new Rectangle1(34, 2);
            System.out.println("\n Area of rectangle :  " + rectangle.AreaOfRectangle());
            
            Cuboid cuboid = new Cuboid(2, 7, 5);
            System.out.println(" Surface area of cuboid : " + cuboid.SurfaceAreaCuboid() );



// QN NO.3 -----> CREATE METHODS FOR AREA AND VOLUME IN QN NO.1 

            System.out.println("\n SOLVED IN QN NO.1\n");



// QN NO.4 -----> CREATE METHODS FOR AREA AND VOLUME IN QN NO.2 ALSO CREATE GETTERS AND SETTERS

            // Rectangle2 rectangle2 = new Rectangle2(34, 2);
            // System.out.println("\n Area of rectangle :  " + rectangle2.AreaOfRectangle2());
            
            // Cuboid1 cuboid1= new Cuboid1(2, 7, 5);
            // System.out.println(" Surface area of cuboid : " + cuboid1.SurfaceAreaCuboid1() );


            Rectangle2 rectangle2 = new Rectangle2();
            rectangle2.setBreadth(3);
            rectangle2.setLength(4);
            System.out.println(" Area of rectangle :  " + rectangle2.AreaOfRectangle2());
            
            
            Cuboid1 cuboid1= new Cuboid1();
            cuboid1.setBreadth(7);
            cuboid1.setHeight(2);
            cuboid1.setLength(5);
            System.out.println(" Surface area of cuboid : " + cuboid1.SurfaceAreaCuboid1());



/* QN NO.5 -----> WHAT IS THE ORDER OF CONSTRUCTOR EXECUTION FOR THE FOLLOWING INHERITANCE HIERARCHY

                             Base
                              |
                            Derived1
                              |
                            Derived2
            
            Derived2 obj = new Derived2();
            WHICH CONSTRUCTORS WILL BE EXECUTED & IN WHAT ORDER ?
*/
   

            System.out.println("\n EXECUTION WILL BE :  Base ----> Derived1 ----> derived2 \n");



    }
    
}




// FOR QN NO.1

class Circle{

    int radius;

    Circle(){
        System.out.println("I am circle without parameters");
    }
    Circle(int r){
        this.radius = r;
    }
    
    public double AreaOfCircle(){
        return Math.PI*this.radius*this.radius;

    }
}

class Cylinder2 extends Circle{

    int height;

    Cylinder2(){
        System.out.println("I am cylinder without parameter");
    }
    Cylinder2(int r, int h){
        super(r);
        this.height = h;

    }

    public double VolumeOfCylinder(){
        return (2*Math.PI*this.radius*height) + (2*Math.PI*this.radius*this.radius); 
    }
}


// FOR QN NO.2

class Rectangle1{

    int length;
    int breadth;

    Rectangle1(){
        System.out.println("I am rectangle without perameters");
    }
    Rectangle1(int l , int b){

        this.length = l;
        this.breadth = b;

    }

    public double AreaOfRectangle(){
        return this.length * this.breadth;

    }
}

class Cuboid extends Rectangle1{

    int height;


    Cuboid(){
        System.out.println("I am cuboid without perameters");

    }
    Cuboid(int h , int b, int l){
        super(l , b);
        this.height = h;


    }
    public double SurfaceAreaCuboid(){
        return  (this.length*this.breadth + this.length*this.height + this.breadth*this.height)*2;

        

    }

}


// FOR QN NO.4


class Rectangle2{

    int length;
    int breadth;

    Rectangle2(){
        System.out.println(" I am rectangle2 without perameters");
    }

    
    public void setBreadth(int b) {
        this.breadth = b;
    }
    public int getBreadth() {
        return this.breadth;
    }
    
    
    public void setLength(int l){
        this.length = l;
    }
    public int getLength(){
        return this.length;
    }

    Rectangle2(int l , int b){
        this.length = l;
        this.breadth = b;
    }
    
    public double AreaOfRectangle2(){
        return this.length * this.breadth;

    }
}


class Cuboid1 extends Rectangle2{

    int height;


    public int getHeight() {
        return this.height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    Cuboid1(){
        System.out.println(" I am cuboid without perameters");

    }
    Cuboid1(int h , int b, int l){
        super(l , b);
        this.height = h;


    }
    public double SurfaceAreaCuboid1(){
        return  (this.length*this.breadth + this.length*this.height + this.breadth*this.height)*2;

        

    }

}