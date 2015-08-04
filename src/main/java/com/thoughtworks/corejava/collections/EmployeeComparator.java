package com.thoughtworks.corejava.collections;

import java.util.Comparator;

/**
 * Created by rajatbhatnagar on 6/23/15.
 */
public class EmployeeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;
        String str1 = employee1.getName();
        String str2 = employee2.getName();
        return str1.compareTo(str2);
    }
}
