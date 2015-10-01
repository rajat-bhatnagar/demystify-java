package com.thoughtworks.corejava.gson;

import com.google.gson.annotations.Expose;

/**
 * Created by rajatbhatnagar on 9/30/15.
 */
public class School {
    @Expose
    private int classrooms;
    @Expose
    private int playgrounds;
    private String address;
    private String houses;

    private School() {
    }

    public School(int classrooms, int playgrounds, String address, String houses) {
        this.classrooms = classrooms;
        this.playgrounds = playgrounds;
        this.address = address;
        this.houses = houses;
    }
}
