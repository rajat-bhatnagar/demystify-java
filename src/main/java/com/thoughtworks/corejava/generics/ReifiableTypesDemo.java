package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/3/16.
 */
public class ReifiableTypesDemo {
    public static void main(String[] args) {
        //Demonstrate Reifiable types

        List<?> someList = new ArrayList<>();
        System.out.println(someList.getClass());

        List list = new ArrayList();
        System.out.println(list.getClass());

        //Type variables T , Parameterized types with parameters ArrayList<String> are NON-REIFIABLE TYPES
        //Parameterized Type with bounds , both Upper bounds and Lower bounds are NON-REIFIABLE TYPES

    }
}
