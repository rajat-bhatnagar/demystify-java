package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/24/15.
 * Demonstrates how an object(Student in this class can be
 * serialized and de-serialized
 */
public class SerializeDeserializeStudent {
    public static void main(String[] args) throws Exception{
        Student student = new Student();
        //Serialization of Student Object
        FileOutputStream fos = new FileOutputStream("StudentSerialized.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(student);
        System.out.println(" Student is serialized " );
        //De-Serialization of Student Object
        FileInputStream fis = new FileInputStream("StudentSerialized.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Student studentObj = (Student)ois.readObject();
        System.out.println(" Student is de-serialized and student rollNumber is :: "+studentObj.rollNumber );
    }

}
