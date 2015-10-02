package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by rajatbhatnagar on 10/1/15.
 * This program demonstrates serialization and de-serialization using GSON
 */
public class BagOfPrimitives {
    private int num;
    private String name;
    private boolean hot;

    private BagOfPrimitives() {
    }

    public BagOfPrimitives(int num, String name, boolean hot) {
        this.num = num;
        this.name = name;
        this.hot = hot;
    }

    @Override
    public String toString() {
        return "BagOfPrimitives{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", hot=" + hot +
                '}';
    }

    public static void main(String[] args) {
        BagOfPrimitives bagOfPrimitives = new BagOfPrimitives(1, "Rambo", true);
        Gson gson = gson = new GsonBuilder().setPrettyPrinting().create();
        String JSON = gson.toJson(bagOfPrimitives);
        System.out.println("JSON = " + JSON);
        //De-serializing to Object
        BagOfPrimitives bagOfPrimitivesObj = gson.fromJson(JSON, BagOfPrimitives.class);
        System.out.println(bagOfPrimitivesObj);
    }
}
