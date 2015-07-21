package com.thoughtworks.corejava.collections;

import java.util.Vector;

/**
 * Created by rajatbhatnagar on 6/18/15.
 */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        System.out.println("Vector Initial Capacity  : "+vector.capacity());
        for(int counter=0;counter<10;counter++){
            vector.addElement(counter);
        }
        System.out.println("Vector Capacity after adding 10 elements  : "+vector.capacity());
        vector.addElement("11th Element");
        System.out.println("Vector Capacity after adding 11 elements  : "+vector.capacity());
        System.out.println("Vector Elements are :: "+vector);
    }
}
