import com.parkingcost.ParkingCost;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestParkingCostVan {

    @Test
    public void WhenTimeIs0AmAnd5AmCostOfParkingIs300() {
        // Arrange
        Integer result = 0;
        Integer expected = 300 * 2;

        // Act
        result = ParkingCost.calculateParkingCost(0.0, "van");

        //Assert
        Assertions.assertThat(result).isEqualTo(expected);
    }
    @Test
    public void WhenTimeIs5AmAnd10AmCostOfParkingIs350() {

        // Arrange
        Integer result = 0;
        Integer expected = 350*2;

        // Act
        result = ParkingCost.calculateParkingCost(5.0, "van");

        //Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }
    @Test
    public void WhenTimeIs10And15CostOfParkingIs500() {
        // Arrange
        Integer result = 0;
        Integer expected = 500 *2;

        // Act
        result = ParkingCost.calculateParkingCost(10.0, "van");

        //Assert
        Assertions.assertThat(result).isEqualTo(expected);


    }
    @Test
    public void WhenTimeIs15And20CostOfParkingIs700() {

        // Arrange
        Integer result = 0;
        Integer expected = 700*2;

        // Act
        result = ParkingCost.calculateParkingCost(15.0, "van");

        //Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }
    @Test
    public void WhenTimeIs20And24CostOfParkingIs400() {
        // Arrange
        Integer result = 0;
        Integer expected = 400 * 2;


        // Act
        result = ParkingCost.calculateParkingCost(20.0, "van");

        //Assert
        Assertions.assertThat(result).isEqualTo(expected);

    }
}
