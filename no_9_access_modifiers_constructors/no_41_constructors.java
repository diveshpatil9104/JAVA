package no_9_access_modifiers_constructors;



public class no_41_constructors {
    public static void main(String[] args) {

        Employee harshal = new Employee("harshal vikas patil " , 57);       // --------invoked automatically at the time of object creation.
        
        
        
        System.out.println(harshal.getname());    
        System.out.println(harshal.getid());

/*      Employee harshal = new Employee();
        harshal.setname("Harshal Vikas Patil");
        System.out.println(harshal.getname());
        harshal.setid(74);  */
    }

}



/* Constructors ---->> A member function use to initialize an object while creating it...

Constructor is a special method which is invoked automatically at the time of object creation.

- Constructors have the same name as class or structure.
- Constructors don't have a return type. (Not even void)
= Constructors are only called once, at object creation.
- Memory allocation happens when constructor is called.

*/

        
    

    class Employee{
    private  int id;
    private  String name;

    public Employee(){              //--------> constructor 
        id = 45;
        name = "harshal vikas patil";
    }


    public Employee(String myname , int myid){
        name = myname;
        id= myid;
    
    }
                                    // ----->> constructor overloading 
    public Employee(int myid){
        id= myid;

    }

    public String getname(){            // getter for name 
        return this.name;
    }

    public void setname(String n){      // setter for name 
        this.name = n;

    }   
    public void setid(int i){           // setter for id 
        this.id = i;


    }
    public int getid(){                 // getter for id 
        return this.id;
    }


}