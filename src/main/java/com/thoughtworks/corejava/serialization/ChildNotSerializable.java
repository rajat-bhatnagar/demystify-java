package com.thoughtworks.corejava.serialization;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * This program demonstrates that if a parent class is serializable
 * then the child class automatically inherits the serializable nature
 * even though the child does not implement Serializable interface
 */
public class ChildNotSerializable extends ParentSerializable {
    private String childString = "child_of_parent";

    public String getChildString() {
        return childString;
    }
}
