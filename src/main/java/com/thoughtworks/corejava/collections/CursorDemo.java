package com.thoughtworks.corejava.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Created by rajatbhatnagar on 6/20/15.
 */
public class CursorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        Enumeration enumeration = vector.elements();
        Iterator iterator = vector.iterator();
        ListIterator listIterator = vector.listIterator();
        //Find out the implementation class for each of the interface
        // i.e Enumeration, Iterator and ListIterator Interfaces
        System.out.println("Implementation class for  Enumeration interface : " + enumeration.getClass().getName());
        System.out.println("Implementation class for  Iterator interface : " + iterator.getClass().getName());
        System.out.println("Implementation class for  ListIterator interface : " + listIterator.getClass().getName());
    }
}
