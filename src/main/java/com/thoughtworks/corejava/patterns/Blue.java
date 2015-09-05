package com.thoughtworks.corejava.patterns;

/**
 * Created by rajatbhatnagar on 8/17/15.
 */
public class Blue extends Color {
    public Blue() {
        type = "Blue";
    }

    @Override
    void paint() {
        System.out.println("Paint with Blue :: paint()");
    }
}
