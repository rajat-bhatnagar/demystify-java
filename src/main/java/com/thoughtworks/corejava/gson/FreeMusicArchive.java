package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;

/**
 * Created by rajatbhatnagar on 10/1/15.
 */
public class FreeMusicArchive {
    public static void main(String[] args) {
        List<Dataset> datasets = new ArrayList<Dataset>();
        List<AlbumImages> albumImages = new ArrayList<AlbumImages>();
        AlbumImages image = new AlbumImages("16848", "Mike Kling");
        albumImages.add(image);
        Dataset dataset = new Dataset("10620", "Through The Cracks", albumImages);
        datasets.add(dataset);
        List<String> errors = new ArrayList<String>();
        Albums albums = new Albums("Free Music Archive - Albums", "", errors, "13039", 2608, 1, "5", datasets);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        gsonBuilder.serializeNulls();
        Gson gson = gsonBuilder.create();
        String JSON = gson.toJson(albums);
        System.out.println("JSON = " + JSON);
    }
}
