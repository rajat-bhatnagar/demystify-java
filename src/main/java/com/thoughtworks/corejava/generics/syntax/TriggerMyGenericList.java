package com.thoughtworks.corejava.generics.syntax;

public class TriggerMyGenericList {
    public static void main(String[] args) {
        MyGenericList<String> genericList = new MyGenericList<>();
        genericList.assign("Sky is the limit");
    }
}
