package no_5_loop_control_instruction;

/**
 * no_22_do_whileloop
 */
public class no_22_do_whileloop {

    public static void main(String[] args) {
        
//   ----------------->> do-while loop <<--------------------
//this loop is similar to a while loop expect the fact that it is guaranted to execute at least once ..

    int a = 0 ;
    do {                        //----> do-while loop execute the code and then checks the condiction
        System.out.println(a);
        a++;
    } while (a<5);

// -----> QUICK QUIZ = WRITE A PROGRAM TO PRINT FIRST 100 NATURAL NUMBERS USING do-whilr loop..      
    int b = 1;
    do {
        System.out.println(b);
        b++;
    } while (b<=100);



    }
}