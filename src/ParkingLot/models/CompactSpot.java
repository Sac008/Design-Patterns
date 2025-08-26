package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class CompactSpot extends ParkingSpot{

    public CompactSpot(String spotId , VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == this.getVehicleType();
    }
}
