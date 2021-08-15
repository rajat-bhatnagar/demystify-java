package com.thoughtworks.corejava.functional;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        // Imperative Approach
        System.out.println("# Imperative - isPhoneNumberValid " + isPhoneNumberValid("7039818798"));
        System.out.println("# Imperative - isPhoneNumberValid " + isPhoneNumberValid("8139818798"));

        // Declarative Approach
        System.out.println("# Declarative - isPhoneNumberValidPredicate " + isPhoneNumberValidPredicate.test("7039818798"));
        System.out.println("# Declarative - isPhoneNumberValidPredicate " + isPhoneNumberValidPredicate.test("8139818798"));

        // Imperative Approach
        System.out.println("# Imperative - containsZero " + containsZero("7039818798"));
        System.out.println("# Imperative - containsZero " + containsZero("8139818798"));

        // Declarative Approach
        System.out.println("# Declarative - containsZeroPredicate " + containsZeroPredicate.test("7039818798"));
        System.out.println("# Declarative - containsZeroPredicate " + containsZeroPredicate.test("8139818798"));

        // Chaining Predicates
        System.out.println("# Chaining Predicates OR Condition "+isPhoneNumberValidPredicate.or(containsZeroPredicate).test("8139818798"));
        System.out.println("# Chaining Predicates AND Condition "+isPhoneNumberValidPredicate.and(containsZeroPredicate).test("8139818798"));
    }

    static Predicate<String> isPhoneNumberValidPredicate = (phoneNumber) -> phoneNumber.startsWith("8") && phoneNumber.length() == 10;

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("70") && phoneNumber.length() == 10;
    }

    static Predicate<String> containsZeroPredicate = (phoneNumber) -> phoneNumber.contains("0");

    static boolean containsZero(String phoneNumber) {
        return phoneNumber.contains("0");
    }

}
