package no_13_multithreading;



public class no_63_thread_costructor {
    public static void main(String[] args) {
        MyThread1 thread = new MyThread1("Divesh");
        MyThread1 thread1 = new MyThread1("Tejas");


        thread.start();
        System.out.println("thread id is: " + thread.getId());
        System.out.println("thread name is: " + thread.getName() );
        thread1.start();
        System.out.println("thread id is: " + thread1.getId());
        System.out.println("thread name is: " + thread1.getName() );

        MyThread2 thread2 = new MyThread2();
        Thread working_thread = new Thread(thread2 , "raj patil");
        MyThread2 thread3 = new MyThread2();
        Thread working_thread1 = new Thread(thread3 , "tejas patil");


        working_thread.start();
        System.out.println("thread id is: " + working_thread.getId());
        System.out.println("thread name is: " + working_thread.getName() );

        working_thread1.start();
        System.out.println("thread id is: " + working_thread1.getId());
        System.out.println("thread name is: " + working_thread1.getName() );

        
    }
    
}

/*
THE THREAD CLASS -----
BELOW ARE THE COMMONLY USED CONSTRUCTOR OF THREAD CLASS..

1. Thread() ✅      (in previous file no_61)      
2. Thread(String name) ✅
3. Thread(Runnable r) ✅ (in previous file no_62)
4. Thread(Runnable r, String name) ✅
*/

// -------- constructor type 2

class MyThread1 extends Thread{                 
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("I am a thread ");
    }
}   

//  ---------- CONSTRUCTOR TYPE 4

class MyThread2 implements Runnable{
    public String name;
    
    public MyThread2(){
        System.out.println(" \ni am thread without pearameters");
    }
    
    public MyThread2(String name){
    }
    @Override
    public void run(){
        System.out.println("\ni am in runnable thread");
    }
}

