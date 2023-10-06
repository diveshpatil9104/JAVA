package no_15_advanced_java_1;

import java.util.*;

public class no_79_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();   // ArrayDeque is Array who implements Deque interface the initial array size of constructor is 16 elements we can also give specified initial capacity.. 

        a1.add(4);
        a1.add(6);
        a1.add(43);
        a1.offerFirst(1);
        a1.addFirst(10);
        a1.addLast(69);
        a1.remove(4); // remove element from element 4
        


        // System.out.println(a1.getFirst());
        // System.out.println(a1.getLast());
        // System.out.println(a1.getClass());
       System.out.println(a1.offerFirst(1));       // special value method for insetion
       System.out.println(a1.offerLast(6969));



        for (Integer integer : a1) {
            System.out.println(integer);
            
        }
        
    }
}


/*
    ArrayDeque IN JAVA DOES NOT SUPPORT DIRECT INDEXING USING get() AS IT'S NOT DESIGNED TO NE ACCISSED BY INDEX...
    TO ITERATE THROUGH IN ArrayDeque IN JAVA, YOU SHOULD USE ITERATOR OR A FOR EACH LOOP 




 */
