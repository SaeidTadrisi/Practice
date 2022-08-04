package Vehicle;

import Vehicle.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vehicle_Test {
    @Test
    void car_test() {
        Vehicle bmw = new Car("BMW");
        bmw.vehicleIsSafe();
        bmw.vehicleIsTurnedOn();
        bmw.isMoving();
    }

    @Test
    void motorcycle_test() {
        Vehicle rex = new MotorCycle("Rex");
        rex.vehicleIsSafe();
        rex.vehicleIsTurnedOn();
        boolean rexMoving = rex.isMoving();
        Assertions.assertTrue(rexMoving);
    }

}
