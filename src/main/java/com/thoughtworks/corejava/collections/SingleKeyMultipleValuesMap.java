package com.thoughtworks.corejava.collections;

import java.util.*;

/**
 * Created by rajatbhatnagar on 8/13/15.
 * The program demonstrates how for one particular key we can store
 * multiple values in a Map
 */
public class SingleKeyMultipleValuesMap {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<String, List<String>>();

        List<String> listOne = new ArrayList<String>();
        listOne.add("Apple");
        listOne.add("Banana");

        List<String> listTwo = new ArrayList<String>();
        listTwo.add("Alps");
        listTwo.add("Himalayas");
        //Put values in Map
        map.put("Fruit", listOne);
        map.put("Mountains", listTwo);
        //Iterate and display values
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            System.out.println("key = " + key);
            List<String> values = entry.getValue();
            System.out.println("values = " + values);
        }

    }
}
