package com.thoughtworks.corejava.arrays;
import org.apache.commons.lang3.ArrayUtils;
/**
 * Created by rajatbhatnagar on 12/28/15.
 */
public class RemoveElementFromArray {
    public static void main(String[] args) {
        RemoveElementFromArray obj = new RemoveElementFromArray();
        //Declare an array having size
        int[] queue = new int[4];
        for(int counter=0;counter<queue.length;counter++){
            queue[counter]=counter;
        }
        System.out.println("Elements in Array");
        obj.printArrayElements(queue);
        //Removed Array element using ArrayUtils from Apache Commons
        System.out.println("Elements after removing the element at index 0");
        obj.printArrayElements(ArrayUtils.remove(queue,0));
    }

    public void printArrayElements(int[] queue){
        for(int item : queue){
            System.out.println("item["+item+"] = " + item);
        }
    }
}
