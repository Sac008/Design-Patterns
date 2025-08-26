package ParkingLot.models;

import ParkingLot.enums.VehicleType;

public class BikeSpot extends ParkingSpot{

    public BikeSpot(String spotId , VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
    }
    @Override
    public boolean canFitVehicle(Vehicle vehicle) {
        return vehicle.getVehicleType() == this.getVehicleType();
    }
}
