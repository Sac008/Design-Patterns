package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class Bike extends Vehicle {

    public Bike(String licenseNumber , VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }
}
