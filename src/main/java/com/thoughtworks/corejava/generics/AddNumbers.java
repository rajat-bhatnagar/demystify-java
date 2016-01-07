package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/6/16.
 */
public class AddNumbers {
    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(1.11, 2.22);
        double sum = addNumbers(doubles);
        assert sum == 3.33;
        List<Integer> ints = Arrays.asList(1, 2, 3);
        assert addNumbers(ints) == 6;
        List<Number> nums = Arrays.<Number>asList(1, 2, 1, 1, 2, 2.2);
        assert addNumbers(nums) == 9.2;
        List<Number> numberList = new ArrayList<Number>();
        copy(numberList, 5);
        numberList.add(9.89);
        System.out.println(numberList);
        assert numberList.toString().equals("[0, 1, 2, 3, 4, 9.89]");
    }

    // Use extends when you need to get some values out of a type
    public static double addNumbers(Collection<? extends Number> nums) {
        double sum = 0;
        for (Number num : nums) {
            sum += num.doubleValue();
        }
        return sum;
    }

    // Use super when you have to put some values of a type
//The following method takes a collection of numbers and integer n and puts in the numbers starting from 0 till n in the collection
    public static void copy(Collection<? super Number> ints, int n) {
        for (int i = 0; i < n; i++) {
            ints.add(i);
        }
    }
}
