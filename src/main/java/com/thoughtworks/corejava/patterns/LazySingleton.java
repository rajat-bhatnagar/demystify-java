package com.thoughtworks.corejava.patterns;

/**
 * Created by rajatbhatnagar on 8/17/15.
 * This class demonstrates the Singleton Pattern
 * Lazy Initialization is the tactic of delaying the creation of an object
 */
public class LazySingleton {
    private static volatile LazySingleton instance = null;

    //Create private constructor
    private LazySingleton() {
    }

    //Create getInstance method which returns an instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
