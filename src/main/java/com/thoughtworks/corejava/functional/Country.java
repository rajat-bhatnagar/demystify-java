package com.thoughtworks.corejava.functional;

public class Country {
    private String name;
    private String language;

    public Country(String name, String language) {
        this.name = name;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
