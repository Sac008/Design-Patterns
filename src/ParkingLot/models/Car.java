package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String licenseNumber , VehicleType vehicleType) {
        this.licenseNumber = licenseNumber;
        this.vehicleType = vehicleType;
    }
}
