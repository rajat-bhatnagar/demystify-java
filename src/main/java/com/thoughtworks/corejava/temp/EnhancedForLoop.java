package com.thoughtworks.corejava.temp;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by rajatbhatnagar on 7/5/15.
 * This class demonstrates advanced for loop
 */
public class EnhancedForLoop {
    public static void main(String[] args) {
        Collection<StringBuffer> bufferList = new ArrayList<StringBuffer>();
        bufferList.add(new StringBuffer("Wayne"));
        bufferList.add(new StringBuffer("Dayne"));
        bufferList.add(new StringBuffer("Crayne"));
        //Print Elements using advanced for loop
        System.out.println("stringBuffer elements :: ");
        for (StringBuffer stringBuffer : bufferList) {
            System.out.println("\t\t\t" + stringBuffer.reverse());
        }
        //Note that the object itself got modified after the iteration
        System.out.println("bufferList after iteration :: " + bufferList);
    }
}
