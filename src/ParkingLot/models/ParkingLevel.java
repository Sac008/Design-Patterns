package ParkingLot.models;

import java.util.List;
import java.util.Optional;

public class ParkingLevel {

    int parkingLevel;
    List<ParkingSpot> parkingSpots;

    public ParkingLevel(int parkingLevel, List<ParkingSpot> parkingSpots) {
        this.parkingLevel = parkingLevel;
        this.parkingSpots = parkingSpots;
    }

    synchronized Optional<ParkingSpot> getAvailableSpots(Vehicle vehicle) {
        Optional<ParkingSpot> ps=  parkingSpots.stream().filter(spot -> !spot.isOccupied() && spot.canFitVehicle(vehicle)).findFirst();
        return ps;
//        sout
    }
}
