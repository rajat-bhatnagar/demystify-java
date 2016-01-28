package com.thoughtworks.corejava.generics.genericLibraryWthGenericClient;


/**
 * Created by rajatbhatnagar on 1/27/16.
 */
public class Stacks {
    /*
     * This method reverses the elements of a stack
     */
    public static Stack reverse(Stack in){
        Stack out = new ArrayStack();
        while (!in.empty()){
            Object element = in.pop();
            out.push(element);
        }
        return out;
    }
}
