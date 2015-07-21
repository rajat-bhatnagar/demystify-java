package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 */
public enum EnumWithMethod {
    UHG, Infosys, Ness, TCS;
    public static void companyName(){
        System.out.println(EnumWithMethod.UHG);
    }
    public static void main(String[] args) {
        companyName();
    }
}
