package com.thoughtworks.corejava.gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by rajatbhatnagar on 9/30/15.
 * This program demonstrates how a GSON Field naming policy can be applied
 */
public class CustomNamingPolicy {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "Sonata", 2.6, false);
        //Creating output fields of JSON in UPPER CAMEL CASE by enforcing a Field Naming Policy
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        String result = gson.toJson(car);
        System.out.println("result = " + result);
    }
}
