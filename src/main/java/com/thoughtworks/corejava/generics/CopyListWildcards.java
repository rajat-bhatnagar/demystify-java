package com.thoughtworks.corejava.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rajatbhatnagar on 1/5/16.
 */
public class CopyListWildcards {

    public static void main(String[] args) {
        copySrcToDestination(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5));
    }

    public static <T> void copySrcToDestination(List<? super T> destination, List<? extends T> source) {
        System.out.println("Original source :: " + source);
        System.out.println("Original destination :: " + destination);
        if (destination.size() != source.size()) {
            throw new IllegalArgumentException("Size of SOURCE and DESTINATION lists are different, Cannot copy ");
        }
        for (int counter = 0; counter < source.size(); counter++) {
            destination.set(counter, source.get(counter));
        }
        System.out.println("Final destination :: " + destination);
    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        if (dst.size() != src.size()) {
            throw new IllegalArgumentException("Size of SOURCE and DESTINATION lists are different, Cannot copy ");
        }
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }

    }
}
