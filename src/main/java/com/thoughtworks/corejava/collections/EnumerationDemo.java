package com.thoughtworks.corejava.collections;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by rajatbhatnagar on 6/18/15.
 */
public class EnumerationDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        for (int counter = 0; counter <= 10; counter++) {
            vector.addElement(counter);
        }
        System.out.println("Vector Elements :: " + vector);
        //Now print only even numbers out of the vector elements
        Enumeration enumeration = vector.elements();
        System.out.print("Even Elements :: ");
        while (enumeration.hasMoreElements()) {
            Integer integer = (Integer) enumeration.nextElement();
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println("\nVector Elements :: " + vector);
    }
}
