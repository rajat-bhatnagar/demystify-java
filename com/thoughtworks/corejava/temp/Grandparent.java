package com.thoughtworks.corejava.temp;

/**
 * Created by rajatbhatnagar on 7/4/15.
 */
public class Grandparent {
    public void Print() {
        System.out.println("Grandparent's Print()");
    }
}

class Parent extends Grandparent {
    public void Print() {
        System.out.println("Parent's Print()");
    }
}

class Child extends Parent {
    public void Print() {
        super.Print();  // Trying to access Grandparent's Print()
        System.out.println("Child's Print()");
    }
}
 class ImplInheritanceTree {
    public static void main(String[] args) {
        Grandparent c = new Child();
        c.Print();
    }
}