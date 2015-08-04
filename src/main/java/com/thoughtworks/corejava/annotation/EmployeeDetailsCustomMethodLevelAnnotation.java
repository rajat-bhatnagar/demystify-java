package com.thoughtworks.corejava.annotation;

import java.lang.annotation.*;

/**
 * Created by rajatbhatnagar on 7/26/15.
 * This class demonstrates a custom method level annotation
 * ElementType is a METHOD, So this is a class level annotation
 */
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EmployeeDetailsCustomMethodLevelAnnotation {
    String getProgrammingLanguageName() default "Java";
}
