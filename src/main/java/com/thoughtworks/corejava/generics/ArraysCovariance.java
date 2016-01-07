package com.thoughtworks.corejava.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/6/16.
 * In Java Array sub-typing is co-variant which
 * means that S[] is considered as the subtype of T[]
 * when S is the sub-type of T
 */
public class ArraysCovariance {
    public static void main(String[] args) {
        Integer[] intArr = new Integer[]{1, 2, 3};
        Number[] numbers = intArr;
        numbers[2] = 9; // Allowed as 9 is a integer
        //numbers[0] =3.9; //Exception :: We cannot put double in an Integer Array
        //To print an Array's contents use the Arrays.toString(SOME_ARRAY) method
        System.out.println(Arrays.toString(numbers));
        assert Arrays.toString(numbers).equals("[1, 2, 9]");
        List<Integer> intList = Arrays.asList(1, 2, 3);
        //List<Number> numberList = intList; //COMPILE TIME ERROR as Generics are not co-variant
        //NOTE :: Remember List<Integer> is not the sub-type of List<Number>

    }
}
