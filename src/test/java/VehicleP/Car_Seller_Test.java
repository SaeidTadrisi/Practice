package VehicleP;

import VehicleP.Car.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Car_Seller_Test {

    @Test
    void numberOfSold() {

        Seller adam = new Seller();
        adam.sold();
        adam.sold();
        adam.sold();

        Seller josh = new Seller();
        josh.sold();
        josh.sold();

        int numberOfSoldCar = Car.numberOfSoldCar;

        Assertions.assertEquals(5, numberOfSoldCar );
    }
}
