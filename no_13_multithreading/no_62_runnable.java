package no_13_multithreading;

public class no_62_runnable {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        Thread working_thread = new Thread(thread);
        
        MyThread2 thread2 = new MyThread2();
        Thread working_thread2 = new Thread(thread2);


//       thread.start();    this line of code occurs error ...
//       thread2.start();    for running threading BY IMPLEMENTING RUNTOME INTERFACE we want create object of Thread class also 
//                           And pass the object of Mythrea1 & MyThread2 and call the start(); from object of Thread ..
        working_thread.start();
        working_thread2.start();

    }
    
}
// ------ BY IMPLEMENTING RUNTOME INTERFACE.

class MyThread1 implements Runnable{

    public void run(){
        int i =0;
        while (i<400000) {
            
        
        System.out.println(" I am cooking ");
        System.out.println("Happy!!");
        i++;
        }
    }

}
class MyThread2 implements Runnable{
    public void run(){
        int i=0;
        while (i<400000) {
            
        
        System.out.println(" I am chatting with my friend");
        System.out.println("BOOM!!");
        i++;
        }
    }

}

/* 
    LIFE CYCLE OF THE THREAD :

    1. NEW              
    2. RUNNABLE <---------- 4.  NON
    3. RUNNING  ---------->   RUNNABLE
    5. TERMINATE

1. NEW : INSTACE OF THREAD IS CREATED WHICHNIS NOT YET STARTED BY INVOKUNG start() 

2. RUNNABLE : AFTER IVOCATION OF start() & BEFORE IT IS SELECTED TO BE RUN BY SCHEDULER

3. RUNNING : AFTER THREAD SCHEDULER HAS SELECTED IT

4. NON-RUNNABLE : THREAD ALIVE NOT ELIGIBLE FOR RUN

5. TERMINATE : run() METHOD HAS EXITED 

*/


