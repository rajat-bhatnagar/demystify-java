package com.thoughtworks.corejava.generics.legacyLibraryWithlegacyClient;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/27/16.
 */
public class ArrayStack implements Stack {
    private List list;

    public ArrayStack() {
        list = new ArrayList();
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }

    @Override
    public void push(Object elt) {
        list.add(elt);
    }

    @Override
    public Object pop() {
        Object elt = list.remove(list.size() - 1);
        return elt;
    }

    @Override
    public String toString() {
        return "stack=" + list.toString();
    }
}
