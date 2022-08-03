import org.junit.jupiter.api.Test;

public class Print_Vehicle_Name_Test {

    @Test
    void print_vehicle_brands() {

        Vehicle bmw = new Car("BMW", "Manual", 100);
        Vehicle fiat = new Car("Fiat", "Automatic", 120);
        Vehicle volvo = new Car("Volvo", "Automatic", 150);
        Vehicle rex = new MotorCycle("Rex");
        Vehicle cruise = new Ship("Cruise");


        Vehicle [] vehicles = {bmw, fiat, volvo, rex, cruise};
        PrintVehicleNames printVehicleNames = new PrintVehicleNames(vehicles);
        String vehicleNames = printVehicleNames.execute();
        System.out.println(vehicleNames);
    }

}
