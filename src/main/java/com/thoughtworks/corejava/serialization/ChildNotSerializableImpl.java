package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/28/15.
 * Implementation of ChildNotSerializable
 */
public class ChildNotSerializableImpl {
    public static void main(String[] args) throws Exception {
        //Create Object
        ChildNotSerializable childObj = new ChildNotSerializable();
        //Serialize
        FileOutputStream fos = new FileOutputStream("ChildNotSerializable.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(childObj);

        //de-serialize child object and fetch parent and child variables
        FileInputStream fis = new FileInputStream("ChildNotSerializable.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();

        if (obj instanceof ChildNotSerializable) {
            ChildNotSerializable chldObj = (ChildNotSerializable) obj;
            System.out.println("Child not serializable :: " + chldObj.getChildString() +
                    "  // Parent Serializable - :: " + childObj.getParentString());
        }
    }
}
