package com.thoughtworks.corejava.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates how we can fetch the custom annotation values
 * The custom annotation @EmployeeDetailsCustomClassLevelAnnotation has already been applied to EmployeeInUS
 */
public class EmployeeInUSImpl_FetchCustomAnnotationInfo {
    public static void main(String[] args) throws Exception {
        EmployeeInUS employeeInUS = new EmployeeInUS("Rita", "Minnesota", 99000, "Spring");
        System.out.println("===================================");
        System.out.println("Employee in US Details");
        System.out.println("===================================");
        System.out.println("Employee Name :: " + employeeInUS.getEmpName());
        System.out.println("Employee Location :: " + employeeInUS.getEmpLOC());
        System.out.println("Employee Salary :: " + employeeInUS.getEmpSal());
        System.out.println("Employee Skill :: " + employeeInUS.getEmpProgrammingSkill());
        System.out.println("===================================");
        System.out.println("Fetching Custom ClassLevel annotation details :: ");
        System.out.println("===================================");
        //Fetch class to which custom annotation is applied
        Class classObj = employeeInUS.getClass();
        //Create Annotation obj
        Annotation annotation = classObj.getAnnotation(EmployeeDetailsCustomClassLevelAnnotation.class);
        //Typecast to EmployeeDetailsCustomClassLevelAnnotation
        EmployeeDetailsCustomClassLevelAnnotation myCustomAnnotationDetails = (EmployeeDetailsCustomClassLevelAnnotation) annotation;
        //Print the details of Custom Annotation
        System.out.println("MyCustomAnnotationDetails are :: ");
        System.out.println("myCustomAnnotationDetails NAME :: " + myCustomAnnotationDetails.employeeName());
        System.out.println("myCustomAnnotationDetails LOCATION :: " + myCustomAnnotationDetails.employeeLocation());
        System.out.println("myCustomAnnotationDetails SALARY :: " + myCustomAnnotationDetails.employeeSalary());
        System.out.println("===================================");
        System.out.println("Fetching Custom MethodLevel annotation details :: ");
        System.out.println("===================================");

        //Get the method on which custom method annotation is applied
        // This can be done using Reflection
        //We already have the class of the method, So pass in the method name as argument
        Method method = classObj.getMethod("getEmpProgrammingSkill");
        //Once we have the method object , fetch the annotation on the method
        Annotation methodAnnotation = method.getAnnotation(EmployeeDetailsCustomMethodLevelAnnotation.class);
        //Typecast Annotation to Custom Method Level Annotation class
        EmployeeDetailsCustomMethodLevelAnnotation obj = (EmployeeDetailsCustomMethodLevelAnnotation) methodAnnotation;
        System.out.println("Custom Method Level Annotation Value :: " + obj.getProgrammingLanguageName());

    }
}
