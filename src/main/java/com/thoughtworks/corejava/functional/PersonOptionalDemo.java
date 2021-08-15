package com.thoughtworks.corejava.functional;

public class PersonOptionalDemo {
    public static void main(String[] args) {
        Person person = new Person("Sara", null);

        // update email to lower case
        String email = person.getEmail().map(String::toUpperCase).orElse(" e mail not provided");

        // If e mail in Data Object Person is not wrapped by Optional.ofNullable we can
        // get a NPE while transforming that data
        System.out.println(" Physio from Italy without Optional " + person.getName() + " - " + email);
    }
}
