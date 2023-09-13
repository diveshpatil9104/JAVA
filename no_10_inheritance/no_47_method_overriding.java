package no_10_inheritance;

public class no_47_method_overriding {
    public static void main(String[] args) {

        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        a.meth2();
        
    }
    
}


class A{

    public int divesh(){
        return 4;
    }
        
    public void meth2() {
        System.out.println(" I am method 2 of class A");
   
    }
}

class B extends A{
    @Override               // ------>> this annotation is not compulsary but it is recommanded.. This annotation helps 
                            //          catch errors and ensure that you are correctly implementing method overriding 

    public void meth2(){
        System.out.println(" I am method 2 of class B");
    }

}



//  ● METHOD OVERRIDING - PARENT AND CHILD CLASS BOTH CONTAIN SAME FUNCTION BUT DIFFRENT DEFINATION (WORKING)
