package com.thoughtworks.corejava.generics.syntax;

public class MyGenericMethod {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 60, 70};
        String[] daysOfWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY", "SUNDAY"};
        print(numbers);
        print(daysOfWeek);
        System.out.println(" Number of elements greater than 30 : "+countGreaterThan(numbers, 30));
    }

    public static <E> void print(E[] list) {
        for (E element : list) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    /*
    ** A method which compares the incoming element to the remaining elements in the list
    ** and returns the count of the number of elements which are greater than the elements
    * in the list
    *
    * See the usage of Comparable.compareTo instead of greater than operator
    *
    * input = {10, 20, 30}
    * input = 20
    * Result = 1
     */

    private static  <T extends Comparable<T>> int countGreaterThan(T[] list, T input){
        int count = 0;
        for(T element : list){
            if(element.compareTo(input) > 0){
                count++;
            }
        }
        return count;
    }
}
