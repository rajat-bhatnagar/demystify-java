package com.thoughtworks.corejava.functional;

import java.util.function.Function;

public class _Lambdas {
    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("mary"));
        System.out.println(toUpperCaseWithException.apply("mary"));
        System.out.println(toUpperCaseWithException.apply(null));
    }

    static Function<String, String> toUpperCase = String::toUpperCase;

    static Function<String, String> toUpperCaseWithException = name -> {
        if (name == null) {
            throw new IllegalArgumentException("Empty Name");
        }
        return name.toUpperCase();
    };
}
