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
/*
 * We are putting default values to members of Custom Annotation
 * If no Values are passed for our Custom Annotation while applying it to a class
 * the default values would be picked up
 */
public @interface EmployeeDetailsCustomAnnotation {
    String employeeName() default "EMPTY_EMP_NAME";

    String employeeLocation() default "USA";

    int employeeSalary() default 100000;

}
