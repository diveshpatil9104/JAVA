package no_2_operators_and_expressions;

/**
 * no_9_op_precedence
 */
 public class no_9_op_precedence {

    public static void main(String[] args) {
       // precedence & associativity
        // int a = 6*5-34/2;
     
       // = 30-34/2
       // = 30-27
       // =  17
        // Highest precedence goes to * and / .They are than evaluate on the basis 
        // left to right associativity ..
      
        // int b = 60/5-34*2;

       // = 12-34*2
       // = 12-68
       // = -56

        // System.out.println(a);
        // System.out.println(b);

// QUICK QUIZE = HOW TO WRITE THE FOLLOWING ExPRESSIONS IN JAVA?

// 1) x - y / 2
// 2) b * b - 4 * a * c / 2 * a
// 3) v * v - u * u 
// 4) r * s - t

// 1 --> 
        int x = 5;
        int y = 10;
        int ans = x-y/2;
        System.out.println(ans); //0

// 2 --> 
        int b = 4;
        int a = 4;
        int c = 2;
        int d = b * b - (4 * a * c) / (2 * a);
        // 4 * 4 - 4 * 4 * 2 / 2 * 4
        System.out.println(d); //12

// 3 -->
        int v = 2;
        int u = 2;
        int answer = (v * v) - (u * u) ;
        // 2*2-2*2
         System.out.println(answer); //0

// 4 -->
        int r = 2;
        int s = 2;
        int t = 4;
        int z = (r * s) - t ;
        // 2 * 2 - 2
        System.out.println(z); //0
    
    }
}

 