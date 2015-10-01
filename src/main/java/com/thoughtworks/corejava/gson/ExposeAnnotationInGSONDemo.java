package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by rajatbhatnagar on 9/30/15.
 * This program demonstrates how @Expose annotation can be used to
 * exclude a field which has not been annotated with the @Expose annotation
 */
public class ExposeAnnotationInGSONDemo {
    private ExposeAnnotationInGSONDemo() {
    }

    public static void main(String[] args) {
        School school = new School(10, 19, "Methodist Civil Lines", "Blue");
        //Exclude the fields that have not been annotated with the @Expose annotation
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String result = gson.toJson(school);
        System.out.println("result = " + result);
    }
}
