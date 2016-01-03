package com.thoughtworks.corejava.generics;

import java.util.List;

/**
 * Created by rajatbhatnagar on 1/3/16.
 * Demonstrate that you cannot overload the same type in generics
 */
public class ErasureOverloading {
    public void printMe(String str){

    }
    public void printMe(Integer integer){

    }
    public void printMe(List<String> names){

    }
    //Cannot do this as both overloaded methods have the same parameter types and Java removes them by ERASURE
    //at compile time
   /* public void printMe(List<Integer> numbers){
        //COMPILATION ERROR - Both methods have the same erasure
    }*/
}
