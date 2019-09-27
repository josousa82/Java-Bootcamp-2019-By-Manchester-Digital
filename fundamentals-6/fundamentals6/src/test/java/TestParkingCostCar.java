import com.parkingcost.ParkingCost;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TestParkingCostCar {

    @Test
    public void WhenTimeIs0AmAnd5AmCostOfParkingIs300() {
        // Arrange
        Integer result = 0;
        Integer expected = 300;

        // Act
        result = ParkingCost.calculateParkingCost(0.0, "car");

        //Assert
        Assertions.assertThat(result).isEqualTo(300);
    }
    @Test
    public void WhenTimeIs5AmAnd10AmCostOfParkingIs350() {

        // Arrange
        Integer result = 0;
        Integer expected = 300;

        // Act
        result = ParkingCost.calculateParkingCost(5.0, "car");

        //Assert
        Assertions.assertThat(result).isEqualTo(350);

    }
    @Test
    public void WhenTimeIs10And15CostOfParkingIs500() {
        // Arrange
        Integer result = 0;
        Integer expected = 300;

        // Act
        result = ParkingCost.calculateParkingCost(10.0, "car");

        //Assert
        Assertions.assertThat(result).isEqualTo(500);


    }
    @Test
    public void WhenTimeIs15And20CostOfParkingIs700() {

        // Arrange
        Integer result = 0;
        Integer expected = 300;

        // Act
        result = ParkingCost.calculateParkingCost(15.0, "car");

        //Assert
        Assertions.assertThat(result).isEqualTo(700);

    }
    @Test
    public void WhenTimeIs20And24CostOfParkingIs400() {
        // Arrange
        Integer result = 0;
        Integer expected = 300;

        // Act
        result = ParkingCost.calculateParkingCost(20.0, "car");

        //Assert
        Assertions.assertThat(result).isEqualTo(400);

    }

}