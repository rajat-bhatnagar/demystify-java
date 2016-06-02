package com.thoughtworks.corejava.generics.genericLibraryWithLegacyClient;

/**
 * Created by rajatbhatnagar on 1/28/16.
 */
public interface Stack<E> {
    public boolean empty();
    public void push(E elt);
    public E pop();
}
