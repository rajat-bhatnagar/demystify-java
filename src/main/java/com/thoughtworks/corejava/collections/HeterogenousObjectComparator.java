package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/22/15.
 */
public class HeterogenousObjectComparator implements java.util.Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String str1 = o1.toString();
        String str2 = o2.toString();
        int l1 = str1.length();
        int l2 = str2.length();
        if (l1 < l2)
            return -1;
        else if (l1 > l2) {
            return +1;
        } else
            return str1.compareTo(str2);
    }
}
