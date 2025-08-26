package ParkingLot.models;

import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.VehicleType;

public class ParkingSpotFactory {

    public static ParkingSpot createNewParkingSpot(ParkingSpotType spotType , String spotId) {
        return switch(spotType) {
            case BIKE -> new BikeSpot(spotId , VehicleType.BIKE);
            case LARGE -> new LargeSpot(spotId , VehicleType.TRUCK);
            case COMPACT -> new CompactSpot(spotId , VehicleType.CAR);
            default -> throw new IllegalArgumentException("Invalid spotType");
        };
    }
}
