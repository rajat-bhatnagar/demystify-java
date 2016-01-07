package com.thoughtworks.corejava.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/6/16.
 */
public class ContainsDemo {
    public static void main(String[] args) {
        List<Object> objects = Arrays.<Object>asList(1, 2, "One");
        List<Integer> integerList = Arrays.asList(1, 2);
        assert integerList.contains(1);
        assert objects.containsAll(integerList);
        assert !integerList.containsAll(objects);
    }
}
