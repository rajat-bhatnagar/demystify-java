package com.thoughtworks.corejava.collections;

import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/22/15.
 * Demonstrate how StringBuffer elements can be sorted using a custom Comparator
 */
public class SortStringBufferElements {
    public static void main(String[] args) {
        TreeSet<StringBuffer> stringBufferSet = new TreeSet<StringBuffer>(new StringBufferComparator());
        stringBufferSet.add(new StringBuffer("Antony"));
        stringBufferSet.add(new StringBuffer("Arhant"));
        stringBufferSet.add(new StringBuffer("Pradeep"));
        stringBufferSet.add(new StringBuffer("Patrick"));
        stringBufferSet.add(new StringBuffer("Gunjan"));
        System.out.println("Order of Elements :: "+stringBufferSet);

    }
}
