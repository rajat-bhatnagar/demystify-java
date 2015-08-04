package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 7/12/15.
 */
public class EnforceTypeCasting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Tom");
        list.add("Jacqueline");
        System.out.println("list = " + list);
    }
}
