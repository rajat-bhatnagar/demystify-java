package com.thoughtworks.corejava.generics.genericLibraryWithLegacyClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/28/16.
 */
public class ArrayStack<E> implements Stack<E> {
    private List<E> list;

    public ArrayStack() {
        list = new ArrayList<E>();
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public void push(E elt) {

    }

    @Override
    public E pop() {
        return null;
    }


}
