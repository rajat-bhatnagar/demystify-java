package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 7/12/15.
 */
public class BoundedWildcardsDemo {
    /*
     * This program demonstrates Bounded and Unbounded wildcards in Generics
     */
    public static void main(String[] args) {
        //Create an Integer List
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        System.out.println("Perform addition of Integer list by bounded generic add method");
        System.out.println("\t" + add(integerList));

        //Create a double List
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4);
        System.out.println("Perform addition of Double list by bounded generic add method");
        System.out.println("\t" + add(doubleList));

        System.out.println("Invoke  unbounded  void unboundedWildCardsDemo(List<? super Integer> list) method");
        unboundedWildCardsDemo(new ArrayList<Integer>());
        // We cannot do the below as Double is not a superclass nor a Type of Integer
        //unboundedWildCardsDemo(new ArrayList<Double>());
    }

    /*
     * This method uses Bounded wildcards to perform an addition
     * for both i.e Integer List and Double List
     */
    public static double add(List<? extends Number> list) {
        double sum = 0.0;
        for (int counter = 0; counter < list.size(); counter++) {
            sum += list.get(counter).doubleValue();
        }
        return sum;
    }

    /*
     * This method uses unbounded wildcards
     */
    public static void unboundedWildCardsDemo(List<? super Integer> list) {
        System.out.println("\t" + list);
    }
}
