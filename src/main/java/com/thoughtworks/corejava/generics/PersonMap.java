package com.thoughtworks.corejava.generics;

import com.thoughtworks.corejava.arrays.Person;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by rajatbhatnagar on 12/29/15.
 */
public class PersonMap {
    public static void main(String[] args) {
        Person Swenson = new Person(40,"Mike");
        Person Gagan = new Person(45,"Gagan");
        Person Bunny = new Person(40,"Bunny");

        Map<String , Person > persons = new HashMap<String , Person>();
        persons.put(Swenson.getName(),Swenson);
        persons.put(Gagan.getName(),Gagan);
        persons.put(Bunny.getName(),Bunny);

        //We have Key and Value in a MAP. There are three ways to iterate i.e Get the Keys , get the Values and Get Both Keys/Values
        System.out.println("Iterate by Fetching Keys");
        for(String key : persons.keySet()){
            System.out.println("Key :: "+key);
        }
        System.out.println("\nIterate by fetching values ");
        for(Person person : persons.values()){
            System.out.println("Value :: "+person);
        }
        System.out.println("\nIterate by fetching both Keys/Values");
        for(Map.Entry<String , Person > entry  :  persons.entrySet()){
            System.out.println("Entry :: "+entry);
            System.out.println("Key   :: "+entry.getKey());
            System.out.println("Value :: "+entry.getValue());
            System.out.println("\n");
        }
    }
}
