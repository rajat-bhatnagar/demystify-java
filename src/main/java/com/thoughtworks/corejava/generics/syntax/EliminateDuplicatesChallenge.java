package com.thoughtworks.corejava.generics.syntax;

import java.util.ArrayList;
import java.util.Arrays;

public class EliminateDuplicatesChallenge {

    /*
     ** CHALLENGE OBJECTIVE
     *
     * Create a generic method
     * Pass a generic ArrayList to the method, which eliminates duplicates
     * Return a new ArrayList without Duplicates
     */
    private static <T extends Comparable<T>> ArrayList<T> eliminateDuplicates(ArrayList<T> list) {

        ArrayList<T> noDuplicatesList = new ArrayList<>();
        noDuplicatesList.add(list.get(0));


        for (int i = 1; i < list.size(); i++) {
            boolean found = false;
            for (int j = 0; j < noDuplicatesList.size(); j++) {
                if (list.get(1).compareTo(noDuplicatesList.get(j)) == 0) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                noDuplicatesList.add(list.get(i));
                found = false;
            }
        }

        return noDuplicatesList;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 40, 10, 20, 30));
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Jack", "Hugh", "Jack", "Mellisa", "Hugh", "Jack"));


        ArrayList<Integer> output = eliminateDuplicates(numbers);
        System.out.println("List without duplicates : " + output);
        ArrayList<String> uniqueNames = eliminateDuplicates(names);
        System.out.println("List without duplicates : " + uniqueNames);
    }
}
