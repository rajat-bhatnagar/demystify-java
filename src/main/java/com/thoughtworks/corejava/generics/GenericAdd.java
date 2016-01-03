package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/3/16.
 * A simple addition of a numbers and concatenation of Strings using generics
 */
public class GenericAdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        int sum = 0;
        for(int i : numbers){
            sum+=i;
        }
        //Validate that the sum is 6
        assert  sum == 6;
        System.out.println("Sum :: "+sum);

        List<String> words = new ArrayList<>();
        words.add("Coding ");
        words.add("is ");
        words.add("fun");
        String s = words.get(0) + words.get(1) + words.get(2);
        System.out.println("s = " + s);
        assert s.equalsIgnoreCase("Coding is fun");
    }
}
