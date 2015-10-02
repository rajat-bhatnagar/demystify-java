package com.thoughtworks.corejava.gson;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajatbhatnagar on 10/1/15.
 */
public class Dataset {
    private String album_id;
    private String album_title;
    @SerializedName("album_images")
    List<AlbumImages> images = new ArrayList<AlbumImages>();

    public Dataset() {
    }

    public Dataset(String album_id, String album_title, List<AlbumImages> images) {
        this.album_id = album_id;
        this.album_title = album_title;
        this.images = images;
    }
}
