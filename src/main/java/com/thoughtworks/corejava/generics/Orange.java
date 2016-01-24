package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 1/24/16.
 */
public class Orange extends Fruit implements Comparable<Orange> {
    public Orange(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(Orange orange) {
        return super.compareTo(orange);
    }
}
