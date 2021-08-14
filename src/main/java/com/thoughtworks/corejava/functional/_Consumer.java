package com.thoughtworks.corejava.functional;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Imperative Approach
        Customer sara = new Customer("Sara", "789-897-9987");
        greetCustomer(sara);

        // Declarative Approach
        Consumer<Customer> consumer = customer -> System.out.println("Hello " + customer.name +
                " with phone number - " + customer.phoneNumber);

        // Consumer Functional Interface
        consumer.accept(sara);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + " with phone number - " + customer.phoneNumber);
    }

    static class Customer {
        private final String name;
        private final String phoneNumber;

        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }

}
