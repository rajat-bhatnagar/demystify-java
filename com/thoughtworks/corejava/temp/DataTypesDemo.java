package com.thoughtworks.corejava.temp;

/**
 * Created by rajatbhatnagar on 7/14/15.
 */
public class DataTypesDemo {
    /*
     * This class demonstrates the datatypes primitive and wrapper classes in Java
     */
    public static void main(String[] args) {

        //Primitive Types
        byte b = 10;
        short s = 10;
        int i = 10;
        double d = 10.1;
        float f = 10.2f;
        long l = 10L;
        char c = 'a';
        boolean bool = true;

        //Java class
        Byte myByte = new Byte(b);
        Short myShort = new Short(s);
        Integer myInteger = Integer.valueOf(i);
        Double myDouble = new Double(d);
        Float myFloat = new Float(f);
        Long myLong = new Long(l);
        Character myCharacter = new Character(c);
        Boolean myBoolean = new Boolean(bool);

        System.out.println("Printing datatypes " +myByte + " " +" " +myShort +
                 " " +myInteger+  " " +myDouble + " " +myFloat + " " +myLong+ " " +
                myCharacter+  " " +myBoolean);

    }
}
