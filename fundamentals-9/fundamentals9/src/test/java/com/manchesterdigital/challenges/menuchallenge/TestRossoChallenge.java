package com.manchesterdigital.challenges.menuchallenge;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestRossoChallenge {

    @Test
    public void testMexicanDishs() {

        // Arrange
        MenuRosso dishCategory = MenuRosso.MEXICAN;

        //Act
        String result = RossoMenu.getMenu(dishCategory);
        // Assert
        Assertions.assertThat(result).isEqualTo("Taco, Burrito");
    }

    @Test
    public void testIndianDishs() {

        // Arrange
        MenuRosso dishCategory = MenuRosso.INDIAN;

        //Act
        String result = RossoMenu.getMenu(dishCategory);
        // Assert
        Assertions.assertThat(result).isEqualTo("Tandoori Chicken, Bhuna Ghosht");
    }

    @Test
    public void testPanAsianDishs() {

        // Arrange
        MenuRosso dishCategory = MenuRosso.PAN_ASIAN;

        //Act
        String result = RossoMenu.getMenu(dishCategory);
        // Assert
        Assertions.assertThat(result).isEqualTo("Stir Fry Noodles, Dimsum");
    }

    @Test
    public void testEnglishDishs() {

        // Arrange
        MenuRosso dishCategory = MenuRosso.ENGLISH_DISHES;

        //Act
        String result = RossoMenu.getMenu(dishCategory);
        // Assert
        Assertions.assertThat(result).isEqualTo("Beef Wellington, Fish and Chips");
    }

    @Test
    public void testInvalidNOTDishs() {

        // Arrange
        MenuRosso dishCategory = MenuRosso.INVALID;
        //Act
        String result = RossoMenu.getMenu(dishCategory);
        // Assert
        Assertions.assertThat(result).isEqualTo("Beef Wellington, Fish and Chips");
    }

}
