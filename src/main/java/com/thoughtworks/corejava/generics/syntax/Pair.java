package com.thoughtworks.corejava.generics.syntax;

public interface Pair<K, V> {

    <K> K getKey();

    <V> V getValue();
}
