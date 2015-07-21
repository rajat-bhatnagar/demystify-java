package com.thoughtworks.corejava.temp;

/**
 * Created by rajatbhatnagar on 7/14/15.
 */
public class SwitchUsingStringClass {
    /*
     * This program illustrates usgae of switch using String class
     * Before Java 7 we could not use String with a switch statement
     */
    public static void main(String[] args) {


        String myString =  "Gagan";
        String string = new String("Bunny");
        /* Note, the API discourages the usage of String constructor
         * as String Object is immutable and this should
         * be only used if you are probably copying a String
         */
        switch (myString){
            case ("Bunny"):
                System.out.println("Amateur Programmer");
                break;
            case ("Gagan"):
                System.out.println("Awesome Programmer");
                break;
            default:
                System.out.printf("i am the default in Switch statement block");
        }

    }
}
