package com.thoughtworks.corejava.collections;

import java.util.TreeSet;

/**
 * Created by rajatbhatnagar on 6/23/15.
 * Demonstrates Default sorting by Comparable and custom sorting using Comparator
 */
public class EmployeesDefaultSortCustomSort {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rajat", 1000);
        Employee emp2 = new Employee("Gagan", 1001);
        Employee emp3 = new Employee("Bunny", 2001);
        Employee emp4 = new Employee("Krishan", 3001);
        Employee emp5 = new Employee("Ambuj", 4001);
        Employee emp6 = new Employee("Rajat", 1000);
        TreeSet treeSet = new TreeSet();
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        treeSet.add(emp6);
        System.out.println("Employee list in default order aka using Comparable(I) :: "+treeSet);
        TreeSet treeSet2 = new TreeSet(new EmployeeComparator());
        treeSet2.add(emp1);
        treeSet2.add(emp2);
        treeSet2.add(emp3);
        treeSet2.add(emp4);
        treeSet2.add(emp5);
        treeSet2.add(emp6);
        System.out.println("Employee list in custom order aka using Comparator(I) :: "+treeSet2);

        System.out.println("Modified");

    }
}
