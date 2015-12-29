package com.thoughtworks.corejava.arrays;

import java.util.Arrays;

/**
 * Created by rajatbhatnagar on 12/29/15.
 */
public class PersonArrayProblem {
    public static void main(String[] args) {
        Person Gagan = new Person(45,"Gagan");
        Person Bunny = new Person(40,"Bunny");
        Person[] persons = { Gagan , Bunny};
        //PROBLEM 1  : We cannot directly print the Arrays object even though we have a toString() implementation
        // There is no easy toString() Implementation
        System.out.println("persons = " + Arrays.toString(persons));
        //PROBLEM 2 : We cannot insert a new person in the persons array , To do it we have to copy and create a new array
        //NOTE : The length of an array is immutable in JAVA. You cannot change the size of an array once you have created it
        Person Rajat = new Person(20, "Rajat");
      /*
        persons[2] = Rajat;
        System.out.println("persons = " + Arrays.toString(persons));*/

        //If we try to do the above way we will get a java.lang.ArrayIndexOutOfBoundsException: 2
        persons = add(persons,Rajat);
        System.out.println("persons = " + Arrays.toString(persons));

    }

    private static Person[] add(Person[] persons, Person person) {
        persons = Arrays.copyOf(persons , persons.length+1);
        persons[persons.length-1]=person;
        return persons;
    }


}
