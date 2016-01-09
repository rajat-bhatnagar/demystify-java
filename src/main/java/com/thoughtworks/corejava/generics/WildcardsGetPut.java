package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/9/16.
 * Demonstrates Get and Put concept wile using lower bound and upper bound wildcards
 */
@SuppressWarnings("unchecked")
public class WildcardsGetPut {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<>();
        List<? super Number> tub = numbers;
        List<? extends Number> mug = numbers;
        // ? super Number implies that you can only put values in the tub
        for (int i = 0; i < 10; i++) numbers.add(i);
        System.out.println("Numbers " + tub);
        double sum = 0;
        for (Number num : mug) sum += num.doubleValue();
        System.out.println("Sum : " + sum);
        assert sum == 45;
        assert tub.toString().equals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
    }
}
