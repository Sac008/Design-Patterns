package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class LargeSpot extends ParkingSpot{

    public LargeSpot(String spotId , VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return this.getVehicleType() == vehicle.getVehicleType();
    }
}
