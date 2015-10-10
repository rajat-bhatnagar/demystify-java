package com.thoughtworks.corejava.gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rajatbhatnagar on 10/4/15.
 */
public class MusicDataset {
    private String album_id;
    private String album_title;
    private Map<String, Object> otherProperties = new HashMap<String, Object>();

    public String getAlbum_id() {
        return album_id;
    }

    public void setAlbum_id(String album_id) {
        this.album_id = album_id;
    }

    public String getAlbum_title() {
        return album_title;
    }

    public void setAlbum_title(String album_title) {
        this.album_title = album_title;
    }

    public Map<String, Object> getOtherProperties() {
        return otherProperties;
    }

    public void setOtherProperties(Map<String, Object> otherProperties) {
        this.otherProperties = otherProperties;
    }
}
