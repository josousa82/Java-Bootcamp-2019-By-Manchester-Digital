package com.manchestesdigital.challenges.regmenow;

import java.util.HashMap;
import java.util.Map;

public class RegMeNow {

    public static String convertReg(String numbers) {

        if (!(numbers.length() >= 5 && numbers.length() <= 7)) {
            throw new InvalidRegistrationException("Registration must be 5-7 characters");
        }else if (!numbers.matches("[a-zA-Z0-9]*")){
            throw new InvalidRegistrationException("Registration must be alpha-numeric");
        }

        String[] numbersSplit = numbers.split("");

        Map<String, Integer> conversions = new HashMap<>();

        conversions.put("S", 5);
        conversions.put("A", 4);
        conversions.put("G", 9);
        conversions.put("B", 8);
        conversions.put("I", 1);

        StringBuilder result = new StringBuilder();

        for (String charStr : numbersSplit) {

            if (conversions.containsKey(charStr)) {
                result.append(conversions.get(charStr));
            } else {
                result.append(charStr);
            }
        }
        return result.toString();
    }
//    public static Boolean checkReg(String licencePlate) {
//        return (licencePlate.length() >= 5 && licencePlate.length() <= 7) ? true : false;
//    }
//    public static Boolean doesOnlyContainsValidChar(String licencePlate) {
//        return licencePlate.matches("[a-zA-Z0-9]*");
//    }
}
