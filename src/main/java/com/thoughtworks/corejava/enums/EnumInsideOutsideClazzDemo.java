package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * This program demonstrates that an enum can be declared inside and outside of class
 * Remember enum cannot be declared inside a method
 * If an ENUM is declared inside a method we would get a RUNTIME EXCEPTION
 */
enum Country {
    India, USA, UK, Canada
}

public class EnumInsideOutsideClazzDemo {
    enum Days {
        MON, TUE, WED, THURS, FRI, SAT, SUN
    }

    public static void main(String[] args) {
        System.out.println("Enum outside class = " + Country.UK);
        System.out.println("Enum Inside class = " + Days.THURS);
    }
}
