package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TemperatureConverterTest {
    //
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
        int temperature = 0;

        // Act
        double result = TemperatureConverter.convert(unitToConvertTo,temperature);

        // ASSERT
        Assertions.assertThat(result).isEqualTo(38.0);
    }
}
