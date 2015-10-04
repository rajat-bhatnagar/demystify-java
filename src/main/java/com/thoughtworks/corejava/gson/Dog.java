package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 10/3/15.
 */
public class Dog {
    private String name;

    private Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
