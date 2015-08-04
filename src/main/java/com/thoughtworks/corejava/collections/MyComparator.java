package com.thoughtworks.corejava.collections;

import java.util.Comparator;

/**
 * Created by rajatbhatnagar on 6/21/15.
 */
public class MyComparator implements Comparator {
    //Write logic to sort elements in descending order in compare method
    @Override
    public int compare(Object o1, Object o2) {
        Integer integer1 = (Integer) o1;
        Integer integer2 = (Integer) o2;
        if (integer1 > integer2)
            return -1;
        else if (integer1 < integer2)
            return +1;
        else
            return 0;
    }
}
