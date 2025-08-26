package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public abstract class ParkingSpot {

    String spotId;
    boolean isOccupied;
    VehicleType vehicleType;


    public boolean isOccupied() {
        return isOccupied;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean assignVehicle() {
        isOccupied = true;
        return true;
    }

    public void removeVehicle() {
        isOccupied = false;
    }

    public abstract boolean canFitVehicle(Vehicle vehicle);
}
