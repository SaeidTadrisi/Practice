package VehicleP;

public class PrintVehicleNames {

    String brand;
    Vehicle[] vehicles = {};

    public PrintVehicleNames (Vehicle [] vehicles){
        this.vehicles = vehicles;
    }

    public String execute (){
        String vehicleNames = "";

        for (int pointer=0 ; pointer < vehicles.length ; pointer++) {
            Vehicle vehicle = vehicles[pointer];

            if (pointer < vehicles.length - 1){
                vehicleNames = vehicleNames + vehicle.getBrands() + "-";
            }else
                vehicleNames = vehicleNames + vehicle.getBrands() ;

        }
        return vehicleNames;
    }
}
