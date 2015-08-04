package com.thoughtworks.corejava.serialization;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * The program demonstrates de-serialization of a serializable child class
 * with a no-Serializable parent
 */
public class ParentNotSerializable {
    private int parentNum = 89;

    public void setParentNum(int parentNum) {
        this.parentNum = parentNum;
    }

    public int getParentNum() {

        return parentNum;
    }

    //We do not have a no-arg constructor here. Assuming compiler will create it

    //If we have a constructor with arguments, We need to create the default Constructor
    //as it will be called during de-serialization of child class
    public ParentNotSerializable(int parentNum) {
        this.parentNum = parentNum;
    }

    public ParentNotSerializable() {
    }
}
