package com.thoughtworks.corejava.collections;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/21/15.
 * Demonstrate the methods of SortedSet Interface
 */
public class SortedSetDemo {
    public static void main(String[] args) {
        SortedSet sortedSet = new TreeSet();
        sortedSet.add(1001);
        sortedSet.add(100);
        sortedSet.add(1000);
        sortedSet.add(101);
        sortedSet.add(102);
        sortedSet.add(103);
        sortedSet.add(100);
        sortedSet.add(2103);
        //Heterogenous object addition is not allowed in Treeset. Adding a string as below will give
        // a Runtime Exception
        //sortedSet.add("String Element");
        //Remember Order is not preserved in a Set
        System.out.println("SortedSet elements "+sortedSet);
        System.out.println("First Element :: "+sortedSet.first());
        System.out.println("Last Element :: "+sortedSet.last());
        System.out.println("headSet method pulls the elements before an Object :: " + sortedSet.headSet(1000));
        System.out.println("tailSet method pulls the element greater than or equal to an Object :: "+sortedSet.tailSet(1000));
        System.out.println("subSet method pulls a range of element, first one being inclusive && last one exclusive:: "+sortedSet.subSet(103,2103));
    }
}
