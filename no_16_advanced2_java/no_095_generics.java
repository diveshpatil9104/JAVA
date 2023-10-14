package no_16_advanced2_java;

import java.util.ArrayList;



public class no_095_generics {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();      // hre Interger is a generic class name 
         al.add(3);
         System.out.println(al.get(0));
       
//       al.add("my name is Divesh");        // this throws error bcoz we use only Integer genrtic class
//      System.out.println(al.get(1));
      
      //   int a = (int)al.get(0);          // type cast is we should pass generic class name in Arraylist obj (i.e Integer)
        int a = al.get(0); 
        System.out.println(a);
        System.out.println();

// --------------------- GENERICS DEMO ---------------

        MyGeneric<Integer , String> al2 = new MyGeneric<>(3 , 4 , "divesh");       // in this case T1 is integer and T2 is String
        // al2.setT1(4);
        // al2.setT2("divesh patil");
        // al2.setValue(434);
    
        int num = al2.getT1();
        String name = al2.getT2();
        int val = al2.getValue();
        System.out.println(num);
        System.out.println(name);
        System.out.println(val);



    }
}
 
// Creating Generics class 

class MyGeneric<T1 , T2>{           // T1 AND T2 are  Type parameters..they represent generic types that can be specified when u 
                                    //  create an instance of a MyGeneric class..
    int value;
    int T1;
    String T2;
    public MyGeneric(int value, int t1, String t2) {
        this.value = value;
        T1 = t1;
        T2 = t2;

    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getT1() {
        return T1;
    }
    public void setT1(int t1) {
        T1 = t1;
    }
    public String getT2() {
        return T2;
    }
    public void setT2(String t2) {
        T2 = t2;
    }
    

}