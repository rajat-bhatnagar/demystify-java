package com.thoughtworks.corejava.serialization;

import java.io.Serializable;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * This class demonstrates how to declare and use -- private static final long serialVersionUID
 */
public class SerialVersionUIDDemo implements Serializable {
    private static final long serialVersionUID = 1L;
    private int numOne = 20;
    private int numTwo = 30;
    private int numThree = 40;
    private int numFour = 40;
    private int numFive = 40;
    private int numSix = 40;

    public int getNumSix() {
        return numSix;
    }

    public int getNumFive() {
        return numFive;
    }

    public int getNumFour() {
        return numFour;
    }

    public int getNumThree() {
        return numThree;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public int getNumOne() {
        return numOne;
    }

}
