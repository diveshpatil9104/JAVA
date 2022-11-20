package no_4_conditionals;



/**
 * no_17_logical_op
 */
public class no_17_logical_op {

    public static void main(String[] args) {
    boolean a = true ;
    boolean b = false;
    if (a && b) {     // THIS IS A AN OPERATOR (EVALUATE TRUE , IF BOTH CONDICTION ARE TRUE ..."FALSE IN THIS CASE")
        System.out.println("TRUE");
    
    }
    else{
        System.out.println("FALSE");
    }

    boolean c = true;
    boolean d = false;
    boolean e = false;
    if (c || d || e) {  // THIS IS AN OR OPERATOR (EVALUATE TRUE , IF ANY ONE CONDITION IS TRUE ....TRUE IN THIS CASE"")
        System.out.println("TRUE");
    }
    else {
        System.out.println("FALSE");
    }

    boolean f = true;
    boolean g = false;
    System.out.println("NOT f is : " + (!f));
    System.out.println("NOT g is : " + (!g));

    }
}