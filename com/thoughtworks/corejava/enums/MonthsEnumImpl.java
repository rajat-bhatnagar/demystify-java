package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * This class demonstrates how enumerated type objects are created
 */
public class MonthsEnumImpl {
    public static void main(String[] args) {
        //All fields of enums are private static final by default . hence we declare them by the way shown below
        Months months = Months.JAN;
        // When we try to print an enum value, it calls toString() method of enum be default
        System.out.println("Months enum :: "+months);
        //print all the constant values in Months Enum
        for(Months month : Months.values()){
            System.out.println("month = " + month);
        }

    }
}
