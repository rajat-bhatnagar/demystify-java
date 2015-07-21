package com.thoughtworks.corejava.collections;

/**
 * Created by rajatbhatnagar on 6/22/15.
 */
public class StringBufferComparator implements java.util.Comparator{
    public int compare(Object obj1 , Object obj2){
        //Typecast StringBuffer object to String
        String str1 = obj1.toString();
        String str2 = obj2.toString();
        //Compare the two Strings
        return str1.compareTo(str2);
    }
}
