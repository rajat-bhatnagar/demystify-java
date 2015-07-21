package com.thoughtworks.corejava.collections;

import com.thoughtworks.corejava.temp.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by rajatbhatnagar on 6/23/15.
 */
public class CollectionSortExample  {
    public static void main(String[] args) {
        List<Student> lt = new ArrayList<Student>();
        lt.add(new Student("Rajat",3));
        lt.add(new Student("Gagan",1));
        lt.add(new Student("Amit",2));
        System.out.println(" Student List :: " + lt);
        Collections.sort(lt);
        System.out.println(" Sorted Student List based on Roll Number :: " + lt);
        Collections.sort(lt, new StudentNameComparator());
        System.out.println(" Sorted Student List based on Name:: " + lt);
    }
}

class StudentNameComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}