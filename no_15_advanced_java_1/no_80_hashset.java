package no_15_advanced_java_1;

import java.util.HashSet;

public class no_80_hashset {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(32);
        set.add(34);
        set.add(33);
        set.add(31);
        set.add(32);    // not print duplicate
        set.remove(31);
        set.add(31);
        System.out.println(set.isEmpty());   
        System.out.println(set.size());

        System.out.println(set);
 
    }
}
    





/*
 
------>>   **Hashing:**

- **Definition:** 
    Hashing is a technique used to map data of arbitrary size to fixed-size values, typically integers, for efficient data retrieval.

- **Purpose:** 
    It's commonly used in data structures like hash tables to store and retrieve data quickly.

- **Hash Function:** 
    A hash function takes an input (or key) and produces a fixed-size hash code. It should be deterministic, meaning the same input will always produce the same hash code.

- **Collision:** 
    When two different inputs produce the same hash code, it's called a collision. Hash functions aim to minimize collisions.

- **Use Cases:** 
    Hashing is used in password storage, data retrieval, caching, and various algorithms and data structures for optimization.


----->>    **HashSet in Java:**

- **Definition:** 
    HashSet is a collection in Java that implements the Set interface. It uses hashing to store elements.

- **No Duplicates:** 
    HashSet does not allow duplicate elements. It stores only unique values.

- **Order:** 
    Elements in a HashSet are not guaranteed to be in any specific order.

- **Null Values:** 
    HashSet allows a single null value.

- **Performance:** 
    HashSet offers constant-time (O(1)) average complexity for basic operations like add, remove, contains, and size.

- **Use Cases:** 
    HashSet is commonly used when you need a collection of unique values and order doesn't matter. It's suitable for checking membership and eliminating duplicates efficiently.


 */