package com.manchesterdigital.classes.designpatterns;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.List;

public class Scratch {

    public static void main(String[] args) {
        List<String> names = List.of("jose", "andrew", "emalin");

        System.out.println("StringUtils.capitalize(names.get(0)) = " + StringUtils.capitalize(names.get(0)));

        System.out.println("StringUtils.defaultString(names.get(0)) = " + StringUtils.defaultString(names.get(0),
                "Cromo"));



    }
}
