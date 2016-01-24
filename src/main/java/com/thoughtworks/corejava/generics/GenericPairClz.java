package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 1/24/16.
 * Demonstrates a generic class
 */
public class GenericPairClz<T,U> {
    private final T first;
    private final U second;

    public GenericPairClz(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        //A common mistake is to forget the type parameter when invoking the constructor
        GenericPairClz<String,Integer> pair = new GenericPairClz<>("Rocky",1);
        assert pair.getFirst().equals("Rocky") && pair.getSecond().equals(1);
    }
}
