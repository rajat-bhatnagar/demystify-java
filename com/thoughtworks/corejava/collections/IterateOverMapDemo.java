package com.thoughtworks.corejava.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by rajatbhatnagar on 7/12/15.
 * References :: http://stackoverflow.com/questions/1066589/iterate-through-a-hashmap
 */
public class IterateOverMapDemo {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<Integer,String>();
        employeeMap.put(1,"John");
        employeeMap.put(2, "Gunjan");
        System.out.println("Fetching Key, Value from the  employeeMap");
        printMapKeyValue(employeeMap);
        System.out.println("Map after iteration :: " + employeeMap);
        System.out.println("Fetching KEY from the employeeMap");
        printKeyOfMap(employeeMap);
        System.out.println("Fetching VALUE from the employeeMap");
        printMapValueOnly(employeeMap);
    }

    /* Method to get the key, value pairs from a Map
     * Pass the Map and print the Key && Value Pairs
     * If you are interested in both Key and Value Use
     * :: entrySet() method
     * */
    public static void printMapKeyValue(Map map){
        //Declare an iterator
        Iterator iterator = map.entrySet().iterator();
           while (iterator.hasNext()){
               //Typecast iterator to Map.entry to pull appropriate key value pair
               Map.Entry pair = (Map.Entry)iterator.next();
               System.out.println("Key :: "+pair.getKey() + " Value :: "+ pair.getValue());
               //iterator.remove(); // Avoids a Concurrent modification exception, but will make the map empty after iteration
           }
    }

    /*
    * Method to get only the keys of the Map
    * Use KeySet() method
     */
    public static void printKeyOfMap(Map<Integer, String> map) {
        for (Integer keys : map.keySet()) {
            System.out.println("key = " + keys);
        }
    }
    /*
     * Method to get only Values from a Map
     * Use values() method
     */
    public static void printMapValueOnly(Map<Integer,String> map){
        for(String stringValues : map.values()){
            System.out.println("Value = " + stringValues);
        }
    }
}
