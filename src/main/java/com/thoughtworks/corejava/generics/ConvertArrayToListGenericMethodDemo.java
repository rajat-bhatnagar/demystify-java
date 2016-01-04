package com.thoughtworks.corejava.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/3/16.
 */
public class ConvertArrayToListGenericMethodDemo {
    public static void main(String[] args) {
        String[] strArr = { "Never ","Ever Give Up"};
        System.out.println("String Array :: "+strArr);
        System.out.println("String Array Converted to a LIST :: "+toList(strArr));
        Integer[] intArr = {12,13,3,42,100 };
        System.out.println("Integer Array :: "+intArr);
        System.out.println("Integer Array Converted to a LIST :: "+toList(intArr));

    }
    /*
     * A generic method that takes in an input Array of any type and returns a List
     */
    public static <T> List<T> toList(T[] inputArr){
        List<T> list = new ArrayList<T>();
        for(T element : inputArr){
            list.add(element);
        }
        return list;
    }
}
