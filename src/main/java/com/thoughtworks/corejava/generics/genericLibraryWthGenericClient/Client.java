package com.thoughtworks.corejava.generics.genericLibraryWthGenericClient;

/**
 * Created by rajatbhatnagar on 1/27/16.
 * Program to test the functionality of Stack class and associated methods push , pop and reverse
 */
public class Client {
    public static void main(String[] args) {
        Stack stack = new ArrayStack();
        //Populate the stack
        for(int i=0;i<4;i++) {
            Object element = Integer.valueOf(i) ;
            stack.push(element);
        }
        //Test for push method
        assert stack.toString().equals("stack=[0, 1, 2, 3]");
        //Test for reverse method
        Stack reverse = Stacks.reverse(stack);
        assert reverse.toString().equals("stack=[3, 2, 1, 0]");
        //As soon as we reverse the stack, stack becomes empty, see reverse method implementation
        //Test for empty method
        assert stack.empty();
        int topElement = ((Integer)reverse.pop()).intValue();
        //Test for the element which is pop-ed out from the top ot stack
        assert topElement == 0;
        //Test for pop method
        assert reverse.toString().equals("stack=[3, 2, 1]");

    }
}
