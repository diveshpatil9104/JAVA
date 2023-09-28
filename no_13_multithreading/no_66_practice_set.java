package no_13_multithreading;

public class no_66_practice_set {
    public static void main(String[] args) {

// QN NO.1 ---->    WRITE A PROGRAM TO PRINT "GOOD MORNING"  AND "WELCOME" CONTINIOUSLY ON A SCREEN IN JAVA USING THREADs..

                    Th thread = new Th();
                    Th1 thread1 = new Th1();
                    thread.start();
                    thread1.start();


// QN NO.2 ---->    ADD A sleep() METHOD IN WLCOME THREAD OF QN NO.1 FOR DELAY IT'S EXECUTION FOR 200mis

                    Th2 thread2 = new Th2();
                    Th3 thread3 = new Th3();
                    
                    thread3.start();
                    thread2.start();

// QN NO.3 ---->    DEMONSTRATE getPriority() & setPriority() FUNCTION IN THREAD 

                    thread2.setPriority(8);
                    System.out.println(thread2.getPriority());
                    

// QN NO.4 ---->    HOW DO YOU GET STATE OF A GIVEN THREAD IN A JAVA  ?

                    System.out.println(thread3.getState());



// QN NO.5 ---->    HOW DO YOU GET REFERENCE OF CURRENT THREAD IN JAVA ?


                    System.out.println(Thread.currentThread().getState()); 
                       
    }  
}

// FOR QN NO.1 ---->>

class Th extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<40) {
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
        

class Th1 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<40) {
            System.out.println("WELCOME");
            i++;
        }
    }
}
        

// USE FOR QN NO. 2 , 3 , 4 , 5 ---->>

class Th2 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<40) {
            System.out.println("GOOD MORNING");
            i++;
        }
    }
}
        

class Th3 extends Thread{
    @Override
    public void run(){
        int i =0;
        while (i<40) {
            System.out.println("WELCOME");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                // e.printStackTrace();
            }
            i++;
        }
    }
}










