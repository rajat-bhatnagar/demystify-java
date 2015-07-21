package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * The program demonstrates de-serialization of a serializable child class
 * with a no-Serializable parent
 */
public class ChildSerializableImpl {
    public static void main(String[] args) throws Exception{
        //Create Object
        ChildSerializable childSerializable = new ChildSerializable(12);
        childSerializable.setParentNum(1001);
        childSerializable.setChildNumber(2001);
        //Serialize Object
        FileOutputStream fos = new FileOutputStream("ChildSerializableImpl.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(childSerializable);

        //de-Serialize Object
        FileInputStream fileInputStream = new FileInputStream("ChildSerializableImpl.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ChildSerializable childSerializableObj = (ChildSerializable)objectInputStream.readObject();

        //print values of parent and child objects instance variables
        System.out.println("Parent not Serializable :: parentNum - "+childSerializableObj.getParentNum());
        System.out.println("Child Serializable :: childNumber - "+childSerializableObj.getChildNumber());

    }
}
