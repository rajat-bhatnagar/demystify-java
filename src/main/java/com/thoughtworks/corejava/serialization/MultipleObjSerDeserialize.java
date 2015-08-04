package com.thoughtworks.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by rajatbhatnagar on 6/27/15.
 * demonstrates how multiple objects are serialized and de-serialized
 * Remember that the order matters during de-serialization
 */
public class MultipleObjSerDeserialize {
    public static void main(String[] args) throws Exception {
        //Create objects
        Student student = new Student();
        StaticTransientFinalModifiersDemo staticTransientFinalModifiersDemo = new StaticTransientFinalModifiersDemo();
        //Serialize multiple objects
        FileOutputStream fileOutputStream = new FileOutputStream("MultipleObjSerDeserialize.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.writeObject(staticTransientFinalModifiersDemo);

        FileOutputStream fileOutputStream1 = new FileOutputStream("MultipleObjSerDeserializeONE.ser");
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(fileOutputStream1);
        objectOutputStream1.writeObject(student);
        objectOutputStream1.writeObject(staticTransientFinalModifiersDemo);

        //De-serialize
        FileInputStream fileInputStream = new FileInputStream("MultipleObjSerDeserialize.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        FileInputStream fileInputStream1 = new FileInputStream("MultipleObjSerDeserializeONE.ser");
        ObjectInputStream objectInputStream1 = new ObjectInputStream(fileInputStream1);

        System.out.println("-------- De-serialized objects when ORDER of SERIALIZATION is KNOWN ----------");
        //Let us assume  we know the order, in which objects are serialized
        // In this scenario we do not have any issue in de-serialization
        //This code is making use of the streams objectInputStream and fileOutputStream

        Student deSerFirstObj = (Student) objectInputStream.readObject();
        System.out.println("De-serialized student rollNumber :: " + ((Student) deSerFirstObj).getRollNumber());
        StaticTransientFinalModifiersDemo deSerSecondObj = (StaticTransientFinalModifiersDemo) objectInputStream.readObject();
        System.out.println("De-serialized StaticTransientFinalModifiersDemo varOne :: " + deSerSecondObj.getVarOne());

        System.out.println();
        System.out.println("-------- De-serialized objects when ORDER of SERIALIZATION is UNKNOWN ----------");

        // If We do not know the order of serialization
        // To overcome the above
        //This code is making use of the streams objectInputStream1 and fileOutputStream1
        Object deSerObj = objectInputStream1.readObject();

        if (deSerObj instanceof Student) {
            Student studObj = (Student) deSerObj;
            System.out.println("De-serialized student rollNumber :: " + ((Student) deSerObj).getRollNumber());
        }
        //Read de-serialized Object again
        deSerObj = objectInputStream1.readObject();
        if (deSerObj instanceof StaticTransientFinalModifiersDemo) {
            StaticTransientFinalModifiersDemo derObj = (StaticTransientFinalModifiersDemo) deSerObj;
            System.out.println("De-serialized StaticTransientFinalModifiersDemo varOne :: " + ((StaticTransientFinalModifiersDemo) deSerObj).getVarOne());
        }
    }
}
