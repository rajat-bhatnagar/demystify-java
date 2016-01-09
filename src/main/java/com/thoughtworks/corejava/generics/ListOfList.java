package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/9/16.
 * Added class to demonstrate a List of List
 */
public class ListOfList {
    public static void main(String[] args) {
        List<List<?>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1,2,3));
        lists.add(Arrays.asList("mission", "impossible"));
        System.out.println("lists = " + lists);
        assert lists.toString().equals("[[1, 2, 3], [mission, impossible]]");
    }
}
