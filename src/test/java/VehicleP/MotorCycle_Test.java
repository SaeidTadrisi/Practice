package VehicleP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorCycle_Test {

    @Test
    void motorCycleTest() {
        MotorCycle rex = new MotorCycle("Rex");
        rex.vehicleIsTurnedOn();
        rex.vehicleIsSafe();
        boolean rexMoving = rex.isMoving();
        Assertions.assertTrue(rexMoving);
    }
}
