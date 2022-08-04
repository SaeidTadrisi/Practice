package Vehicle;

public class Ship extends Vehicle {

    private String brand;
    private String typeOfGearBox;
    private long trunkValue;

    public Ship (String brand){
        this.brand = brand;
    }

    public Ship (String brand, String typeOfGearBox, long trunkValue){
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

    public String getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public long getTrunkValue() {
        return trunkValue;
    }
}
