package com.manchesterdigital.challenges.filteralbuns;

public class Album {
    private String albumName;


    public String getAlbumName() {
        return albumName;
    }

    public Album(String albumName) {
        this.albumName = albumName;
    }

    @Override
    public String toString() {
        return "Album albumName = " + albumName;
    }
}
