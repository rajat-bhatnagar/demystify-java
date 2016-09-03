package com.thoughtworks.corejava.oop.abstraction;

public abstract class AbstractBL {

     boolean executeAdd(){
         boolean isAddSuccessful = false;
         return isAddSuccessful;
     }

     boolean executeUpdate(){
         boolean isUpdateSuccessful = false;
         return  isUpdateSuccessful;
     }

    abstract void validateInternal();
}
