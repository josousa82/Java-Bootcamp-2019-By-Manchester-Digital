package com.manchesterdigital.classes.streams;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {

    public static void main(String[] args) {

       Artist arianaGrande = new Artist("Ariana Grande",
                List.of( new Members("Ariana Grande")), "London");

        Artist beatles = new Artist("Beatles",
                List.of( new Members("John Lennon"),
                        new Members("Paul MAcCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")), "Liverpool");

        Artist coldplay = new Artist("Coldplay",
                List.of( new Members("Chris Martin"),
                        new Members("Guy Barryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")), "London");

        List<Artist> artists = List.of(arianaGrande, beatles, coldplay);

        // Old Fashion
        long countFromLiverpool = 0;

        for (Artist artist: artists){
            if (artist.isfrom("Liverpool")) {
                countFromLiverpool++;
            }
        }

        System.out.println("countFromLiverpool = " + countFromLiverpool);

        // Streams way

        Long numberOfArtistsFromLiverpool = artists.stream()
                .filter(artist -> artist.isfrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count();


        String result = Stream.of("A", "B", "C")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findFirst()
                .orElse(null);

        System.out.println("result = " + result);

        // gathering match criteria to use maybe elsewhere:

        List<Artist> london = artists.stream()
                .filter(artist -> artist.isfrom("London"))
                .collect(Collectors.toList());

        // extract all artist names and then print it
        london.stream()
                .map(Artist::getName)
                .forEach(System.out::println);


        // Sorting

      /*  Collections.sort(artists, new Comparator<Artist>(){

            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

        // Better to do this

        Set<Artist> uniqueArtists = new HashSet<>(artists);

        uniqueArtists.stream()
                .sorted(Comparator.comparing((Artist::getName)));

        // Collections.sort(artists, Comparator.comparing(Artist::getName));


        /*
        ArtistLonbok.ArtistLonbokBuilder test = ArtistLonbok.builder()
                .name("jose")
                .album("Malhão do ze")
                .membersList(List.of());

        ArtistLonbok.builder()
                .name("maria")
                .album("Malhão do ze")
                .membersList(List.of()).build();
                */

        List<String> countriesInEurope = List.of("England", "France");
        List<String> countriesInAsia = List.of("India", "China");

        // using commons collections

        Collection allCountries = CollectionUtils.union(countriesInAsia, countriesInEurope);
        System.out.println("allCountries = " + allCountries);

        Collection intersection = CollectionUtils.intersection(countriesInAsia, countriesInEurope);
        System.out.println("intersection = " + intersection);




    }

}
