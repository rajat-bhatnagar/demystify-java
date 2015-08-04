package com.thoughtworks.corejava.serialization;

import java.io.Serializable;

/**
 * Created by rajatbhatnagar on 6/27/15.
 */
public class StaticTransientFinalModifiersDemo implements Serializable {
    private int varOne = 10;
    private transient int varTwo = 20;
    private static int varThree = 89;
    private transient static int varFour = 65;
    private final int varFive = 33;
    private transient final int varSix = 90;
    private transient final static int varSeven = 24;

    public int getVarOne() {
        return varOne;
    }

    public int getVarTwo() {
        return varTwo;
    }

    public static int getVarThree() {
        return varThree;
    }

    public static int getVarFour() {
        return varFour;
    }

    public int getVarFive() {
        return varFive;
    }

    public int getVarSix() {
        return varSix;
    }

    public static int getVarSeven() {
        return varSeven;
    }
}
