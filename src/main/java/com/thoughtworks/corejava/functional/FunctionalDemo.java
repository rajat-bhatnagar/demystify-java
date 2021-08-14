package com.thoughtworks.corejava.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalDemo {
    public static void main(String[] args) {

        List<Person> persons = Arrays.asList(new Person("Paul", Gender.MALE),
                new Person("Laura", Gender.FEMALE),
                new Person("Mariah", Gender.FEMALE));

        System.out.println("Imperative Way - ");

        // Imperative Way
        for (Person person : persons) {
            if (person.gender.equals(Gender.FEMALE)) {
                System.out.println(person);
            }
        }

        //Declarative way
        System.out.println("Functional Way - ");

        Predicate<Person> personPredicate = person -> Gender.FEMALE.equals(person.gender);
        persons.stream()
                .filter(personPredicate)
                .forEach(System.out::println);

        // Imperative way
        System.out.println("Imperative - incrementBy1 : " + incrementBy1(19));

        // Declarative Way
        Function<Integer, Integer> incrementBy1Function = number -> number + 1;
        System.out.println("Declarative # incrementBy1Function : " + incrementBy1Function.apply(19));


        int input = incrementBy1(19);

        //Imperative way
        System.out.println("Imperative - incrementBy1 * multiplyBy10 : " + multiplyBy10(input));

        //Declarative Way

        //Function takes 1 argument and produces 1 result
        Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

        Function<Integer, Integer> incrementBy1AndMultiplyBy10Function
                = incrementBy1Function.andThen(multiplyBy10Function);

        System.out.println("Declarative Chaining incrementBy1AndMultiplyBy10Function - "
                + incrementBy1AndMultiplyBy10Function.apply(19));

        // Bi Function takes 2 Arguments and produces 1 Result
        BiFunction<Integer, Integer, Integer> incrementBy1MultiplyByBiFunction
                = (numberToIncrementBy1, numberToMuliplyBy) -> (numberToIncrementBy1 + 1) * numberToMuliplyBy;

        System.out.println("Bi Function - incrementBy1MultiplyByBiFunction : " + incrementBy1MultiplyByBiFunction.apply(19, 10));

    }

    static int incrementBy1(int number) {
        return number + 1;
    }

    static int multiplyBy10(int number) {
        return number * 10;
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
