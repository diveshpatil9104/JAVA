package no_9_access_modifiers_constructors;



public class no_40_getter_setter {

    public static void main(String[] args) {
        Employee sagar = new Employee();
/*      
        sagar.id = 23;                          // ---->> throwns an error due to private access modifire 
        System.out.println(sagar.id);
        sagar.name = "sagar amrut patil";

*/  

        sagar.setname("sagar amrut patil");
        System.out.println(sagar.getname());

        sagar.setid(69);
        System.out.println(sagar.getid());
    }

    
}

// Getters ---->> RETURN THE VALUE
// Setters ----->> SET / UPDATE THE VALUE 
// this.   ----->> THIS FUNCTION IS USED TO REFFER TO THE CURRENT OBJECT  

class Employee{
    private int id;
    private String name;


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