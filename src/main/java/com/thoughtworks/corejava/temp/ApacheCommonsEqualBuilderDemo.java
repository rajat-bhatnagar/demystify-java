package com.thoughtworks.corejava.temp;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by rajatbhatnagar on 1/23/16.
 */
@SuppressWarnings("unchecked")
public class ApacheCommonsEqualBuilderDemo {
    private int age;
    private String name;

    private ApacheCommonsEqualBuilderDemo(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Use Apache commons EqualsBuilder for overriding equals
    public boolean equals(Object object) {
        return object instanceof ApacheCommonsEqualBuilderDemo && EqualsBuilder.reflectionEquals(this, object);
    }

    //Use Apache commons HashCodeBuilder for overriding hashcode
    public int hashCode(){
        return HashCodeBuilder.reflectionHashCode(this);
    }

    public static void main(String[] args) {
        ApacheCommonsEqualBuilderDemo obj1 = new ApacheCommonsEqualBuilderDemo(12,"Gagan");
        ApacheCommonsEqualBuilderDemo obj2 = new ApacheCommonsEqualBuilderDemo(12,"Gagan");
        assert  obj1.equals(obj2);
        //checking if hashcode are equal
        assert obj1.hashCode() == obj2.hashCode();
        System.out.println("obj1.hashCode() : "+obj1.hashCode());
        System.out.println("obj2.hashCode() : "+obj2.hashCode());
    }
}
