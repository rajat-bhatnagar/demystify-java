package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 */
public enum EnumWithConstructorMethod {
    RC(99), Foster(46),KF(87), HU;
    int price;

    EnumWithConstructorMethod(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    EnumWithConstructorMethod() {
        this.price = 65;
    }
}
