package com.thoughtworks.corejava.serialization;

import java.io.Serializable;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * This program demonstrates that if a parent class is serializable
 * then the child class automatically inherits the serializable nature
 * even though the child does not implement Serializable interface
 */
public class ParentSerializable implements Serializable {
    private String parentString = "Parent_Of_Child";

    public String getParentString() {
        return parentString;
    }
}
