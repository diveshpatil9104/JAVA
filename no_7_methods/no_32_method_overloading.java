package no_7_methods;

/**
 * no_32_method_overloading
 */
public class no_32_method_overloading {
    //void is use for when we dont want our method to return anything..we use void as a return type.
    
    static void change(int []arr){   
        arr[0]=66;
        
    }
    static void tellJoke(){
            System.out.println("\nWhat did the blanket say when it fell off the bed ?? \nit said ohh sheet!");
            } 
            
//   ----->> METHOD OVERLOADING <<-
    static void foo(){
        System.out.println("Good Morning Bhava");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + "  Bhava");
    }

    static void foo(int a , int b ){
        System.out.println("Good Morning " + a + " And " + b + "  Bhava");
    }
    public static void main(String[] args) {

        // int marks[]= {55,78,98,57,75};   // IN CASE OF ARRAYS , THE REFERENCE IS PASSED . SAME IS THE CASE FOR OBJECT PASSING TO METHODS ..
        // change(marks);
        // System.out.println("the value of array after running change is : "+ marks[0]);

        
        //tellJoke();

 
// ---------------------------->> METHOD OVERLOADING <<--------------------------------

    foo();   
    foo(69);
    foo(69, 96);
    //Arguments are actual!
    //perameters are not actual!

// ---->> NOTE : METHOD OVERLOADING CAN NOT BE PERFORM BY CHANGING THE RETURN TYPE OF METHOD 🥸 



   


    
    
    }
}

