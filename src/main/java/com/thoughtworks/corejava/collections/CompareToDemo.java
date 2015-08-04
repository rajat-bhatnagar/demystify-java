package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/21/15.
 * Demonstration of how Comparable does the comparing using default sorting order
 */
public class CompareToDemo {
    public static void main(String[] args) {
        System.out.println("\"A\".compareTo(\"B\") :: " + "A".compareTo("B"));
        System.out.println("\"Z\".compareTo(\"B\"):: " + "Z".compareTo("B"));
        System.out.println("\"R\".compareTo(\"R\") :: " + "R".compareTo("R"));
    }
}
