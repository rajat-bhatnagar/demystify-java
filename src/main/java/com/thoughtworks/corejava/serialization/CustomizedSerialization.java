package com.thoughtworks.corejava.serialization;

import java.io.*;

/**
 * Created by rajatbhatnagar on 6/27/15.
 * This program demonstrates Custom Serialization
 * To implement Customized Serialization , we need to use 2 callback methods
 * private void writeObject(ObjectOutputStream oos) throws Exception
 * private void readObject(ObjectInputStream ois) throws Exception
 */
public class CustomizedSerialization {
    public static void main(String[] args) throws Exception {
        //Create Object
        Account account = new Account();
        System.out.println("Before serialization - " + "Username :: " + account.getUsername()
                + " and Password :: " + account.getPassword() + " atmPIN :: " + account.getAtmPIN());
        //Serialize Object
        FileOutputStream fos = new FileOutputStream("Account.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(account);
        //De-serialize Object
        FileInputStream fis = new FileInputStream("Account.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //Typecasting de-serialized object to Account Object
        Account deSerObj = (Account) ois.readObject();
        System.out.println("After serialization - " + "Username :: " + deSerObj.getUsername()
                + " and Password :: " + deSerObj.getPassword() + " atmPIN :: " + deSerObj.getAtmPIN());
    }
}

class Account implements Serializable {
    private String username = "Rambo";
    //password is secure information, so it should not be de-serialized
    private transient String password = "JenniferLopez";
    private transient int atmPIN = 3001;

    public int getAtmPIN() {
        return atmPIN;
    }

    public void setAtmPIN(int atmPIN) {
        this.atmPIN = atmPIN;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    //Implement methods so that JVM knows that this is Customized Serialization

    private void writeObject(ObjectOutputStream oos) throws Exception {
        //Tell JVM to do Default serialization
        oos.defaultWriteObject();
        //Encrypt password
        String encrpytedPassword = "123" + getPassword();
        int encryptedPIN = 1000 + getAtmPIN();
        oos.writeObject(encrpytedPassword);
        oos.writeInt(encryptedPIN);
    }

    private void readObject(ObjectInputStream ois) throws Exception {
        //Tell JVM to do default de-Serialization
        ois.defaultReadObject();
        //Decrypt password
        String decryptPassword = (String) ois.readObject();
        String password = decryptPassword.substring(3);
        int decryptPIN = ois.readInt();
        int atmPIN = decryptPIN - 1000;
        //Set the password to decrypted password
        setPassword(password);
        setAtmPIN(atmPIN);
    }

}
