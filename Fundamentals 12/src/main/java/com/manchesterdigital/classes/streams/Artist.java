package com.manchesterdigital.classes.streams;

import com.manchesterdigital.challenges.filteralbuns.Album;

import java.util.List;

public class Artist {
    private String name;
    private List<Members> membersList;
    private String location;
    private List<Album> albums;
    private String song;
    private String album;


    public String getName() {
        return name;
    }

    public List<Members> getMembersList() {
        return membersList;
    }

    public String getLocation() {
        return location;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isfrom(String locationRequired) {
        return location.equalsIgnoreCase(locationRequired);
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public Artist(String name, List<Members> membersList, String location) {
        this.name = name;
        this.membersList = membersList;
        this.location = location;
    }


//    public static class ArtistBuilder {
//        private final String name;
//        private final List<Members> membersList;
//        private final String location;
//
//        public ArtistBuilder(String name, List<Members> membersList, String location) {
//            this.name = name;
//            this.membersList = membersList;
//            this.location = location;
//        }
//    }
}
     /*   public Artist build() {



    }*/



