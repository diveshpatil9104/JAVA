package no_15_advanced_java_1;
import java.util.*;


public class no_78_linkedlist {
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

// ------- same methods as ArrayList ..

        l2.add(12);
        l2.add(14);
        l2.add(16);
        l2.add(22);
        l2.add(69);
        
        l1.add(5);   // Inserts the specified element at the specified position in this list
        l1.add(6); 
        l1.add(1 , 7); 
        l1.add(1 , 9); // first 7 is in index 1 but after this line now 9 is in 1 and 7 in 2 .. 
        l1.add(2); 
        l1.add(4); 
        l1.addAll(l2);              // insert all the elements in the specified collection into this list.. (append)
        l1.addAll(0 ,l2);       // starting at specified position 
//      l1.clear();                    // remove all the element from this list 
        System.out.println(l1.contains(37));  // returns true if this list contains the specified element 

        System.out.println(l1.indexOf(69));  // returns index of first occurance of specified element , return -1 if this list not contain element 
        
        System.out.println(l1.lastIndexOf(69));   // returns index of last occurance of specified element , return -1 if this list not contain element 
        l1.set(0, 30);  // replqce the element at rhe specified index in this list with the specified element (30 in this case)
        l1.remove(5);   // remove elemet which is present at specified index 
        System.out.println(l1.isEmpty());  // returns true if this list is empty
        System.out.println(l1.iterator());   // returns an interator over the element in this list in proprer sequence 

//      SOME DIFFRENT METHODS WHICH ARE NOT IN ArreyList BOCOZ LinkedList IMPLEMENTS DEQUE SO LinkedList ALSO HAVE METHODS OF DEQUE
        l1.addLast(798);
        l1.addFirst(67);


        for (int i = 0; i < l1.size(); i++) {           //  use size in ArrayList not length 
            System.out.print(l1.get(i));              // use .get() in ArrrayList not like array ( l1[i] )
            System.out.print(" ");
        }




        
    }
}


/* 
    DIFFRENCE BETWEEN ARRAYLIST AND LINKLIST - 

    ArrayList vs. LinkedList:

1. **Data Structure**:
   - ArrayList: Uses a dynamic array.
   - LinkedList: Uses a doubly-linked list.

2. **Insertions/Deletions**:
   - ArrayList: Slower for middle insertions/deletions.
   - LinkedList: Faster for middle insertions/deletions.

3. **Random Access**:
   - ArrayList: Fast O(1) random access.
   - LinkedList: Slow O(n) random access.

4. **Memory Usage**:
   - ArrayList: Less memory-efficient.
   - LinkedList: More memory-intensive.

5. **Performance**:
   - ArrayList: Better for reading data.
   - LinkedList: Better for modifying data.

6.  **Iteration**    :
   - ArrayList: Faster for iteration.
   - LinkedList: Slower for iteration due to cache.

- Choose based on your use case:
- ArrayList for fast access and stable size.
- LinkedList for frequent insertions/deletions.

*/







