package no_13_multithreading;

public class no_65_thread_methods {
    public static void main(String[] args) {

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        
        
        // try {
        //     t1.join();              // wait for t1 to finish if needed
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        t2.start();
            
    }
    
}

class MyThread1 extends Thread{                 
    @Override
    public void run(){
        int i=0;

        while (i<40) {
            System.out.println("I am a thread ");
            try {
                Thread.sleep(1);                //Sleep for 1 milisecond
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            
        }
    }  
}     
    
// In this code, MyThread2 uses the sleep method to pause its execution for 3 milisecond between each iteration, 
    //while MyThread1 runs with 1 milisec sleep, allowing both threads to run concurrently. 
  
class MyThread2 extends Thread{                 
    @Override
    public void run(){
        int i=0;
        
        while (i<40) {
            System.out.println("HAPPY!! ");
                try {
                    Thread.sleep(3);                //Sleep for 3 milisecond
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            i++;
             
         }
    }
}   

/*
- In the code you provided, the join method is used to make the main thread wait for t1 to finish its execution before proceeding with t2.
  Here's how it works:

1. t1.start() is called to start the execution of MyThread1. This thread runs for a limited number of iterations (40 times) and then terminates.

2. After starting t1, the join method is called with t1, like this: t1.join();. This line of code makes the main thread (the one executing the main method) 
    pause and wait for t1 to complete before continuing its execution. In other words, the main thread is blocked until t1 finishes running.

3. Once t1 has completed its 5 iterations and terminates, the main thread is unblocked and continues executing the rest of the code, 
    which includes starting t2 with t2.start().

So, the join method ensures that t1 completes its work before the main thread proceeds with starting t2. This can be useful 
in scenarios where you want to ensure that certain threads have completed their tasks before moving on to other parts of your program.









*/