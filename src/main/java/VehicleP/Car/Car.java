package VehicleP.Car;
import VehicleP.Trunk;
import VehicleP.GearBox;
import VehicleP.Vehicle;

public class Car extends Vehicle implements Trunk, GearBox {

    private boolean doors;
    private String brand;
    private long trunkValue;
    public VehicleP.Car.GearBox typeOfGearBox;
    public static int numberOfSoldCar;


    public void doorsAreOpen(){
        doors = true;
    }

    public void doorsAreClosed(){
        doors = false;
    }

    public Car () {
    }

    public Car (String brand){
        this.brand = brand;
    }

    public Car (String brand, VehicleP.Car.GearBox typeOfGearBox, long trunkValue){
        this.brand = brand;
        this.typeOfGearBox = typeOfGearBox;
        this.trunkValue = trunkValue;
    }

    public boolean isMoving(){
        if (!doors && start && safety){
            return true;
        }else
            return false;
    }


    public VehicleP.Car.GearBox getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public long getTrunkValue() {
        return trunkValue;
    }

    public String getBrands(){
        return brand;
    }

    public long trunkValue() {
        return trunkValue;
    }

    public VehicleP.Car.GearBox typeOfGearBox() {
        return typeOfGearBox;
    }

}
