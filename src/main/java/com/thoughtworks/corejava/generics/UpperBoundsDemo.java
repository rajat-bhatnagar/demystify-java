package com.thoughtworks.corejava.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 * Demonstrate the upper bounds i.e <? extends E> using addAll(Collection<? extends E> method of Collection class
 */
public class UpperBoundsDemo {
    public static void main(String[] args) {
        //Declare a List of super type i.e Number
        List<Number> numbers = new ArrayList<Number>();
        //Create a list of sub type i.e Integers
        List<Integer> ints = Arrays.asList(1,23,24,65,45);
        //Create a list of doubles
        List<Double> doubles = Arrays.asList(2.89,7.32,9.23);
        //Add the above two Collections subtype to Super type i.e Number using addAll method
        numbers.addAll(ints);
        numbers.addAll(doubles);
        System.out.println("Numbers :: "+numbers);
        assert numbers.toString().equals("[1, 23, 24, 65, 45, 2.89, 7.32, 9.23]");
    }
}
