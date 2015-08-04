package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * This is the receiver which de-serializes
 */
public class Receiver_DeSerializeSerialVersionUIDDemo {
    public static void main(String[] args) throws Exception {
        //Deserialize Object
        FileInputStream fis = new FileInputStream("SerialVersionUIDDemo.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Read de-serialized Object
        SerialVersionUIDDemo versionIDObj = (SerialVersionUIDDemo) ois.readObject();
        System.out.println("versionIDObj = " + versionIDObj.getNumOne());
    }
}
