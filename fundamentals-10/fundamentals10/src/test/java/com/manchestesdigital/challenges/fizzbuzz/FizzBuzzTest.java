package com.manchestesdigital.challenges.fizzbuzz;

import org.assertj.core.api.Assertions;
import org.junit.Test;

    public class FizzBuzzTest {

        @Test
        public void ifGiven1Returns1() {
            Integer input = 1;
            String expectedResult = "1";

            String result = FizzBuzz.generate(input);

            Assertions.assertThat(result).isEqualTo(expectedResult);
        }

        @Test
        public void ifGivenMultipleOf3ReturnsFizz() {
            Integer input = 3;
            String expected = "Fizz";

            String result = FizzBuzz.generate(input);

            Assertions.assertThat(result).isEqualTo(expected);
        }
    }

