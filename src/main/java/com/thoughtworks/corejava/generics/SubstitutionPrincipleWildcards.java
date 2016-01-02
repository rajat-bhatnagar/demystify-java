package com.thoughtworks.corejava.generics;

import java.util.*;

/**
 * Created by rajatbhatnagar on 1/2/16.
 * The Get and Put Principle: use extends only when you intend to get values out of a
 * structure. Use super only when you intend to put values into a structure.
 */
public class SubstitutionPrincipleWildcards {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<Integer>() ;
        // < super class > implies lower bounded wildcards
        List<? super Number> numbers = new ArrayList<Number>();
        //Use super when you intend to put values inside the structure
        numbers.add(3);
        System.out.println("numbers : "+numbers);
        // <? extends class> implies upper bounded wildcards
        //Use extends when you intend to get values out of a structure
        List<? extends Number> numbersOne = new ArrayList<Number>();
        System.out.println("numbersOne = " + numbersOne);
        //don’t use any wildcards when you intend to both get and putz` values into and out of a structure
        }
}
