package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/23/15.
 * This class demonstrates custom implementation of Default sorting for Employee class
 */
public class Employee implements Comparable {
    private String name;
    private int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                '}';
    }

    //Custom implementation of default sorting
    public int compareTo(Object object) {
        int empId1 = this.employeeID;
        Employee employee = (Employee) object;
        int empId2 = employee.employeeID;
        if (empId1 < empId2)
            return -1;
        else if (empId1 > empId2)
            return 1;
        else
            return 0;
    }


    public String getName() {
        return name;
    }
}
