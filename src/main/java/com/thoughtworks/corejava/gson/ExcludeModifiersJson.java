package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;
import java.util.Date;

/**
 * Created by rajatbhatnagar on 9/30/15.
 * This program demonstrates how you can instruct GSON to
 * exclude certain modifiers like protected etc.
 */
public class ExcludeModifiersJson {
    public static void main(String[] args) {
        Product product = new Product(2, "Nexus", new Date(), 654);
        //Amount modifier is protected in Product class
        Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create();
        String result = gson.toJson(product);
        System.out.println("result = " + result);
    }
}
