package com.thoughtworks.corejava.generics;

import com.thoughtworks.corejava.arrays.Person;

import java.util.Comparator;

/**
 * Created by rajatbhatnagar on 12/30/15.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person leftPerson, Person rightPerson) {
        return Integer.compare(leftPerson.getAge(),rightPerson.getAge());
    }
}
