package Vehicle;

public class MotorCycle extends Vehicle {

    private String brand;
    private String typeOfGearBox;
    private long trunkValue;

    public MotorCycle (String brand){
        this.brand = brand;
    }

    public MotorCycle (String brand, String typeOfGearBox, long trunkValue){
        this.brand = brand;
        this.typeOfGearBox = typeOfGearBox;
        this.trunkValue = trunkValue;
    }

    public boolean isMoving (){
        if (start && safety){
            return true;
        }else
            return false;
    }

    public String getBrands(){
        return brand;
    }

    public String getTypeOfGearBox() {
        return typeOfGearBox;
    }

    public long getTrunkValue() {
        return trunkValue;
    }
}
