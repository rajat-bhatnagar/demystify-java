package com.thoughtworks.corejava.generics;

public class Person <E> {
    private E e;

    public E getPerson(){
        return e;
    }

    public void setPerson(E e){
        this.e = e;
    }

}
