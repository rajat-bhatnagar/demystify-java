package com.thoughtworks.corejava.serialization;

import java.io.Serializable;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * The program demonstrates de-serialization of a serializable child class
 * with a no-Serializable parent
 */
public class ChildSerializable extends ParentNotSerializable implements Serializable {
    private int childNumber = 99;

    public ChildSerializable(int parentNum) {
        super(parentNum);
    }

    public void setChildNumber(int childNumber) {
        this.childNumber = childNumber;
    }

    public int getChildNumber() {
        return childNumber;
    }
}
