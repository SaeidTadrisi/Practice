package Vehicle;

import Vehicle.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Car_Test {

    @Test
    void carTest() {
        Car bmw = new Car("BMW");
        bmw.vehicleIsSafe();
        bmw.vehicleIsTurnedOn();
        boolean bmwMoving = bmw.isMoving();
        Assertions.assertTrue(bmwMoving);
    }


}
