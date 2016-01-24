package com.thoughtworks.corejava.generics;

import java.util.Comparator;

/**
 * Created by rajatbhatnagar on 1/24/16.
 */
public class StringComparator {
    public static void main(String[] args) {
     //A custom Comparator which compares string based on size
        Comparator<String> sizeOrder = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() > s2.length() ? 1 :
                        s1.length() <s2.length() ?-1 :
                        s1.compareTo(s2);
            }
        };
        assert "two".compareTo("Three") > 0; // In Natural Ordering "two" is greater than "three"
        assert  sizeOrder.compare("two","three") <0;
        //In our custom comparator "two" is less than "three" because we compare on the sizes
    }
}
