package com.thoughtworks.corejava.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by rajatbhatnagar on 6/19/15.
 * Demonstrate how an Iterator can be used to iterate over a collection of elements
 */
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(0);
        for (int counter = 0; counter <= 10; counter++) {
            arrayList.add(counter);
        }
        System.out.println("ArrayList Element :: " + arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            if (integer % 2 != 0) {
                // If the element is a even number do nothing
            } else {
                //If the value is not a even number, remove the element from the collection by using
                // remove() method of Iterator
                iterator.remove();
            }
        }
        System.out.println("ArrayList Elements after Removal :: " + arrayList);
    }
}
