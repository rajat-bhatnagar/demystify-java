package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 * SUBSTITUTION PRINCIPLE
 * The substitution principle tells us that whenever a value of one type is expected ,
 * one may provide a value of any subtype of that type
 */
public class SubstitutionPrincipleDemo {
    public static void main(String[] args) {
        List<Number> numbers = new ArrayList<Number>();
        //Adding 21 as Integer is a sub type of Number
        numbers.add(21);
        //Adding 56.94 as Double is a sub type of Number
        numbers.add(56.94);
        System.out.println("Numbers :: "+numbers);
    }
}
