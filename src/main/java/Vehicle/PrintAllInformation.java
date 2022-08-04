package Vehicle;

public class PrintAllInformation {

    Vehicle[] vehicles;

    public PrintAllInformation(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public String execute() {
        String vehicleInformation = "";
        for (int pointer = 0; pointer < vehicles.length; pointer++) {
            Vehicle vehicle = vehicles[pointer];
            if (pointer < vehicles.length - 1) {
                vehicleInformation = vehicleInformation + vehicle.getClass() + "," + vehicle.getBrands() + "," + vehicle.getTypeOfGearBox() + "," + vehicle.getTrunkValue() + "-";
            } else
                vehicleInformation = vehicleInformation + vehicle.getClass() + "," + vehicle.getBrands() + "," + vehicle.getTypeOfGearBox() + "," + vehicle.getTrunkValue();
            }
        return vehicleInformation;
    }
    }
