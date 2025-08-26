package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public abstract class Vehicle {

    String licenseNumber;
    VehicleType vehicleType;


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

}
