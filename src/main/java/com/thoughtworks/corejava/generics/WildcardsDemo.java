package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 7/12/15.
 */
public class WildcardsDemo {
    /*
     * This class demonstrates how wildcards are used in Java
     */
    public static void main(String[] args) {
        //Create Integer List
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        System.out.println("Print integerList :: ");
        //Invoke method that takes a list of any Type
        printListAnyType(integerList);

        //Create String List
        List<String> stringList = new ArrayList<String>();
        stringList.add("John");
        stringList.add("Gunjan");
        System.out.println("Print stringList :: ");
        //Invoke method that takes a list of any Type
        printListAnyType(stringList);
    }

    /*
     * Declaring a generic method which prints a list of any type :: i.e Integer or String
     * See wildcard ? in method parameter
     */
    public static void printListAnyType(List<?> list) {
        for (int counter = 0; counter < list.size(); counter++) {
            Object objAnyType = list.get(counter);
            System.out.println("\t" + objAnyType.toString());
        }
    }
}
