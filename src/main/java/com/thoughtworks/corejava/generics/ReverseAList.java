package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/6/16.
 */
public class ReverseAList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Original Integers List : " + integers);
        reverseType(integers);
        System.out.println("Reversed Integers List : " + integers);
        assert integers.toString().equals("[5, 4, 3, 2, 1]");

        List<String> strings = Arrays.asList("One", "Two", "Three");
        System.out.println("Original strings List  = " + strings);
        reverse(strings);
        System.out.println("Reversed Integers List  = " + strings);
        assert strings.toString().equals("[Three, Two, One]");

        //List<?> list = new ArrayList<?>(); COMPILE ERROR
        //Wildcards cannot be used in instance creation
    }

    public static <T> void reverseType(List<T> someList) {
        //Create a new List from the original list
        List<T> reversedList = new ArrayList<T>(someList);
        //Iterate over the List and set the elements in the new List the other way around
        for (int i = 0; i < someList.size(); i++) {
            someList.set(i, reversedList.get(reversedList.size() - 1 - i));
        }
    }

    public static void reverse(List<?> list) {
        reverseType(list);
    }
}
