package com.thoughtworks.corejava.functional;

import java.util.Optional;
import java.util.function.Supplier;

public class _Optional {
    public static void main(String[] args) {

        Optional.ofNullable(null)
                .ifPresent(System.out::println);

        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "Default Value");

        System.out.println(value);

        Optional.ofNullable("sara@rehab.com")
                .ifPresent(email -> System.out.println("Sending e mail to - " + email));


        Supplier<IllegalArgumentException> exception = () -> new IllegalArgumentException("exception");
        Object result = Optional.ofNullable("Joe")
                .orElseThrow(exception);

        System.out.println(result);

        Optional<String> emptyOptional = Optional.empty();
        System.out.println(emptyOptional.isPresent());

        Optional<String> optional = Optional.of("Yep");
        System.out.println(optional.isPresent());

        Optional<String> hello = Optional.ofNullable(null);

        String orElseGetValue = hello.map(String::toUpperCase)
                .orElseGet(() -> {
                    //do some eatra logic of required
                    return "Something Meaningful";
                });
        System.out.println(orElseGetValue);

    }
}
