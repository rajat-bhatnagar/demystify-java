package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 10/4/15.
 */
public class MusicAlbums {
    private String title;
    private MusicDataset[] musicDatsets;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MusicDataset[] getMusicDatsets() {
        return musicDatsets;
    }

    public void setMusicDatsets(MusicDataset[] musicDatsets) {
        this.musicDatsets = musicDatsets;
    }
}
