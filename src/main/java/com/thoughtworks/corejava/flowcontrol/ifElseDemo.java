package com.thoughtworks.corejava.flowcontrol;

/**
 * Created by rajatbhatnagar on 8/11/15.
 * This class demonstrates that input to if statement must be a boolean type
 */
public class ifElseDemo {
    public static void main(String[] args) {
        //Demonstration 1 ::
        boolean x = true;
        //The idf condition expects a type boolean
        //If x is declared anything other than boolean
        // we would get a incompatible types exception : for example
        //for e.g declare int x = 0 and pass x as an argument to if condition i.e if(x)
        if (x) {
            System.out.println("Namastey");
        } else {
            System.out.println("Pranam");
        }
        // Another good example - Demonstration 2 ::
        boolean b = true;
        if (b = false) {
            System.out.println("Ciao");
        } else {
            System.out.println("Adios");
        }
        // Another good example - Demonstration 3 :: else part is optional
        //and curly braces is optional
        if (true) ; // This is an empty condition

        // Another  example - Demonstration 4
        // curly braces are optional , if the statement below if
        // is not a declarative statement
        if (true)
            System.out.println("Print something without curly braces");

        // Another  example - Demonstration 5
        //Semicolon is a valid java statement and is known as empty statement
        // The code below is perfectly valid
        if (false)
            ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        ;
        // Another  example - Demonstration 5
        // There is no DANGLING else problem in java
        // Every else is mapped to the nearest if statement
        if (true)
            if (false)
                System.out.println("Something");
            else
                System.out.println("Nothing");

    }
}
