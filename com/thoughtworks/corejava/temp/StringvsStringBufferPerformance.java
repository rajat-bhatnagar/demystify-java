package com.thoughtworks.corejava.temp;

/**
 * Created by rajatbhatnagar on 7/14/15.
 * This program demonstrates that String is a costly
 * operation for concatenation compared to StringBuffer
 */
public class StringvsStringBufferPerformance {
    private static final int ITERATIONS = 100000;

    public static void main(String[] args) {
        System.out.println("Timing for String concat " +ITERATIONS+ " operations :: "+ stringConcatTime("myString", ITERATIONS));
        System.out.println("Timing for String Buffer concat " +ITERATIONS+ " operations :: "+ stringBufferConcatTime(new StringBuffer("myStringBuffer"), ITERATIONS));
    }

    public static long stringConcatTime(String myString, int iterations){
        long startTime = System.currentTimeMillis();
        for(int counter=0;counter<iterations;counter++){
            myString+=counter;
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;

    }
    public static long stringBufferConcatTime(StringBuffer myStringBuffer, int iterations){
        long startTime = System.currentTimeMillis();
        for(int counter=0;counter<iterations;counter++) {
            myStringBuffer.append(counter);
        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        return timeElapsed;

    }
}
