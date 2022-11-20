package no_2_operators_and_expressions;


/**
 * no_10_resulting datatypes
 */
public class no_10_resulting_datatypes {

    public static void main(String[] args) {
        
        // int s = 45 + 5 ;
        byte x = 5;
        // int y = 6;
        // short z = 8;
        float a = 6.54f + x;
        System.out.println(a);

// |----->> increment and decrement operators <<-----|

        int i = 56;
        int b = i++; //(first b is assigned i then i is increment (56) )
        int j = 67;
        int c = ++j;  //(first j is incremented then c is assigned j (68))
        char ah = 'a';
        char bh = ah++;
        char ch = 'c';
        char dh = ++ch;

        // System.out.println(i++);
        // System.out.println(i);
    

        
         // System.out.println(++i);
        System.out.println(i);
        System.out.println(b);
        System.out.println(j);
        System.out.println(c);
        System.out.println(ah);
        System.out.println(bh);
        System.out.println(ch);
        System.out.println(dh);

// QUICK QUIZE ==> WHAT WILL BE THE VALUE OF THE FOLLOWING ExPRESSION(q)
                   
                    int p= 7;
                    int q = ++p + 8;
                // find the value of x ?
                    System.out.println("THE QUIZE ANSWER IS : " + q); //ans --> 16   

             



    }
}