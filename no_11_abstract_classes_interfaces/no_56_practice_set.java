package no_11_abstract_classes_interfaces;

public class no_56_practice_set {
    public static void main(String[] args) {
        
// QN NO.1 -----> CREATE AN ABSTRACT CLASS Pen WITH METHODS wite() and refill() AS ABSTRACT METHODS..
                        Mypen pen = new Mypen();
                        pen.refill();
                        pen.write();



// QN NO.2 -----> USE THE Pen CLASS FROM QN NO.1 TO CREATE A CONCRETE CLASS FountainPen WITH ADDITIONAL METHOD ChangeNib()
                        FountainPen fountain = new FountainPen();
                        fountain.refill();
                        fountain.write();
                        fountain.changenib();



// QN NO.3 -----> CREATE A CLASS Monkey WITH jump() AND  bite() METHODS..CREATE A CLASS Human WHICH INHERITS THIS Monkey CLASS AND IMPLEMENTS BasicAnimal INTERFACE WITH eat() AND sleep() METHODS
                        Human human = new Human();
                        human.jump();
                        human.eat();
                        human.sleep();
                        System.out.println();
                        
                        Monkey monkey = new Monkey();
                        monkey.bite();
                        monkey.jump();



// QN NO.4 -----> CREATE A CLASS Telephone WITH ring() , lift() AND disconnect() METHODS AS ABSTRACT METHODS..CREATE ANOTHE CLASS Smarttelephone AND DEMOSTRATE POLYMORPHISM

                        Telephone telephone = new Smarttelephone();

                        telephone.ring();
                        telephone.lift();
                        telephone.disconnect();

                        // telephone.videocall();  ------>> throwns error BCOZ THE REFERENCE IS Telephone, WHICH DOES NOT HAVE Videocall METHOD 
                    


// QN NO.5 -----> DEMOSTRATE POLYMORPHISM USING Monkey CLASS FROM QN NO.3 
                        Monkey monkeey = new Human();
                        
                        // monkeey.eat();  ----->> CAN NOT USE eat(); METHOD BCOZ THE REFERENCE IS Monkey, WHICH DOES NOT HAVE SPEAK METHOD 
                        System.out.println();       
                        monkeey.bite();             // PRINT FUNCTION OF Human CLASS BEACOUSE Monkey REFERENCE TO Human OBJECT 
                        monkeey.jump();

                        BasicAimal tejas = new Human();
                        // tejas.jump();   ------>> throwns error 
                        System.out.println();
                        tejas.eat();
                        tejas.sleep();



// QN NO.6 -----> CREATE AN INTERFACE TVRemote AND USE IT TO INHERITE ANOTHER INTERFACE SmartTVRemote

                System.out.println("\nTHERE IS NO OUTPUT FOR QN NO. 6\n");

                    
// QN NO.7 -----> CREATE A CLASS SmartTV WHICH IMPLEMENTS SmartTvRemote INTERFACE FROM QN NO.6

                    SmartTV smart = new SmartTV();
                    smart.welcome();
                    smart.on();
                    smart.VolumeDown();
                    smart.youtube();
                    smart.VolumeUp();
                    smart.netflix();
                    System.out.println();


    }

}
    


// FOR QN NO.1

abstract class Pen{
    // IF A CLASS INCLUDES ABSTRACT METHIDS THEN THE CLASS ITSAY MUST BE DECLARED ABSTRACT.

    abstract void write();              
    abstract void refill();
}

class Mypen extends Pen{
    @Override
    public void write(){
        System.out.println("writing...");
    }
    @Override
    public void refill(){
        System.out.println("\nfilling refil");
    }

}


// FOR QN NO.2

abstract class Pen1{
    // IF A CLASS INCLUDES ABSTRACT METHIDS THEN THE CLASS ITSAY MUST BE DECLARED ABSTRACT.

    abstract void write();              
    abstract void refill();
}

class FountainPen extends Pen{
    @Override
    public void write(){
        System.out.println("writing...");
    }
    @Override
    public void refill(){
        System.out.println("\nfilling refil");
    }
    public void changenib(){
        System.out.println("changing my fountain pen nib..\n");
    }
}


// FOR QN NO.3 AND QN NO.5

interface BasicAimal{
    void eat();
    void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("monkey jumping..");
    }

    public void bite(){
        System.out.println("monkey biteing..");
    }

}

class Human extends Monkey implements BasicAimal{
    @Override
    public void jump(){
        System.out.println("human jumping..");
    }
    @Override
    public void bite(){
        System.out.println("human biteing..");
    }
    @Override
    public void eat(){
        System.out.println("eating..");
    }
    @Override
    public void sleep(){
        System.out.println("sleeping..");
    }


}


// FOR QN NO.4 

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();

}
class Smarttelephone extends Telephone{
    @Override
    public void ring(){
        System.out.println("\nringing...");
    }
    @Override
    public void lift(){
    System.out.println("lifting...");
    }
    @Override
    public void disconnect(){
        System.out.println("disconnecting...\n");

    }
    public void videocall(){
        System.out.println("video calling...");
    }

}


// FOR QN NO.6

interface TVRemote {
    void on();
    void off();
    void VolumeUp();
    void VolumeDown();
}

interface SmartTVRemote extends TVRemote{
    void netflix();
    void youtube();
}


// FOR QN NO.7
// IMPLEMENTING SmartTVRemote INTERFACE 

class SmartTV implements SmartTVRemote{
    public void welcome(){
        System.out.println("\n\tSONY SMART TV");
    }

    @Override
    public void on(){
        System.out.println("\nTurning on tv");
    }
    @Override
    public void off(){
        System.out.println("Turning off tv");
    }
    @Override
    public void VolumeUp(){
        System.out.println("Volume Up..");
    }
    @Override
    public void VolumeDown(){
        System.out.println("Volume Down..");
    }
    @Override
    public void netflix(){
        System.out.println("Opening Netflix..");
    }
    @Override
    public void youtube(){
        System.out.println("Opening YouTube..");
    }

}


