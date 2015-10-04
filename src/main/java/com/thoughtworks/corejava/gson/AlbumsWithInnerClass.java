package com.thoughtworks.corejava.gson;

/**
 * Created by rajatbhatnagar on 10/4/15.
 * <p/>
 * This is a inner class
 */
public class AlbumsWithInnerClass {
    public String name;
    private String year;
    public Dataset1[] dataset;
    public Dataset2[] dataset2;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setDataset(Dataset1[] dataset) {
        this.dataset = dataset;
    }

    public void setDataset2(Dataset2[] dataset2) {
        this.dataset2 = dataset2;
    }

    class Dataset1 {
        public String album_name;
        public String album_id;

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = name + "_" + album_id;
        }
    }

    class Dataset2 {
        public String album_name;
        public String album_id;

        public void setAlbum_name(String album_name) {
            this.album_name = album_name;
        }

        public void setAlbum_id(String album_id) {
            this.album_id = album_id;
        }
    }
}
