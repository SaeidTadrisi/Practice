package VehicleP;

import VehicleP.Car.GearBox;

public abstract class Vehicle {

    public boolean safety;
    public boolean start;

    public void vehicleIsSafe(){
        safety = true;
    }

    public void vehicleIsNotSafe(){
        safety = false;
    }

    public void vehicleIsTurnedOn(){
        start = true;
    }

    public void vehicleIsTurnedOff(){
        start = false;
    }

    public abstract boolean isMoving();

    public abstract String getBrands();

    public abstract GearBox getTypeOfGearBox();

    public abstract long getTrunkValue();
}
