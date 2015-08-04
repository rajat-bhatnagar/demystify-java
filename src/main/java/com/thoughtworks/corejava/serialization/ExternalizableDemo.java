package com.thoughtworks.corejava.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by rajatbhatnagar on 6/29/15.
 * * This class demonstrates the Externalization Implementation
 */
public class ExternalizableDemo implements Externalizable {
    //Transient keyword plays no role when we implement Externalization
    private transient int numOne;
    private int numTwo;
    private String str;

    public int getNumOne() {
        return numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public String getStr() {
        return str;
    }

    // No-Arg constructor for class is mandatory if class implements Externalizable
    public ExternalizableDemo() {
        System.out.println("No-Arg constructor");
    }

    public ExternalizableDemo(int numOne, int numTwo, String str) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.str = str;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(numOne);
        out.writeObject(str);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        numOne = in.readInt();
        str = (String) in.readObject();
    }
}
