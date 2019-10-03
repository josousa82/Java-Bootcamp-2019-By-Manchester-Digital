package com.manchesterdigital.challenges.mapchallenge;

import java.util.Map;

public class MapChallenge {

    public static Map<String, String> mapAB(Map<String, String> map) {

            if(map.containsKey("a") && map.containsKey("b")){
                // extract values of the keys
                String valuesAb = map.get("a").concat(map.get("b"));
                map.put("ab", valuesAb);
            }
        return map;
    }
}
