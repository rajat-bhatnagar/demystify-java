package com.thoughtworks.corejava.generics

import groovy.transform.CompileStatic

@CompileStatic
class Contact {
    String firstName
    String lastName
    String salutation
    String phoneNumber

    Contact(String firstName, String lastName, String salutation, String phoneNumber) {
        this.firstName = firstName
        this.lastName = lastName
        this.salutation = salutation
        this.phoneNumber = phoneNumber
    }


    @Override
    String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salutation='" + salutation + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}'
    }
}
