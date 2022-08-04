package Vehicle;

import Vehicle.Vehicle;
import org.junit.jupiter.api.Test;

public class Print_All_Information {
    @Test
    void print_all_information() {

        Vehicle alfa = new Car("Alpha Romeo", "Automatic", 90);
        Vehicle bmw = new MotorCycle("BMW", "Manual", 0);
        Vehicle cruise = new Ship("Cruise", "Automatic", 2000);

        Vehicle [] vehicles = {alfa, bmw, cruise};

        PrintAllInformation printAllInformation = new PrintAllInformation(vehicles);

        String vehiclesInformation = printAllInformation.execute();

        System.out.println(vehiclesInformation);

    }
}
