package com.thoughtworks.corejava.generics;

import com.thoughtworks.corejava.arrays.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rajatbhatnagar on 12/29/15.
 */
public class PersonArrayList {
    public static void main(String[] args) {
        Person Swenson = new Person(47,"Mike");
        Person Gagan = new Person(45,"Gagan");
        Person Bunny = new Person(40,"Bunny");
        List<Person> persons = new ArrayList<Person>();
        persons.add(Swenson);
        persons.add(Gagan);
        persons.add(Bunny);
        System.out.println("persons = " + persons);
        //OPTION 1 for looping over
        System.out.println("\nOPTION 1 for looping over :: Use ITERATOR");
        Iterator<Person> iterator = persons.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //OPTION 2 for looping over
        System.out.println("\nOPTION 2 for looping over :: USE FOR EACH");
        for(Person person : persons){
            System.out.println("person = " + person);
        }
        //Write a custom Age Comparator to sort based on the Age and then use the Collections.sort method to sort
        Collections.sort(persons,new AgeComparator());
        System.out.println("Sorted Persons Based on Age :: "+persons);
    }
}
