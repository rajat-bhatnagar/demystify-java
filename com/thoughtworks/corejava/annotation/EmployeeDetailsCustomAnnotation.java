package com.thoughtworks.corejava.annotation;

import java.lang.annotation.*;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates how a custom annotation is declared
 */
@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeDetailsCustomAnnotation {
    public String employeeName();

    public String employeeLocation();

    public int employeeSalary();

}
