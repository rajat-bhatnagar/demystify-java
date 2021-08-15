package com.thoughtworks.corejava.functional.combinator.pattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidation {
    public static void main(String[] args) {
        Customer bret = new Customer(
                "Bret", "bret@optum.com", "7023438789", LocalDate.ofYearDay(1982, 01)
        );

        Customer zet = new Customer(
                "ZET", "zetoptum.com", "702343878", LocalDate.ofYearDay(1982, 01)
        );

        System.out.println(" Is Valid Customer - " + isValidCustomer(bret));
        System.out.println(" Is Valid Customer - " + isValidCustomer(zet));
        // Is Valid Customer just tells us if the customer is valid or not
        // However it does not tell us that what is wrong with the invalid customer
        // akka if the e mail was incorrect or was it the phone number
        // Look at CustomerRegistration and how it solves this using combinator pattern
    }

    public static boolean isValidCustomer(Customer customer) {
        return isValidEmail(customer.getEmail())
                && isValidDob(customer.getDob())
                && isValidPhoneNumber(customer.getPhoneNumber());
    }

    static boolean isValidEmail(String email) {
        return email.contains("@");
    }

    static boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.startsWith("70") && phoneNumber.length() == 10;
    }

    static boolean isValidDob(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 18;
    }


}
