package exercise5.shape;

public class exercise {
    public static void main(String[] args) {

        /* 
        YOU HAVE TO CREATE PACKAGE NAME exercise5.shape;
        - THIS PACKAGE SHOULD HAVE INDIVIDUAL CLASSES FOR RECTANGLE , SQUARE , CIRCLE , CYLINDER , SPHERE 
        - THIS CLASSES SHOULD USE INHERITANCE TO PROPERLY CODE
        - INCLUDE METHODS LIKE VOLUME , SURFACE AREA AND GETTERS/SETTERS FOR DIMENSION 
        
    */
                System.out.println("ANSWER OF EXERCISE - 5 ");
       
    }
    
}


class Shape{
    int dim1;
    int dim2;
    
    Shape(int dim1 , int dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    public int getDim1() {
        return dim1;
    }
    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }
    public int getDim2() {
        return dim2;
    }
    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}

class Rectangle extends Shape{
    Rectangle(int dim1 , int dim2){
        super(dim1, dim2);

    }
    public int area(){
        return this.dim1*this.dim2;
    }
}

class Square extends Shape{
    Square(int dim1){
        super(dim1, -1);

    }
    public int area(){
        return this.dim1*this.dim1;
    }
}

class Circle extends Shape{
    Circle(int dim1){
        super(dim1, -1);

    }
    public Double area(){
        return Math.PI*this.dim1*this.dim1;
    }
}

class Cylinder extends Shape{
    Cylinder(int dim1 , int dim2){
        super(dim1, dim2);
    }
    public double volcylin(){
       return (2*Math.PI*this.dim1*this.dim2) + (2*Math.PI*this.dim1*this.dim1); 
    }

}

class Sphere extends Shape{
    Sphere(int dim1){
        super(dim1, -1);


    }
    public double areasphere(){
        return 4*Math.PI*this.dim1*this.dim1;
    }
}

// NOTE --- AFTER DELETING THIS .java FILE IT IS NOT AFFECT .class FILE