package com.manchesterdigital.classes.streams;

import com.manchesterdigital.challenges.filteralbuns.Album;
import lombok.*;

import java.util.List;

@RequiredArgsConstructor
@Setter
@Getter
@Builder
@AllArgsConstructor
public class ArtistLonbok {

    private final String name;
    private final List<Members> membersList;
    private String location;
    private List<Album> albums;
    private String song;
    private final String album;

    public boolean isfrom(String locationRequired) {

        return location.equalsIgnoreCase(locationRequired);
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
