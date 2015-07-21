package com.thoughtworks.corejava.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by rajatbhatnagar on 6/20/15.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new LinkedHashSet();
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        // Add a null element to HashSet
        hashSet.add(null);
        //Add a duplicate
        hashSet.add("One");
        System.out.println("Adding a duplicate returns :: "+hashSet.add("One"));
        System.out.println("Size of HashSet :: "+hashSet.size());
        // Note that insertion order is not preserved , but LinkedHashSet preserves insertion order
        System.out.println("HashSet elements "+hashSet);
    }
}
