package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 10/1/15.
 */
public class AlbumImages {
    private String image_id;
    private String user_id;

    private AlbumImages() {
    }

    public AlbumImages(String image_id, String user_id) {
        this.image_id = image_id;
        this.user_id = user_id;
    }
}
