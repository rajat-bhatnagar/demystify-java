package com.thoughtworks.corejava.annotation;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates the @Deprecated Annotation
 */
public class DeprecatedAnnotationDemo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //Fetch Employee location using a Deprecated Method
        //A warning will be displayed  by the compiler that the method is Deprecated
        employee.getEmpLocation();
    }
}

class Employee {
    @Deprecated
    public void getEmpLocation() {
        System.out.println("Employee location is Hyderabad, India");
    }

    public void getEmpGeographicalLocation() {
        System.out.println("Employee location is New York, US");
    }
}
