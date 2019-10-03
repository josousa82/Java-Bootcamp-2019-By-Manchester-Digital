package com.manchesterdigital.challenges.mapchallenge;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestMapChallenge {

    @Before
    public void setUp(){



    }

    @Test
    public void testAbExist() {

        // Arrange
        HashMap<String, String>  arg  = new HashMap<>();
        arg.put("a", "Hi");
        arg.put("b","There");

        HashMap<String, String>  expectedOutup = new HashMap<>();
        expectedOutup.put("a", "Hi");
        expectedOutup.put("ab", "HiThere");
        expectedOutup.put("b","There");

        // Act

        Boolean compare = MapChallenge.mapAB(arg).equals(expectedOutup);

        //Assert

        Assertions.assertThat(compare).isEqualTo(true);
    }

    @Test
    public void testAExist() {

        // Arrange
        HashMap<String, String>  arg  = new HashMap<>();
        arg.put("a", "Hi");


        HashMap<String, String>  expectedOutup = new HashMap<>();
        expectedOutup.put("a", "Hi");

        // Act

        Boolean compare = MapChallenge.mapAB(arg).equals(expectedOutup);

        //Assert

        Assertions.assertThat(compare).isEqualTo(true);
    }

    @Test
    public void testBExist() {

        // Arrange
        HashMap<String, String>  arg  = new HashMap<>();
        arg.put("b","There");


        HashMap<String, String>  expectedOutup = new HashMap<>();
        expectedOutup.put("b","There");

        // Act

        Boolean compare = MapChallenge.mapAB(arg).equals(expectedOutup);

        //Assert

        Assertions.assertThat(compare).isEqualTo(true);
    }
}
