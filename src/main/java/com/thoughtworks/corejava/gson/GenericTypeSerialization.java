package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by rajatbhatnagar on 10/3/15.
 * <p/>
 * This program demonstrates how to use TypeToken class to serialize and de-serialize
 * classes with generic types
 */
public class GenericTypeSerialization {
    public static void main(String[] args) {
        Dog dog = new Dog("I am a dog");
        // Create an animal which is of type dog
        Animal<Dog> animal = new Animal<Dog>();
        animal.setAnimal(dog);

        Gson gson = new Gson();
        //Define a Type that is a Animal of Type Dog
        Type animalType = new TypeToken<Animal<Dog>>() {
        }.getType();

        // we first convert the animal object to a json and then read the json
        // back. However we define the json to be of Animal type
        Animal animal1 = gson.fromJson(gson.toJson(animal, animalType), Animal.class);
        System.out.println(animal1.getAnimal().getClass()); // prints class
        // com.google.gson.internal.LinkedTreeMap

        // In contrast to above where we read the json back using the Animal
        // type, here we read the json back as the custom animalType Type. This
        // gives Gson an idea of what
        // the generic type should be.

        Animal animal2 = gson.fromJson(gson.toJson(animal), animalType);
        System.out.println(animal2.getAnimal().getClass());

    }
}
