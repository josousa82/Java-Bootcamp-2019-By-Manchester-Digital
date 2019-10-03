package com.manchesterdigital.challenges.menuchallenge;

import java.util.HashMap;

public class RossoMenu {

    public static String getMenu(MenuRosso menuChoice) {
        switch (menuChoice) {
            case MEXICAN:
                return "Taco, Burrito";
            case INDIAN:
                return "Tandoori Chicken, Bhuna Ghosht";
            case PAN_ASIAN:
                return "Stir Fry Noodles, Dimsum";
            case ENGLISH_DISHES:
                return "Beef Wellington, Fish and Chips";
            default:
                return "No dish";
        }

    }

  /*  public static void main(String[] args) {
        HashMap<String, String>
    }*/

}
