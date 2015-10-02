package com.thoughtworks.corejava.gson;

import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Field;
import java.util.*;

/**
 * Created by rajatbhatnagar on 10/1/15.
 * This program demonstrates how a complex JSON structure having multiple nested structures can be created
 * from the scratch.
 *
 * This program also demonstrates how to apply a custom naming strategy and modify fieldNames
 */
public class FreeMusicArchive {
    public static void main(String[] args) {
        //Create List of Album Image
        List<AlbumImages> albumImages = new ArrayList<AlbumImages>();
        AlbumImages image = new AlbumImages("16848", "MikeS");
        //Add Image to Album Images List
        albumImages.add(image);
        //Create List of datasets
        List<Dataset> datasets = new ArrayList<Dataset>();
        Dataset dataset = new Dataset("10620", "Through The Cracks", albumImages);
        //Add dataset to List of datasets
        datasets.add(dataset);
        //Create List of Errors
        List<String> errors = new ArrayList<String>();
        //Create Albums Object and pass the lists created above to its constructor
        Albums albums = new Albums("Free Music Archive - Albums", "", errors, "13039", 2608, 1, "5", datasets);
        //Create GsonBuilder
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting().serializeNulls();
        //Applying Custom Naming Strategy and changing name of field from
        //album_title to album-title during JSON Serialization
        gsonBuilder.setFieldNamingStrategy(new FieldNamingStrategy() {
            public String translateName(Field f) {
                if (f.getName().equals("album_title")) {
                    return "album-title";
                } else {
                    return f.getName();
                }
            }
        });
        Gson gson = gsonBuilder.create();
        //Serialize JSON
        String JSON = gson.toJson(albums);
        System.out.println("JSON = " + JSON);
    }
}
