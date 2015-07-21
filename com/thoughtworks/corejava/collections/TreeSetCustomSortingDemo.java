package com.thoughtworks.corejava.collections;

import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/21/15.
 * Sort the integer elements in descending order using Comparator class
 */
public class TreeSetCustomSortingDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());
        treeSet.add(987);
        treeSet.add(787);
        treeSet.add(564);
        treeSet.add(10003);
        treeSet.add(2);
        System.out.println("Elements of TreeSet are :: " + treeSet);
    }

}
