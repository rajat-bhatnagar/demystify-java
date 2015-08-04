package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/21/15.
 */
public class StringReverseComparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = o1.toString();
        String str2 = o2.toString();
        return -str1.compareTo(str2);
    }
}
