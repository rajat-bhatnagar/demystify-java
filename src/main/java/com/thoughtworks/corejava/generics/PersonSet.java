package com.thoughtworks.corejava.generics;

import com.thoughtworks.corejava.arrays.Person;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by rajatbhatnagar on 12/29/15.
 */
public class PersonSet {
    public static void main(String[] args) {
        Person Swenson = new Person(40,"Mike");
        Person Gagan = new Person(45,"Gagan");
        Person Bunny = new Person(40,"Bunny");

        Set<Person> persons = new HashSet<Person>();
        //Set is a collection with unique elements
        //Even though we have added the same element twice , Set will Just contain the unique element
        //Set will not preserve the order in which the elements were added

        persons.add(Swenson);
        persons.add(Bunny);
        persons.add(Gagan);
        persons.add(Swenson);
        persons.add(Gagan);

        for(Person person : persons){
            System.out.println("Person :: "+person);
        }
    }
}
