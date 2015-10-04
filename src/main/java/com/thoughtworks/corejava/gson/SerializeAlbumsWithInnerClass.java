package com.thoughtworks.corejava.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

/**
 * Created by rajatbhatnagar on 10/4/15.
 * <p/>
 * This program demonstrates how an inner class is serialized
 */
public class SerializeAlbumsWithInnerClass {
    public static void main(String[] args) {
        AlbumsWithInnerClass albumsWithInnerClass = new AlbumsWithInnerClass();
        albumsWithInnerClass.setName("Serialize Inner Class ");
        albumsWithInnerClass.setYear("1982");

        AlbumsWithInnerClass.Dataset1 dataset1 = albumsWithInnerClass.new Dataset1();
        dataset1.setAlbum_id("PChopra");
        dataset1.setAlbum_name("Piggy Chops");

        AlbumsWithInnerClass.Dataset2 dataset2 = albumsWithInnerClass.new Dataset2();
        dataset2.setAlbum_id("JLopez");
        dataset2.setAlbum_name("Dance With me");

        //Assign the dataset to album
        albumsWithInnerClass.setDataset(new AlbumsWithInnerClass.Dataset1[]{dataset1});
        albumsWithInnerClass.setDataset2(new AlbumsWithInnerClass.Dataset2[]{dataset2});

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.excludeFieldsWithModifiers(Modifier.PRIVATE);
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        String innerClassJSON = gson.toJson(albumsWithInnerClass);
        System.out.println("innerClassJSON = " + innerClassJSON);

        Gson gson2 = new Gson();
        String innerdataset1json = gson2.toJson(dataset1);
        System.out.println("Inner Dataset1 Json ::" + innerdataset1json + "\n");

        Gson gson3 = new Gson();
        String innerdataset2json = gson3.toJson(dataset2);
        System.out.println("Inner Dataset2 Json ::" + innerdataset2json + "\n");

        // We read the JSON and de-serialze the AlbumsWithInnerClass now
        Gson gson1 = new Gson();
        AlbumsWithInnerClass parsedJSON = gson1.fromJson(innerClassJSON, AlbumsWithInnerClass.class);
        System.out.println(parsedJSON.getClass());
        System.out.println(parsedJSON.dataset[0].album_id);
        System.out.println(parsedJSON.dataset2[0].album_id + "\n");

        //Read the JSON and de-serialize the inner dataset1 class
        Gson gson5 = new Gson();
        AlbumsWithInnerClass.Dataset1 parsedDatset1 = gson5.fromJson(innerdataset1json, AlbumsWithInnerClass.Dataset1.class);
        System.out.println(parsedDatset1.getClass());
        System.out.println(parsedDatset1.album_id);
        System.out.println(parsedDatset1.album_name + "\n");

        //Read the JSON and de-serialize the dataset2 class
        Gson gson6 = new Gson();
        AlbumsWithInnerClass.Dataset2 parsedDataset2 = gson6.fromJson(innerdataset2json, AlbumsWithInnerClass.Dataset2.class);
        System.out.println(parsedDataset2.getClass());
        System.out.println(parsedDataset2.album_id);
        System.out.println(parsedDataset2.album_name);
    }
}
