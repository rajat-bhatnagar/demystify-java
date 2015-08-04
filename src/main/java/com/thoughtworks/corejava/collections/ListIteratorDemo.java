package com.thoughtworks.corejava.collections;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by rajatbhatnagar on 6/19/15.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList arrLst = new ArrayList();
        arrLst.add("Deepika");
        arrLst.add("Shraddha");
        arrLst.add("Priyanka");
        arrLst.add("Nargis");
        arrLst.add("Vidya");
        ListIterator listIterator = arrLst.listIterator();
        System.out.println("Elements are : " + arrLst);
        while (listIterator.hasNext()) {
            String heroine = (String) listIterator.next();
            if (heroine.equals("Deepika")) {
                listIterator.add("HotAndSizzling");
            } else if (heroine.equals("Vidya")) {
                listIterator.remove();
            } else if (heroine.equals("Nargis")) {
                listIterator.set("Fakri");
            }
        }
        System.out.println("Elements are : " + arrLst);
    }
}
