package com.thoughtworks.corejava.patterns;

/**
 * Created by rajatbhatnagar on 8/17/15.
 * This program demonstrates the singleton pattern
 * Singleton pattern is a design solution , when an application wants to have one and
 * only one instance of a class in all possible scenarios without any exceptional conditions
 */
public class EagerSingleton {
    private static volatile EagerSingleton instance = null;

    //Create private constructor
    private EagerSingleton() {

    }
    //At start up the instance is created itself.
    //Drawback is that instance is created whether or not it is required or not

    //Create the method that returns an instance of Singleton
    public static EagerSingleton getInstance() {
        if (instance == null) {
            //synchronize the creation of the Singleton
            synchronized (EagerSingleton.class) {
                //Create an instance
                instance = new EagerSingleton();
            }
        }
        return instance;
    }


}
