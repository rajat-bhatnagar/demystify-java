package com.thoughtworks.corejava.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        // Imperative Approach
        Customer sara = new Customer("Sara", "789-897-9987");
        greetCustomer(sara);
        // Declarative Approach
        // Consumer Functional Interface
        consumer.accept(sara);
        // Imperative Approach
        showCustomerPhoneConditionally(sara, Boolean.TRUE);
        showCustomerPhoneConditionally(sara, Boolean.FALSE);
        // Declarative Approach using a BiConsumer
        showCustomerPhoneConditionallyBiConsumer.accept(sara, Boolean.TRUE);
        showCustomerPhoneConditionallyBiConsumer.accept(sara, Boolean.FALSE);
    }

    static Consumer<Customer> consumer = customer -> System.out.println("Hello " + customer.name +
            " with phone number - " + customer.phoneNumber);

    static BiConsumer<Customer, Boolean> showCustomerPhoneConditionallyBiConsumer
            = (customer, showCustomerPhone) -> System.out.println("Hello " + customer.name
            + " with Phone Number - " + (showCustomerPhone ? customer.phoneNumber : "**********")
    );

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + " with phone number - " + customer.phoneNumber);
    }

    static void showCustomerPhoneConditionally(Customer customer, boolean showCustomerPhone) {
        System.out.println("Hello " + customer.name + " with phone - "
                + (showCustomerPhone ? customer.phoneNumber : "************"));
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
