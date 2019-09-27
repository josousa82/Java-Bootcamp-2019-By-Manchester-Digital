package com.manchesterdigital;

import jdk.nashorn.internal.ir.CallNode;

public class TemperatureConverter {
    public static final String CELCIUS_UNIT = "C";
    public static final String FAHRENHEIT_UNIT = "F";

    public static double convert(String unitToConvertTo, int temperature) {
        if(!unitToConvertTo.equalsIgnoreCase(CELCIUS_UNIT) &&
                !unitToConvertTo.equalsIgnoreCase(FAHRENHEIT_UNIT)){
            throw new InvalidConversionUnitException("Provided invalid unit: " + unitToConvertTo);
        }

        if (unitToConvertTo.equalsIgnoreCase(CELCIUS_UNIT)) {
            return calculateFahrenheitToCelcius(temperature);
        }
        return calculateCelciusToFahrenheit(temperature);
    }

    private static double calculateFahrenheitToCelcius(int fahrenheitValue){
        return Math.floor((fahrenheitValue - 32) * 5 / 9);
    }

    private static double calculateCelciusToFahrenheit(int celciusValue){
        return Math.floor((celciusValue * 9/5) + 32);
    }


}
