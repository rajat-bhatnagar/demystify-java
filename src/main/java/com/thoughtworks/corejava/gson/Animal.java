package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 10/3/15.
 */
public class Animal<T> {
    public T animal;

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
