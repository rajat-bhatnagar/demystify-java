package com.thoughtworks.corejava.generics;

/**
 * Created by rajatbhatnagar on 1/23/16.
 */
public class IntegerComparableDemo {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 12;
        Integer num3 = 100;
        Integer num4 = 12;
        Integer num5 = 10;
        //Integer implements Comparable interface
        assert num1.compareTo(num2)<0;
        System.out.println("num1.compareTo(num2) = "+ num1.compareTo(num2));
        assert num3.compareTo(num4)>0;
        System.out.println("num3.compareTo(num4) = "+num3.compareTo(num4));
        assert num1.compareTo(num5) == 0;
        System.out.println("num1.compareTo(num5) = "+num1.compareTo(num5));
    }
}
