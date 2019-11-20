package com.manchesterdigital.challenges.filteralbuns;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        Album dna = new Album("DNA");
        Album theSimulation = new Album("The Simulation");
        Album magnolia = new Album("Magnolia");
        Album assumeForm = new Album("Assume Form");
        Album whoDoYouTrust = new Album("Who Do You Trust?");

        List<Album> albumList = List.of(dna, theSimulation,magnolia, assumeForm, whoDoYouTrust);

        // functional programming
        albumList.stream()
                .filter(album -> album.getAlbumName().startsWith("A"))
                .forEach(System.out::println);

        // lambda version
        albumList.stream()
                .filter(album -> album.getAlbumName().startsWith("A"))
                .forEach(album -> System.out.println(album));

    }


}
