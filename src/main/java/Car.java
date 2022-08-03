public class Car extends Vehicle implements Trunk, GearBox {

    private boolean doors;
    private String brand;
    private long trunkValue;
    private String typeOfGearBox;
    static int numberOfSoldCar;


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

    public Car (String brand, String typeOfGearBox, long trunkValue){
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


    public String getTypeOfGearBox() {
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

    public String typeOfGearBox() {
        return typeOfGearBox;
    }

}
