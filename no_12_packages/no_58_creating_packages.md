# PACKAGES IN JAVA 

- Java packages are a mechanism used for organizing and categorizing related classes and interfaces into a single, coherent unit. They provide a way to manage the complexity of large Java applications by encapsulating classes into namespaces, preventing naming conflicts, and enhancing code reusability. Packages in Java serve several essential purposes:

- **Namespace Management :** Packages allow you to create namespaces, which help avoid naming conflicts between classes in different packages. Each class within a package can have a simple name, and Java distinguishes between classes with the same name in different packages.

- **Access Control :** Java provides different levels of access control, such as public, protected, default (package-private), and private. Using packages, you can control the access of classes and members within your codebase.

- **Code Organization :** Packages help organize your code logically. You can group related classes and interfaces together in a package, making it easier to find and maintain your code.

- **Reusability :** Packages promote code reusability since classes within the same package can access each other's package-private members, making it possible to implement modular and maintainable code.


# CREATING PACKAGES IN JAVA 

- To create a package in Java, you need to follow a specific directory structure and include a `package` declaration in your Java source code. Here's a step-by-step guide on creating packages in Java:


1. **Directory Structure:**

- Java packages correspond to directory structures in your file system. The directory structure should match the package structure defined in your Java code. for eg.  with the root folder named `java programs`, and your `.java files` residing in the `no_10_inheritance` directory, it would look like this:

-        java programs/
            |-- no_10_inheritance/
            |   |-- no_50_practice_set.java

- In this structure:

- "java programs" is your root directory.
- "no_10_inheritance" is a subdirectory within the root directory.
- "no_50_practice_set.java" represents the Java source code file for the 50th practice set within the "no_10_inheritance" subdirectory.

-        package no_10_inheritance;
            public class no_50_practice_set {
                 public static void main(String[] args) {
                    System.out.println(" Hey i am class of no_10_inheritance package ");
            }     
                }        

- When specifies the destination directory where the compiled .class files should be placed we use following cmd for above code in terminal :

-       java -d . no_50_practice_set

- The `-d` option specifies the destination directory where the compiled `.class` files should be placed. In this case, we use `.` to indicate the current directory.

-       We can also create inner package in above package by adding `no_10_inheritance.practiceset_1`
                                                                             ↓           ↓
                                                                           (folder)   (inner folder)


2. **Java Source File :**

- Inside the package `no_10_inheritance` directory, create your Java source file (e.g., `no_50_practice_set.java`) containing your class or interface. Make sure to include a package declaration at the beginning of your Java file to specify the package it belongs to:

-       package no_10_inheritance;;

            public class no_50_practice_set {
             // Class members and methods
        }


3. **Compilation :**

- To compile your Java code, navigate to the `java programs` directory (your root directory) in your terminal and use the javac command. For example:

-        javac no_10_inheritance/no_50_practice_set.java
        

4. **Running the Java Program :**

- You can run your Java program using the java command with the fully qualified class name, including the package name:

-       java no_10_inheritance.no_50_practice_set

- By following these steps and best practices, you can effectively use packages to structure and organize your Java code within the `java programs` directory, specifically in the `no_10_inheritance` subdirectory.


**USING A JAVA PACKAGE**

-       import java.lang.*       ----->> import everything from java.lang
        import java.util.        ----->> import everything from java.util
        import java.util.Scanner ----->> import Scanner from java.util
        
        s=new java.lang.String("Divesh") ---->> without importing 



