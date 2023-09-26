package no_13_multithreading;

public class no_64_threads_priorities {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1(" Divesh");
        MyThread1 t2 = new MyThread1(" Tejas");
        MyThread1 t3 = new MyThread1(" Vaishali");
        MyThread1 t4 = new MyThread1(" Devendra");
        MyThread1 t5 = new MyThread1(" Kusum");
        MyThread1 t6 = new MyThread1(" Raj");
        
        t6.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
       
        t1.start();     
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
       
    }
    
}


class MyThread1 extends Thread{                 
    public MyThread1(String name){
        super(name);
    }
    @Override
    public void run(){
        int i =0;
        while (i <40000) {
            
        
        System.out.println("I am a thread " + this.getName());
        i++;
        }
    }
}   