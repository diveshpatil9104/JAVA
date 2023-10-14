package no_16_advanced2_java;

public class no_094_lambda {
    
    public static void main(String[] args) {
        // anom an = new Anom_meth();
        // an.meth1();

//      Annonymous Class :
//      here we created class without creating a class with diffrent name and implemetation 
        anom an = new anom() {
            @Override
            public void meth1(){
                System.out.println("this is method 1 ");
            }                                               
        };
        an.meth1();

// Lambda function 

        anom an1 = ()->{System.out.println("i am method 1 from this lambda function ");};
        an1.meth1();
        // we also pass perameters 

    }

}
@FunctionalInterface
interface anom { 
    void meth1();
}

// class Anom_meth implements anom{
//     @Override
//     public void meth1(){
//         System.out.println("this is method 1 ß");
//     }
// }


/*
   ---- LAMBDA EXPRESSION 
    ADDED IN JAVA 8 .. 
    LAMBDA EXPRESSION LET US EXPREES INSTANCE OF SINGLE METHOD CLASSES MORE COMPACTLY 

    ---- ANONYMOUS CLASS : 
    ANONYMOUS CLASS IS USED TO IMOLEMENT A BASE CLASS WITHOUT GIVING IT A NAME..
    FOR CLASS WITH A SINGLE METHOD, EVEN ANONYMOUS CLASSES GET SLIGHTLY EXCESSIVE..


 */