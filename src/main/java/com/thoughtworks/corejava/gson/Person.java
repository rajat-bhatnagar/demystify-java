package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 9/30/15.
 */
public class Person {
    private String name;
    private String surname;
    private Car[] cars;
    private int phone;
    private transient int age;

    private Person() {
    }

    public Person(String name, String surname, Car[] cars, int phone, int age) {
        this.name = name;
        this.surname = surname;
        this.cars = cars;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: " + name + " " + surname + " \n ");
        sb.append("Age: " + age + " \n ");
        sb.append("Phone: " + phone + " \n ");
        int i = 0;
        for (Car item : cars) {
            i++;
            sb.append("Car: " + i + ":" + item + " \n ");
        }
        return sb.toString();
    }
}
