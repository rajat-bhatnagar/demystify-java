package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 */
public class EnumWithConstructorMethodImpl {
    public static void main(String[] args) {
        for (EnumWithConstructorMethod enumWithConstructorMethod : EnumWithConstructorMethod.values()) {
            System.out.println(enumWithConstructorMethod.name() + " :: " + enumWithConstructorMethod.getPrice());
        }
    }
}
