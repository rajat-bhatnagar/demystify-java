package com.thoughtworks.corejava.serialization;

import java.io.Serializable;

/**
 * Created by rajatbhatnagar on 6/24/15.
 * Demonstrates that a class must implement Serializable which
 * is a MARKER INTERFACE in order to be serialized
 */
public class Student implements Serializable {
    int rollNumber = 1;

    public int getRollNumber() {
        return rollNumber;
    }
}
