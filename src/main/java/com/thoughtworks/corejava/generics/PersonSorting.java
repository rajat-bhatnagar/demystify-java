package com.thoughtworks.corejava.generics;

import com.thoughtworks.corejava.arrays.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rajatbhatnagar on 12/30/15.
 */
public class PersonSorting {
    public static void main(String[] args) {
        Person Swenson = new Person(19,"Mike");
        Person Gagan = new Person(25,"Gagan");
        Person Bunny = new Person(22,"Bunny");
        List<Person> persons = new ArrayList<Person>();
        persons.add(Swenson);
        persons.add(Gagan);
        persons.add(Bunny);

        //A generic method that takes in a list of persons and returns the youngest person
        Person youngestPerson = (Person) min(persons , new AgeComparator());
        System.out.println("YoungestPerson :: "+youngestPerson);
    }

    private static <T> T min(List<T> persons, Comparator<T> comparator) {
        if(persons.isEmpty()){
            throw new IllegalArgumentException("List is Empty , Cannot find youngest person in persons list ");
        }
        T youngestPerson = persons.get(0);
        for(int counter=1 ; counter<persons.size();counter++){
            T element = persons.get(counter);
            if(comparator.compare(youngestPerson, element)>0){
                youngestPerson = element;
            }
        }
        return youngestPerson;
    }
}
