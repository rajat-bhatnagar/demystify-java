package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;

/**
 * Created by rajatbhatnagar on 9/30/15.
 */
public class CreatePersonCarJSON {
    /*
     * This class demonstrates how a JSON is created using GSON
     */
    public static void main(String[] args) {
        Gson gson = new Gson();
        Car carOne = new Car("Maruti", "Van", 1.8, true);
        Car carTwo = new Car("Hyundai", "Santro", 1.9, true);
        Car[] cars = {carOne, carTwo};
        Person somePerson = new Person("Rocky", "Balboa", cars, 98756455, 72);
        //Serialize JSON
        String outputJSON = gson.toJson(somePerson);
        System.out.println(outputJSON);
        //De-serializing a JSON
        String json =
                "{\"name\":\"John\",\"surname\":\"Doe\",\"cars\": [{\"manufacturer\":\"Audi\",\"model\":\"A4\",\"capacity\":1.8,\"accident\":false}, {\"manufacturer\":\"Škoda\",\"model\":\"Octavia\",\"capacity\":2.0,\"accident\":true}],\"phone\":245987453}";
        Person johnDoe = gson.fromJson(json, Person.class);
        System.out.println(johnDoe.toString());
    }
}
