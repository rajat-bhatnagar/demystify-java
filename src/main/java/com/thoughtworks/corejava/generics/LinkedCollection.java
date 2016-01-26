package com.thoughtworks.corejava.generics;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by rajatbhatnagar on 1/25/16.
 * Program to demonstrate that Type parameters are in scope for nested, non-static classes
 * *** A class implementing collections as a singly-linked list
 */
public class LinkedCollection<E> extends AbstractCollection<E> {
    private class Node {
        //Because class is not private E is visible here
        private E element;
        private Node next = null;

        public Node(E element) {
            this.element = element;
        }
    }

    private Node first = new Node(null);
    private Node last = first;
    private int size = 0;

    public LinkedCollection() {
    }

    public LinkedCollection(Collection<? extends E> c) {
        addAll(c);
    }

    public boolean add(E elt) {
        last.next = new Node(elt);
        last = last.next;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }


    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node current = first;

            public boolean hasNext() {
                return current.next != null;
            }

            public E next() {
                if (current.next != null) {
                    current = current.next;
                    return current.element;
                } else throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
