package com.thoughtworks.corejava.patterns;

/**
 * Created by rajatbhatnagar on 8/17/15.
 * This class demonstrates the Singleton pattern
 */
public class SingletonDemo {
    public static void main(String[] args) {
        //Get an instance of Singleton and invoke print method
        //Note that we have a print on console statement in constructor
        //So if new instances are created , we should be able to see that
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();
        Singleton.getInstance().printSingleton();

    }
}
