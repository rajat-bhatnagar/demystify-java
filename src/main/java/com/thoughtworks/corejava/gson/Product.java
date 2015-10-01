package com.thoughtworks.corejava.gson;

import java.util.Date;

/**
 * Created by rajatbhatnagar on 9/30/15.
 */
public class Product {
    private int id;
    private String name;
    private Date created;
    protected double amount;

    private Product() {
    }

    public Product(int id, String name, Date created, double amount) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.amount = amount;
    }
}
