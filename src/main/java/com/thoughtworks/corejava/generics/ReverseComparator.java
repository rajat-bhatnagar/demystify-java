package com.thoughtworks.corejava.generics;

import java.util.Comparator;

/**
 * Created by rajatbhatnagar on 12/30/15.
 */
public class ReverseComparator<T> implements Comparator<T> {
    private final Comparator<T> delegateComparator;

    public ReverseComparator(Comparator<T> delegateComparator) {
        this.delegateComparator = delegateComparator;
    }

    @Override
    public int compare(T left, T right) {
        return -1 * delegateComparator.compare(left , right);
    }
}
