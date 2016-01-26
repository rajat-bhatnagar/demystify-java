package com.thoughtworks.corejava.generics;

import java.util.List;

/**
 * Created by rajatbhatnagar on 1/25/16.
 * Program to demonstrate that two distinct methods cannot
 * have signature with the same erasure
 */
public class OverloadedTypeErasure {

    //Method 1
    public static boolean allZero(List<Integer> ints){
        for(int i :ints) if(i<0) return false;
        return true;
    }

    //Method2 :: Is commented out as it will return in compile time error

    // NOTE : Two distinct methods cannot have signature with the same erasure
    // In this case Mthod1 and Method2 have the same erasure
    // i.e The erasure of List<Integer> and List<String> is List

   /* public static boolean allZero(List<String> strs){
        for(String s : strs) if(s.length()<0) return false;
        return true;
    }*/

}
