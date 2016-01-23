package com.thoughtworks.corejava.generics;

import java.util.Arrays;
import java.util.Collection;

public class FindMaxElementCollGenericMethod {

    //A generic method to find the maximum element out of a collection
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> collection){
        T candidate = collection.iterator().next();
        for(T element : collection){
            if(candidate.compareTo(element)<0){
                candidate = element;
            }
        } return candidate;
    }

    public static void main(String[] args) {
        System.out.println("Maximum element in collection is :: "+max(Arrays.asList(12,17,19,7,765,-89)));
        assert max(Arrays.asList(12,17,19,7,765,-89)) == 765;
    }
}
