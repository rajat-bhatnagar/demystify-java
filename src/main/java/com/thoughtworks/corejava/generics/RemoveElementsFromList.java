package com.thoughtworks.corejava.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by rajatbhatnagar on 1/3/16.
 * This class removes the negative elements from a list of doubles
 */
public class RemoveElementsFromList {
    public static void main(String[] args) {
        //Invoke the method which removes the negative elements from a List

        //we do not use a simple arrayList here to avoid ConcurrentModificationException
        List<Double> doubleList = new CopyOnWriteArrayList<>();
        doubleList.add(-2.3);
        doubleList.add(9.2);
        doubleList.add(-5.3);
        doubleList.add(3.3);
        removeNegativeElements(doubleList);
        System.out.println("Elements after removal of negatives :: "+doubleList);

    }

    public static void removeNegativeElements(List<Double> elements){
        Iterator<Double> iterator = elements.iterator();
        while(iterator.hasNext()){
            Double element = (Double)iterator.next();
            if(element<0){
                elements.remove(element);
            }
        }
    }

}
