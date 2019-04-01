package com.thoughtworks.corejava.generics.syntax;

public class MyGenericList<T> implements MyGenericInterface<T> {

    public T list;

    public void assign(T t){
        this.list = t;
    }
}
