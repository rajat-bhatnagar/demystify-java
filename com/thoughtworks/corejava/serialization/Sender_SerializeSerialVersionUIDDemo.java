package com.thoughtworks.corejava.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/30/15.
 */
public class Sender_SerializeSerialVersionUIDDemo {
    public static void main(String[] args) throws Exception {
        //Create Object
        SerialVersionUIDDemo serialVersionUIDDemo = new SerialVersionUIDDemo();
        //Serialize
        FileOutputStream fos = new FileOutputStream("SerialVersionUIDDemo.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //Write serialized object to Stream
        oos.writeObject(serialVersionUIDDemo);

    }
}
