package com.thoughtworks.corejava.collections;

import java.util.*;

/**
 * Created by rajatbhatnagar on 6/2/15.
 */
public class ScannerDemo {
    public static void main(String[] args) {
        new ScannerDemo().run();
    }

    private void run() {
        final int SENTINEL = -1;

        final String INPUT_PROMPT = "Please enter a number or " + SENTINEL + "to quit";
        final String SUM_MESSAGE = "The sum of the scores is ";

        int sum = 0, score;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            score = scanner.nextInt();
            if (score == SENTINEL)
                break;
            sum += score;
        }
        System.out.println(SUM_MESSAGE + sum);
    }
}
