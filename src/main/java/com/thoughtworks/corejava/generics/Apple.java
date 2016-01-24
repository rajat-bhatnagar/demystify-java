package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 1/24/16.
 */
public class Apple extends Fruit implements Comparable<Apple>{
    public Apple(int size) {
        super("Apple", size);
    }

    @Override
    public int compareTo(Apple apple) {
        return super.compareTo(apple);
    }
}
