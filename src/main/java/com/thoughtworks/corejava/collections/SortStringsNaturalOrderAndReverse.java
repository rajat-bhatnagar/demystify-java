package com.thoughtworks.corejava.collections;

import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/21/15.
 */
public class SortStringsNaturalOrderAndReverse {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("Jennifer Lopez");
        treeSet.add("Jennifer Lawrence");
        treeSet.add("Priyanka Chopra");
        treeSet.add("Priyanka");
        System.out.println(" Sorted Strings Natural Order - treeSet :: " + treeSet);
        TreeSet treeSet1 = new TreeSet(new StringReverseComparator());
        treeSet1.add("Jennifer Lopez");
        treeSet1.add("Jennifer Lawrence");
        treeSet1.add("Priyanka Chopra");
        treeSet1.add("Priyanka");
        System.out.println(" Sorted Strings Natural Order - treeSet1 :: " + treeSet1);
    }
}
