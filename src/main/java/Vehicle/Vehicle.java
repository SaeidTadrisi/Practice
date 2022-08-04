package Vehicle;

public abstract class Vehicle {

    boolean safety;
    boolean start;

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

    public abstract String getTypeOfGearBox();

    public abstract long getTrunkValue();
}
