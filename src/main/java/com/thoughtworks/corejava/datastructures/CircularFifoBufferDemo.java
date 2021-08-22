package com.thoughtworks.corejava.datastructures;

import org.apache.commons.collections.buffer.CircularFifoBuffer;
/**
 * Created by rajatbhatnagar on 12/28/15.
 */
public class CircularFifoBufferDemo {
    //Circular buffer is a linear data structure which follows the FIFO principle
    public static void main(String[] args) {
        CircularFifoBuffer buf = new CircularFifoBuffer(4);
        //We use CircularFifoBuffer from apache commons collection for the implementation
        buf.add("A");
        buf.add("B");
        buf.add("C");
        buf.add("D");
        buf.add("E");
        buf.remove();
        System.out.println("buf = " + buf);
    }
}
