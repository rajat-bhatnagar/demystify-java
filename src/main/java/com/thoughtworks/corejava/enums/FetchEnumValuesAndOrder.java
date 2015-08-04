package com.thoughtworks.corejava.enums;

/**
 * Created by rajatbhatnagar on 6/30/15.
 * Demonstrates how to fetch enum values and order using ordinal method
 */
public class FetchEnumValuesAndOrder {
    public static void main(String[] args) {
        CitiesVisited citiesVisitedEnumValues[] = CitiesVisited.values();
        for (CitiesVisited citiesVisited : citiesVisitedEnumValues) {
            System.out.println("citiesVisited.name() :: " + citiesVisited.name() + " && Ordinal Value is:: " + citiesVisited.ordinal());
        }
    }
}

enum CitiesVisited {
    Lucknow, Jaipur, Pune, Bangalore, Chennai
}
