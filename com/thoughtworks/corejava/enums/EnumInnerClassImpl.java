package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * Implementation of an enum which has a inner class over-riding a method with the same name
 */
public class EnumInnerClassImpl {
    public static void main(String[] args) {
        for(EnumInnerClass colors : EnumInnerClass.values())
            colors.info();
    }
}
