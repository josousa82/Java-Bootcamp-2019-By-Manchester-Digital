import com.coddingchallenge.TddCodingChallenge1;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestTddCodingChallenge1 {

    /**
     * - Write a program which return
     *
     * - "fizz" if the number is a multiple of 3,
     * - return "buzz" if its multiple of 5
     * - return "fizzbuzz" if the number is divisible by both 3 and 5.
     * - If the number is not divisible by either 3 or 5 then it should
     *   just return the number itself.
     *
     * - Enhance your program to print out the outcome if provided a range of numbers 1 to 20.
     *
     * For example it should print:
     *
     * 1
     * 2 fizz
     * 4 buzz fizz …
     */

    @Test
    public void testReturnFizzIfInputMultipleOf3() {

        // Arrange
        Integer numberToTest = 9;
        String strReturn = "fizz";
        // Act
        TddCodingChallenge1 testMultiple3 = new TddCodingChallenge1();
        // Assert
        Assertions.assertThat(testMultiple3.calculate(numberToTest)).isEqualTo(strReturn);
    }

    @Test
    public void testReturnFizzIfInputMultipleOf5() {

        // Arrange
        Integer numberToTest = 10;
        String strReturn = "buzz";
        // Act
        TddCodingChallenge1 testMultiple3 = new TddCodingChallenge1();
        // Assert
        Assertions.assertThat(testMultiple3.calculate(numberToTest)).isEqualTo(strReturn);
    }

    @Test
    public void testReturnfizzbuzzIfInputMultipleOf3And5() {

        // Arrange
        Integer numberToTest = 9;
        String strReturn = "fizzbuzz";
        // Act
        TddCodingChallenge1 testMultiple3 = new TddCodingChallenge1();
        // Assert
        Assertions.assertThat(testMultiple3.calculate(numberToTest)).isEqualTo(strReturn);
    }

    @Test
    public void testReturnNumberIfInputIsNotMultipleOf3And5() {

        // Arrange
        Integer numberToTest = 1;
        String strReturn = "1";
        // Act
        TddCodingChallenge1 testMultiple3 = new TddCodingChallenge1();
        // Assert
        Assertions.assertThat(testMultiple3.calculate(numberToTest)).isEqualTo(strReturn);
    }
}
