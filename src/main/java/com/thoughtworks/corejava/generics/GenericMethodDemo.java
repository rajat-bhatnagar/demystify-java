package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 */
public class GenericMethodDemo {
    public static void main(String[] args) {
    String[] strArr = new String[]{"Coding","Again"};
    Integer[] intArr = new Integer[]{12,78,98};
    toList(strArr);
    toList(intArr);
    List<String> someStringList = GenericMethodDemo.toList(new String[]{"Another","Way","Of","Method","Invocation"});
    }
    //A generic method that converts Array of any type to a List
    //A method which declares the type variable in such a way is called as a generic method
    //The static method toList accepts an array of type T[] and returns a list of type List<T>,
    //and does so for any type T. This is indicated by writing <T> at the beginning of the method signature,
    //which declares T as a new type variable
    public static <T> List<T> toList(T[] arr){
        List<T> list = new ArrayList<>();
        for(T element : arr){
            list.add(element);
        }
        System.out.println("list has been created from array of type "+ arr.getClass().toString() + " :: "+list);
        return list;
    }
}
