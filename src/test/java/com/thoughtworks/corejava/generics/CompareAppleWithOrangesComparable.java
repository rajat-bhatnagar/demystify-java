package com.thoughtworks.corejava.generics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/24/16.
 */
public class CompareAppleWithOrangesComparable {
    public static void main(String[] args) {
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(2);
        Orange orange1 = new Orange(1);
        Orange orange2 = new Orange(4);
        //List of Apples
        List<Apple> apples = Arrays.asList(apple1,apple2);
        //List of oranges
        List<Orange> oranges = Arrays.asList(orange1,orange2);
        //List of Fruits
        //We are able to compare Apples with Oranges here
        List<Fruit> mixed = Arrays.<Fruit>asList(apple1,orange2,apple2);
        assert Collections.max(apples).equals(apple2);
        assert Collections.max(oranges).equals(orange2);
        //Comparison of oranges with apples is prohibited
        //assert Collections.max(mixed).equals(orange2); //compile time error as Apple and Orange are strongly typed
    }
}
