package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 12/30/15.
 */
public class SortedPair<T extends  Comparable> {
    private T first;
    private T second;

    public SortedPair(T left, T right) {
        if(left.compareTo(right)>0){
            first =  right;
            second = left;
        }else{
            first = left;
            second = right;
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
