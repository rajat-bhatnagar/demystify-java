package com.thoughtworks.corejava.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // Imperative Way
        System.out.println(" # Imperative - " + getDatabaseUrl());

        // Declarative Way
        System.out.println(" # Declarative way - Supplier " + getDatabaseUrlSupplier.get());
        System.out.println(" # Declarative way - Supplier List " + getDatabaseUrlSupplierList.get());

    }

    static Supplier<String> getDatabaseUrlSupplier = () -> "jdbc://localhost:3306/rso_01";

    static Supplier<List<String>> getDatabaseUrlSupplierList = () -> Arrays.asList("jdbc://localhost:3306/rso_01");

    static String getDatabaseUrl() {
        return "jdbc://localhost:3306/rso_01";
    }
}
