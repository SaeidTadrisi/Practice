package VehicleP;

import VehicleP.Car.Car;

public class Seller {

    public static String listOfSeller [] = new String [5];

    static {
        listOfSeller [0] = "Josh";
        listOfSeller [1] = "David";
    }
    public void sold () {
        Car.numberOfSoldCar ++;
    }
}
