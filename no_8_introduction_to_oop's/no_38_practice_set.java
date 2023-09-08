
public class no_38_practice_set {

    public static void main(String[] args) {

/* 
QN NO.1 ---->> CREATE A CLASS EMPLOYEE WITH FOLLOWING PROPERTIES AND METHODS 

        salary (property ) int
        getsalary (method returning int)
        name - (property string) 
        getname (method returning string)
        setname (method changing name )
*/    

        Employee tejas = new Employee();
        tejas.setname("Tejas vijay patil ");
        tejas.salary = 7837829;
        System.out.println(tejas.getname());
        System.out.println(tejas.getsalary() + "\n");


// QN NO.2 ---->> CREATE A CLASS CELL PHONE WITH METHODS TO PRINT "RINGING" , "VIBRATING"


        Cellphone call = new Cellphone();
        call.callingfriend();
        call.forringing();
        call.forvibrate();


// QN NO.3 ---->> CREATE A CLASS SQUARA  WITH METHODS TO INITIALIZE ITS SIDE , CALCULATING AREA AND PERIMETER 

        Square sq = new Square();
        sq.side = 2;
        sq.area();
        sq.perimeter();


// QN NO.4 ---->> CREATE A CLASS RECTANGLR  WITH METHODS TO INITIALIZE ITS SIDE , CALCULATING AREA AND PERIMETER 

        Rectangle rc = new Rectangle();
        rc.lenggth = 2;
        rc.width = 2;
        rc.area();
        rc.perimeter();


// QN NO.5 ---->> CREATE A CLASS TOMMY FOR ROCKSTAR GAMES.. CAPABLE OF hitting(print hitting..) , running , firingb

        Tommy rockstar_character = new Tommy();
        rockstar_character.name = "tommy";
        System.out.println(rockstar_character.name + "\n");
        rockstar_character.running();
        rockstar_character.hitting();
        rockstar_character.fighting();
        rockstar_character.firing();


    }


    
}

// FOR QN NO.1 
class Employee{


    int salary;
    String name;


    public String getname(){
        return name;

    }

    public int getsalary(){

        return salary;
    }

    public void setname(String n){
        name = n;
        
    }

}


// FOR QN NO.2
class Cellphone{



    public void forringing(){
        System.out.println("Ringing...");
    }

    public void forvibrate(){
        System.out.println("\nVibrating...\n");
    }

    public void callingfriend(){
        System.out.println("\nCalling Chetan...\n");
    }
}


// FOR QN NO.3
class Square{


    int side;
    int perimeter ;

    public void area(){
        System.out.println("\n AREA OF SQUARE IS : "+side*side);
    }

    public void perimeter(){
        perimeter = side + side +side +side;
        
        System.out.println("PERIMETER OF SQUARE IS : " + perimeter + "\n");
    }
}


// FOR QN NO.4
class Rectangle{


    int lenggth;
    int width;
    int perimeter;

    public void area(){
        System.out.println("AREA OF RECTANGLR IS : " + lenggth*width);
    }
    public void perimeter(){
        perimeter = (lenggth + width) *2 ; 
        System.out.println("PERIMETER OF RECTANGLE IS : " + perimeter + "\n");
        
    }

}


// FOR QN NO.4
class Tommy{

    String name;


    public void hitting(){
        System.out.println(name +" Hitting..");

    }

    public void running(){
        System.out.println(name + " Running..");

    }

    public void fighting(){
        System.out.println(name + " Fighting...");
    }

     public void firing(){
        System.out.println(name + " Firing...");
    
    }

}
