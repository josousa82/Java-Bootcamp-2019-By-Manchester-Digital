package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TemperatureConverterTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void whenFahrenheitIsZeroThenCelciusIsMinus17() {
       // Arrange
        String unitToConvertTo = "C";
        int temperature = 0;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(-17.0);
    }

    @Test
    public void whenFahrenheitIs100ThenCelciusIs38() {
        // Arrange
        String unitToConvertTo = "C";
        int temperature = 100;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(37.0);
    }

    @Test
    public void whenFahrenheitIs50ThenCelciusIs10() {
        // Arrange
        String unitToConvertTo = "C";
        int temperature = 50;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(10.0);
    }

    // -------------------- Celcius to Fahrenheit TESTS -------------------


    @Test
    public void whenCelciusIs0ThenFahrenheitIs32() {

        // Arrange
        String unitToConvertTo = "F";
        int temperature = 0;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(32.0);

    }

    @Test
    public void whenCelciusIs35ThenFahrenheitIs95() {

        // Arrange
        String unitToConvertTo = TemperatureConverter.FAHRENHEIT_UNIT;
        int temperature = 35;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(95.0);

    }

    // First option, short root to test exception thrown
    @Test(expected = InvalidConversionUnitException.class)
    public void whenConversionIsNotValidThenExceptionThrown() {
        TemperatureConverter.convert("oiihfoiahsdf", 0);
    }

    // second option, and better practice to test exception thrown
    @Test
    public void whenConversionIsNotValidThenExceptionThrown2Option() {
        expectedException.expect(InvalidConversionUnitException.class);
        expectedException.expectMessage("Provided invalid unit: oiihfoiahsdf");

        TemperatureConverter.convert("oiihfoiahsdf", 0);

        Assertions.assertThat(expectedException).isInstanceOf(InvalidConversionUnitException.class);

    }
}
