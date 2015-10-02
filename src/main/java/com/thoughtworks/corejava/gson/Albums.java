package com.thoughtworks.corejava.gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 10/1/15.
 */
public class Albums {
    private String title;
    private String message;
    private List<String> errors = new ArrayList<String>();
    private String total;
    private int total_pages;
    private int page;
    private String limit;
    List<Dataset> dataset = new ArrayList<Dataset>();

    private Albums() {
    }

    public Albums(String title, String message, List<String> errors, String total, int total_pages, int page, String limit, List<Dataset> dataset) {
        this.title = title;
        this.message = message;
        this.errors = errors;
        this.total = total;
        this.total_pages = total_pages;
        this.page = page;
        this.limit = limit;
        this.dataset = dataset;
    }
}
