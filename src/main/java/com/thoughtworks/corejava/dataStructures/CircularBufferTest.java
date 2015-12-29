package com.thoughtworks.corejava.dataStructures;

/**
 * Created by rajatbhatnagar on 12/28/15.
 TODO : Not working as Expected : FIX LATER
 */
public class CircularBufferTest {
    public static void main(String[] args) {
        CircularBuffer<String> circularBuffer = new CircularBuffer<String>(3);
        circularBuffer.offer("a");
        circularBuffer.offer("b");
        circularBuffer.offer("c");
        circularBuffer.offer("d");

        String value = concatenate(circularBuffer);
        System.out.println("value = " + value);
    }
    private static String concatenate(CircularBuffer<String> buffer){
        StringBuilder result = new StringBuilder();
        String value;
        while ((value = buffer.poll()) != null){
            result.append(value);
        }
        return result.toString();
    }
}
