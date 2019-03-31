package com.thoughtworks.corejava.generics;

public class CreateGenericPerson {
    public static void main(String[] args) {
        Person<Contact> personOne = new Person<>();
        Person<Employee> personTwo = new Person<>();

        Contact contact = new Contact("Shakira", "Jamsie",
                "Mrs", "212-897-9089");

        Employee employee = new Employee("Hugh", "Jackman", "21");


        personOne.setPerson(contact);
        personTwo.setPerson(employee);
        System.out.println("Person One "+personOne.getPerson());
        System.out.println("Person Two "+personTwo.getPerson());

    }
}
