package no_11_abstract_classes_interfaces;



public class no_54_inharitance_interfaces {
    public static void main(String[] args) {
        SampleClass sample = new SampleClass();
        sample.meth1();
        sample.meth2();
        sample.meth3();
        sample.meth4();

          
    
        
    }
    
}

interface SampleInterface{
   void  meth1();
   void  meth2();
}

interface ChildSampleInterface extends SampleInterface{   // EXTEND IS VALID FOR INTERFACES BUT IT IS NOT VALID WHEN WE EXTENDS CLASS WITH INTERFACE 
    void meth3();                                         // WE SHOULD USE IMPLEMENT FOR CLASS IMPLEMENTATION WITH INTERFACES 
    void meth4();

}
 
class SampleClass implements ChildSampleInterface{
    public void meth3(){
        System.out.println("met h 3");

    }
    public void meth4(){
        System.out.println("meth 4");
    }

    // HERE INTERFACE ChildSampleInterface extends SampleInterface SO WE ALSO NEED TO IMPLEMENTS METHODS OF SampleInterface FOR AVOIDING ERROR

    public void meth1(){
        System.out.println("meth 1");
    }
    
    public void meth2(){
        System.out.println("meth 2");
    }

}   