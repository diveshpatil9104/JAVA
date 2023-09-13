package no_10_inheritance;

 
public class no_48_dynamic_method_dispatch {

    public static void main(String[] args) {

        // Phone phone = new Phone();   // allowed
        // phone.on();

        // Smartphone smartphone = new Smartphone();    // allowed 
        // smartphone.GetTime();
        // smartphone.on();
        

//        Smartphone ph = new Phone();   // ----->>  throwns error bcoz here subclass creates object of superclass and it is not allowed 

          Phone ph = new Smartphone(); // ----->> allowed 
          ph.GetTime();
          ph.on();          // this line print function of object ( i.e  Smartphone(); ---->> Hey...i am Smartphone )..
          
//        ph.music();       // this line throwns error bcoz we only run function which is present in superclass (i.e Phone)

    }
}

class Phone{
    void GetTime(){
        System.out.println(" Current time is 4.40 PM ");
    }

    void on() {
        System.out.println(" Hey.. i am phone");

    }

}

class Smartphone extends Phone{

    void music(){
        System.out.println(" Playing music ");
    }

    @Override
    void on(){
        System.out.println(" Hey...i am Smartphone");
    }

}



/* 
        --------------- DYNAMIC METHOD DISPATCH ------------------
          
           |-------|   ----> meth 1
           | Super |   ----> meth 2 
           |---|---|      
               | 
               |
           |---|---|   ----> meth 2 
           |  Sub  |   ----> meth 3
           |-------|


  SCENARIO 1 : ---->>     Super obj = new Sub();  ----> ALLOWED ✅    
                          obj.meth2();            ----> This line is called function of object (sub)
                          obj.meth3();            ----> NOT ALLOWED ❌



  SCENARIO 2 : ---->>     Sub obj = new Super();  ----> NOT ALLOWED ❌ 
                          
 */                         