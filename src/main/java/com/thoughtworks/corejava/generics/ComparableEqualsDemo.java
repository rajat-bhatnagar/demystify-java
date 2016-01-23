package com.thoughtworks.corejava.generics;

public class ComparableEqualsDemo  {
    public static void main(String[] args) {
        String one = "The Empire";
        String two = "The Empire";
        Integer num1 = 124;
        Integer num2 = 675;
        /*
        * Two objects equal if they compare the same i,e
        * x.equals(y) returns true if and only if x.compareTo(y) == 0
         */
        System.out.println("one.equals(two) :: "+one.equals(two)); //true
        assert  one.equals(two);
        System.out.println("one.compareTo(two) : "+one.compareTo(two)); //0
        assert one.compareTo(two) == 0;
        assert !num1.equals(num2);
        assert num1.compareTo(num2) < 0;
        System.out.println(one.hashCode());
        System.out.println(two.hashCode());
        System.out.println(num1.hashCode());
        System.out.println(num2.hashCode());
    }
}
