package com.thoughtworks.corejava.annotation;

import java.util.ArrayList;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates @SuppressWarnings("unchecked") implementation
 * This annotation is used for suppressing the compile time warnings
 * To demonstrate this we will declare a method which returns an ArrayList which
 * is not explicitly typecast using Generics
 */
public class SuppressWarningsAnnotationDemo {
    public static void main(String[] args) {
        BankCustomer bankCustomer = new BankCustomer();
        System.out.println(bankCustomer.getCustomerDetails());
    }
}

class BankCustomer {
    @SuppressWarnings("unchecked")
    public ArrayList getCustomerDetails() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Rajat Bhatnagar");
        arrayList.add("T D Bank");
        arrayList.add("New YORK");
        return arrayList;
    }
}