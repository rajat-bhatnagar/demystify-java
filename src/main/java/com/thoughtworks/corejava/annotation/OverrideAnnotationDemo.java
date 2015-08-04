package com.thoughtworks.corejava.annotation;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates how an @OverrideAnnotation checks if the method is overridden properly
 */
public class OverrideAnnotationDemo {
    public static void main(String[] args) {
        DatabaseDriver databaseDriver = new DatabaseDriverChild();
        databaseDriver.databaseDriverType();
    }
}

class DatabaseDriver {
    public void databaseDriverType() {
        System.out.println("Superclass method databaseDriverType()");
    }
}

class DatabaseDriverChild extends DatabaseDriver {
    /*
     * The @Override annotation on subclass method checks if the super type
     * method of class is overridden properly
     */
    @Override
    public void databaseDriverType() {
        System.out.println("Overriding - Superclass method databaseDriverType()");
    }
}