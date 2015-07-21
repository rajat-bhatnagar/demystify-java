package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * Demonstrates how the same method can be overridden in an enum
 * using a inner class
 */
public enum EnumInnerClass {
    WHITE , RED {
        public void info(){
            System.out.println("Dangerous Color");
        }
    }, GREEN , BLUE;
    public void info(){
        System.out.println("Universal Color");
    }
}
