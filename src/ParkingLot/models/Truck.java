package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String licenseNumber , VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }

}
