package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/27/15.
 */
public class StaticTransientFinalModifiersDemoImpl {
    public static void main(String[] args) throws Exception {

        //Create an object of StaticTransientFinalModifiersDemo class
        StaticTransientFinalModifiersDemo staticTransientFinalModifiersDemo = new StaticTransientFinalModifiersDemo();
        //Serialize Class
        FileOutputStream fos = new FileOutputStream("StaticTransientFinalModifiersDemo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(staticTransientFinalModifiersDemo);

        //Deserialize class
        FileInputStream fis = new FileInputStream("StaticTransientFinalModifiersDemo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Typecast the deserialized object to StaticTransientFinalModifiersDemo
        StaticTransientFinalModifiersDemo myDeserializedObj = (StaticTransientFinalModifiersDemo) ois.readObject();

        //Print int, transient, static and final modifier combination of values to illustrate concepts
        System.out.println("varOne :: " + myDeserializedObj.getVarOne()); //10
        System.out.println("varTwo :: " + myDeserializedObj.getVarTwo()); //0
        System.out.println("varThree :: " + myDeserializedObj.getVarThree()); //89
        System.out.println("varFour :: " + myDeserializedObj.getVarFour()); //65
        System.out.println("varFive :: " + myDeserializedObj.getVarFive()); //33
        System.out.println("varSix :: " + myDeserializedObj.getVarSix()); //90
        System.out.println("varSeven :: " + myDeserializedObj.getVarSeven()); //24
    }
}
