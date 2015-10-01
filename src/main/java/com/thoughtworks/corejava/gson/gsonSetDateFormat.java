package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * Created by rajatbhatnagar on 9/30/15.
 * This program demonstrates how to specify date formats in JSON objects using JSON
 */
public class gsonSetDateFormat {
    public gsonSetDateFormat() {
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Playstation", new Date(), 499.99);
        Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
        String result = gson.toJson(product);
        System.out.println("result = " + result);
    }
}
