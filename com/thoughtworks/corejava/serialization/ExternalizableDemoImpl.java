package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/29/15.
 * This class demonstrates the Externalization Implementation
 * Note: Since we have implemented writeExternal for only 2 instance variables
 * only those two will get serialized and de-serialized
 */
public class ExternalizableDemoImpl {
    public static void main(String[] args) throws Exception{
        //Create Object
        ExternalizableDemo externalizableDemo = new ExternalizableDemo(100,20,"Rajat");
        //Serialize Object
        FileOutputStream fos = new FileOutputStream("ExternalizableDemoImpl.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(externalizableDemo);
        //De-Serialize Object
        FileInputStream fis = new FileInputStream("ExternalizableDemoImpl.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizableDemo externalizableObj = (ExternalizableDemo)ois.readObject();
        //Print Object
        System.out.println("De-serialized Object ::");
        System.out.println("numOne :: " +externalizableObj.getNumOne());
        System.out.println("numTwo :: "+externalizableObj.getNumTwo());
        System.out.println("str :: "+externalizableObj.getStr());
    }
}
