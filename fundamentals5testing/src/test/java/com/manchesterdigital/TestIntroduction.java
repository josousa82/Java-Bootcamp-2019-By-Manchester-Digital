package com.manchesterdigital;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestIntroduction {

    @Test
    public void testThatABankAccountTakesAnInputWhenDeposited() {
    }

    @Test
    public void shouldTakeInputWhenDeposited() {
    }

    // BDD STYLE: Business Driven Development
    @Test
    public void givenBankAccountWhenInputThenDeposited() {
    }

    @Test
    public void shouldAddTwoNumbers() {
        //Arrange
        int first = 23;
        int second = 23;

        //Act
        int result = first + second;

        //Assert
        Assertions.assertThat(result).isEqualTo(46);
    }
}
