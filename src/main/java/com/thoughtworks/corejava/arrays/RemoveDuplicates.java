package com.thoughtworks.corejava.arrays;

import java.util.Arrays;
import java.util.stream.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Integer[] numbers = { 1, 2, 3, 1, 2, 4};
        System.out.println(Arrays.toString(uniqueNumberElements(numbers)));

        int[] ages = { 1, 1, 3, 4};
        System.out.println(Arrays.toString(uniqueAges(ages)));
    }

    private static int[] uniqueAges(int[] ages) {
        return IntStream.of(ages)
                .distinct()
                .toArray();
    }

    private static Integer[] uniqueNumberElements(Integer[] integers) {
        return Arrays.stream(integers)
                .distinct()
                .toArray(Integer[]::new);
    }
}
