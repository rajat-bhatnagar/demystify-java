package com.thoughtworks.corejava.collections;

import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/22/15.
 * Demonstrates how heterogenous objects can be sorted using a custom comparator
 * Requirement- elements should be sorted based on length and then natural alphabetical order
 */
public class SortHeterogenousObjects {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new HeterogenousObjectComparator());
        treeSet.add("A");
        treeSet.add(new StringBuffer("ABC"));
        treeSet.add(new StringBuffer("AA"));
        treeSet.add("XX");
        treeSet.add("ABCD");
        treeSet.add("A");
        System.out.println("Sorted Heterogenous Elements :: "+treeSet);
    }
}
