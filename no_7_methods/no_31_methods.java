package no_7_methods;

/**
 * no_31_methods
 */
public class no_31_methods {
    
     static int logic(int x ,int y){   //syntax for function or methods
        //x OR y IS A COPY OF a AND b OR a1 , b1 
        int z;

        if (x>y) {
            z=x+y;
       } 
        else{
         z = (x+y)*5;
         }
        //  x = 1000;   ...this line of code not creats change in valu of a and b bcoz they are copy ..😇 
         return z;    //lout chalo z ke value ke sath jaha se tum aaye the ... 😌  

    }

    public static void main(String[] args) {
        int a = 5;
        int b =7; 
       
        // no_31_methods obj = new no_31_methods();
        // int c = obj.logic(a, b);   ........  METHOD OF INVOCATION USING OBJECT CREATION ..(WITHOUT STATIC IN FUNCTION)      
        
        int c = logic(a, b);     //syntax for function or methods
        System.out.println(c);
   
       

        int a1 = 2;
        int b1 =1;  
        
        // int c1 = obj.logic(a1, b1);
        int c1 = logic(a1, b1);

         System.out.println(c1);
    }
}