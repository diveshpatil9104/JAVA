
import java.util.Scanner;


public class no_37_oops {






    public static void main(String[] args) {
 
            Scanner sc = new Scanner(System.in);
            System.out.print( " enter employee name : ");
            String name = sc.nextLine();
         
  /*       Pen p1 = new Pen();  // created a pen object called p1 
        p1.setcolour("red");
        System.out.println(p1.colour);
        p1.settip(5);
        System.out.println(p1.tip);
*/    
        Employee tejas = new Employee();            // created a employee object or instantiating a new employee object 
        Employee sagar = new Employee();            // called tejas , sagar , harshal , chetan , bhushan
        Employee chetan = new Employee();
        Employee harshal = new Employee();
        Employee bhushan = new Employee();

        // setting attributes

       
       
    // Printing the attribute 
        tejas.name = " tejas vijay patil";
        tejas.id = 1;
        tejas.salary = 100000;

        sagar.name = " sagar amrut patil";
        sagar.id = 2;
        sagar.salary = 100000;


        chetan.name = " chetan shashikant patil";
        chetan.id = 3;
        chetan.salary = 100000;


        harshal.name = " harshal vikas patil";
        harshal.id = 4;
        harshal.salary = 100000;


        bhushan.name = " bhushan nana patil";
        bhushan.id = 5;
        bhushan.salary = 100000;


         
        
        
        if (name.equals("tejas")) {
            tejas.employrrinfo();
        
        }
        else if (name.equals("sagar")) {
            sagar.employrrinfo();
 
        }
            
        else if (name.equals("chetan"))  {
            chetan.employrrinfo();

        }
        else if (name.equals("harshal")) {
            harshal.employrrinfo();
            
        }
        else if (name.equals("bhushan")) {
            bhushan.employrrinfo();

            
        }else{
            System.out.println(" enter verified name");
        }          
        
       


       

    }
}
// note: new object should be create under public class for ignore errors 
// CREATING A OBJECT Pen
// blueprint of class  Pen 

class Pen {   // this is class Pen  ( OBJECT )...for creating class the class name first letter should be capital (it is not cumpulsary but all experienced java devlopers follow this )

    String colour;
    int tip;

    void setcolour( String newcolour){
        colour = newcolour;
    }

    void settip( int newtip){
        tip= newtip;
    }

    
}
 


// CREATIG A OBJECT FOR EMPLOYEE

class Employee{

    String name;
    int id;
    int salary;


   public void employrrinfo(){
    System.out.println(" employee name is : " + name );
    System.out.println(" employee id is : " + id );
    System.out.println(" employee salary is : " + salary);

    }  

    

    

}
 

