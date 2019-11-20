package com.manchestesdigital.challenges.regmenow;

import org.junit.Test;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class RegMeNowTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Test
    public void whenInputValidPlateReturnsValidConversion() {
        String licencePlate = "SB11VFH";
        String expectedResult = "5811VFH";
        String result = RegMeNow.convertReg(licencePlate);
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    public void whenInputInvalidLengthThrowsException() {
        String invalidInput = "DFG";
        expectedException.expect(InvalidRegistrationException.class);
        RegMeNow.convertReg(invalidInput);
        Assertions.assertThat(expectedException).isInstanceOf(InvalidRegistrationException.class);
    }
    @Test
    public void whenInvalidCharactersThrowsException() {
        String invalidInput = "DF!!!))";
        expectedException.expect(InvalidRegistrationException.class);
        RegMeNow.convertReg(invalidInput);
        Assertions.assertThat(expectedException).isInstanceOf(InvalidRegistrationException.class);
    }
}