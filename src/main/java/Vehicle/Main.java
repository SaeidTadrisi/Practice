package Vehicle;

import Vehicle.Car;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }

        String brand = args[0];
        String typeOfGearBox = args[1];
        String trunkValue = args[2];
        Car car = new Car(brand, typeOfGearBox, Integer.parseInt(trunkValue));

        System.out.println(car.getBrands());
        System.out.println(car.getTrunkValue());
        System.out.println(car.typeOfGearBox());
        boolean moving = car.isMoving();
        if (moving){
            System.out.println("Vehicle.Car Is Moving");
        }else
            System.out.println("Vehicle.Car Is Parked");

        Scanner input = new Scanner(System.in);

        System.out.println("Which Brand Do You Need? ");
        brand = input.nextLine();

        System.out.println("What Type Of Vehicle.GearBox You Like?");
        typeOfGearBox = input.nextLine();

        System.out.println("How Much Capacity You Need For Vehicle.Trunk? ");
        trunkValue = input.nextLine();

        System.out.println("You Requested " + brand + " With " + typeOfGearBox + " Vehicle.GearBox And " + trunkValue + " Litr Vehicle.Trunk Value");
    }


}
