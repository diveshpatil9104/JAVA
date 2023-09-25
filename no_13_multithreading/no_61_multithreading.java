package no_13_multithreading;

public class no_61_multithreading {
    public static void main(String[] args) {
        Threading1 t1 = new Threading1();
        Threading2 t2 = new Threading2();

        t1.start();         // inbuild method for start the threading
        t2.start();         // inbuild method for start the threading

        
    }
    
}

//   ----- BY EXTENDING Thread CLASS.

class Threading1 extends Thread{                // here we using multithreading 
    @Override
   public void run(){               // run is a build in method in Thread 
        int i =0;    
        while(i<40000){
                        
    System.out.println(" I am cooking ");
    System.out.println("happy!!");
    i++;
        } 
    }
}
class Threading2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while (i<40000) {
            
        
        System.out.println(" I am Chatting with my friend");
        System.out.println("BOOM !!");
        i++;
        }
    }
}






/*
    MULTITREADING AND MULTIPROSSECING BOTH ARE USED TO ACHIVING MULTITASKING..

    ------CREATING THE THREAD -------
    THERE ARE TWO WAYS OF CREATING THREAD 
    - BY EXTENDING Thread CLASS.
    - BY IMPLEMENTING RUNTOME INTERFACE.




    WITHOOT THREADING ---->>
    Main()  ----> Func() ----> Func2() ====> END 

    WITH THREADING ----->>
    
    Main() ----------------|
    |--- Func() -----------|--->> END
         |---- Func2() ----|



 */

