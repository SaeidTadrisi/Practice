package VehicleP;

import VehicleP.Car.Car;
import VehicleP.Car.GearBox;
import org.junit.jupiter.api.Test;

public class Print_All_Information {
    @Test
    void print_all_information() {

        Vehicle alfa = new Car("Alpha Romeo", GearBox.AUTOMATIC, 90);
        Vehicle bmw = new MotorCycle("BMW", GearBox.MANUAL, 0);
        Vehicle cruise = new Ship("Cruise", GearBox.AUTOMATIC, 2000);

        Vehicle [] vehicles = {alfa, bmw, cruise};

        PrintAllInformation printAllInformation = new PrintAllInformation(vehicles);

        String vehiclesInformation = printAllInformation.execute();

        System.out.println(vehiclesInformation);

    }
}
