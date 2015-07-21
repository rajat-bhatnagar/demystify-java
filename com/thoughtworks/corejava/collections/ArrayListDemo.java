package com.thoughtworks.corejava.collections;

import java.util.ArrayList;

/**
 * Created by rajatbhatnagar on 6/1/15.
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList strList = new ArrayList<String>(0);
        strList.add("Item1");
        strList.add(2);
        strList.add("Item1");
        strList.add("Item2");
        strList.add(null);
        System.out.println("strList size : "+strList.size());
        System.out.println("strList  : "+strList);
    }
}
