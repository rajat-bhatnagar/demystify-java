package com.thoughtworks.corejava.generics.syntax;

public class MyGenericMethod {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70};
        String[] daysOfWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY", "SUNDAY"};
        print(numbers);
        print(daysOfWeek);
    }

    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
