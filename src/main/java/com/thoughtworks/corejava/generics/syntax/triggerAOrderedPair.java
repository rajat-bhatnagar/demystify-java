package com.thoughtworks.corejava.generics.syntax;

public class triggerAOrderedPair {
    public static void main(String[] args) {
        Pair<Integer, String> integerStringPair = new OrderedPair<>(1, "Apple");
        Pair<String, String> stringPair = new OrderedPair<>("Apples", "Oranges");
        printKeyAndValue(integerStringPair.getKey(), integerStringPair.getValue());
        printKeyAndValue(stringPair.getKey(), stringPair.getValue());
        printKeyAndValue(1L, 100L);
    }

    private static <K, V> void printKeyAndValue(K key, V value) {
        System.out.println("<Key,Value> "+"<"+key + ","+value+">");
    }
}
