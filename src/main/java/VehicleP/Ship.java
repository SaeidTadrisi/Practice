package VehicleP;

import VehicleP.Car.GearBox;

public class Ship extends Vehicle {

    private String brand;
    private GearBox typeOfGearBox;
    private long trunkValue;

    public Ship (String brand){
        this.brand = brand;
    }

    public Ship (String brand, GearBox typeOfGearBox, long trunkValue){
        this.brand = brand;
        this.typeOfGearBox = typeOfGearBox;
        this.trunkValue = trunkValue;
    }

    public boolean isMoving() {
        if (safety && start) {
            return true;
        } else
            return false;
    }

    public String getBrands() {
        return brand;
    }

    public GearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public long getTrunkValue() {
        return trunkValue;
    }
}
