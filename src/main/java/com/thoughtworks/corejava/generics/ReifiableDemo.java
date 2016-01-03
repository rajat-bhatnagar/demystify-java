package com.thoughtworks.corejava.generics;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/3/16.
 */
public class ReifiableDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Class<?> arrayList = list.getClass();
        System.out.println(arrayList);
        TypeVariable<? extends Class<?>>[] typeVariable = arrayList.getTypeParameters();
        System.out.println(Arrays.toString(typeVariable));
    }
}
