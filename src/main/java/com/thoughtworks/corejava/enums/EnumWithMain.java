package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 */
public enum EnumWithMain {
    MOM, DAD, SISTER, WIFE;

    //Remember to end ENUM constants with a semicolon if you have a main or any method inside enum
    public static void main(String[] args) {
        for (EnumWithMain enumWithMain : EnumWithMain.values()) {
            System.out.println("enumWithMain.name() = " + enumWithMain.name());
            System.out.println("enumWithMain.ordinal() = " + enumWithMain.ordinal());
        }
    }
}
