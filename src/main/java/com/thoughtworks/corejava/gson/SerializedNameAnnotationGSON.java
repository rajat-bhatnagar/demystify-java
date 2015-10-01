package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by rajatbhatnagar on 9/30/15.
 * This program demonstrates how a @SerializedName annotation is used to change the field name
 */
public class SerializedNameAnnotationGSON {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Ikon", 2.2, false);
        Gson gson = new Gson();
        String result = gson.toJson(car);
        System.out.println("result = " + result);
    }
}
