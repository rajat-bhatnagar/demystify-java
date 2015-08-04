package com.thoughtworks.corejava.serialization;

import java.io.*;

/**
 * Created by rajatbhatnagar on 6/27/15.
 * This class demonstrates that when a object is serialized, all objects that can be reached
 * from the serialized object are automatically serialized. This group of objects is called
 * the Object graphs in Serialization
 */
public class ObjectGraphSerDemo {
    public static void main(String[] args) throws Exception {
        //create object
        Animal animalObj = new Animal();
        //serialize object
        FileOutputStream fos = new FileOutputStream("ObjectGraphSerDemo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(animalObj);
        //de-serialize object
        FileInputStream fis = new FileInputStream("ObjectGraphSerDemo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Animal animObj = (Animal) ois.readObject();
        System.out.println("De-serialized Object graph object :: " + animObj.b.dog.cat.rat.getRatAge());

    }
}

class Animal implements Serializable {
    Bear b = new Bear();
}

class Bear implements Serializable {
    Dog dog = new Dog();
}

class Dog implements Serializable {
    Cat cat = new Cat();
}

class Cat implements Serializable {
    Rat rat = new Rat();
}

class Rat implements Serializable {
    private int ratAge = 9;

    public int getRatAge() {
        return ratAge;
    }

}
