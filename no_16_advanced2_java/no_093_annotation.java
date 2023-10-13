package no_16_advanced2_java;



public class no_093_annotation {
    public static void main(String[] args) {
        @SuppressWarnings("Deprecation")    // SurfaceWarning annotation for stops the warning (compiler ki aawaj dabane keliye..)
        CellPhone ph = new CellPhone();
        ph.call();
        ph.call2();
        
        
    }
}
@FunctionalInterface     // @FunctionalInterface annotation 
interface Myinterface{
    void run();
    // void walk();         // ---- >> not allowe 2nd abstract method due to @FunctionalInterface  
    default void walk(){
        System.out.println("name");
    }

}

class Phone{
    public void call(){
        System.out.println("calling at 10AM ");
    }
}

class CellPhone extends Phone {
    @Override                               // override  annotation
    public void call(){
        System.out.println("calling at 12PM");
    }
    @Deprecated                               // deprecated annotation used for deprecate method now call2() is discourage use for programmers
    public void call2(){
        System.out.println("2nd calling at 1AM");
    }
}




/*
    ------- ANNOTATION IN JAVA 
        USED TO PROVIDE EXTRA IMFORMATION ABOUT A PROGRAM ANNOTATIONS PROVIDE METADATA TO CLASS/METHOD 
        FOLLOWING ARE SOME COMMONLY ANNOTATIONS BUILT INTO JAVA  

- @Override  -----> USED TO MARK OVERIDES ELEMENTS IN CHILD CLASSES 
- @SupressWarnings  ----> USED TO SUPRESS THE GENERATED WARNINGS BY THE COMPILE
- @FunctionalInterface ----> USED TO ENSURE AN INTERFACE IS A FUNCTIONAL INTERFACE 
- @deprecated -----> USED TOO MARK DEPRECATED METHODS 



 */