package com.thoughtworks.corejava.patterns;

/**
 * Created by rajatbhatnagar on 8/17/15.
 * This class demonstrates the singleton pattern
 */
public class Singleton {

    private Singleton() {
        System.out.println("Creating new instance");
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }


}
