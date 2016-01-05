package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 * Class which demonstrates that subtyping is transitive
 */
public class SubtypingDemo {
    //Subtyping is transitive
    //i.e if first is the subtype of second and second is the subtype of third
    //Then first is the subtype of third
    //Alternatively Third is the supertype of first
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("Something");
        System.out.println(c);
    }
}
