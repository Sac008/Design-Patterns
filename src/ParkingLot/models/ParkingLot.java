package ParkingLot.models;

import java.util.*;

public class ParkingLot {

    List<ParkingLevel> parkingLevels = new ArrayList<>();
    FeeStrategy feeStrategy;
    Map<String , ParkingTicket> activeTickets = new HashMap<>();

    public ParkingLot(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public void addParkingLevel(ParkingLevel parkingLevel) {
        parkingLevels.add(parkingLevel);
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public synchronized ParkingTicket parkVehicle(Vehicle vehicle) throws Exception {
        for(ParkingLevel level : parkingLevels) {
            Optional<ParkingSpot> spots = level.getAvailableSpots(vehicle);
            if(spots.isPresent()) {
                ParkingSpot parkingSpot = spots.get();
                if(parkingSpot.assignVehicle()) {
                    ParkingTicket ticket = new ParkingTicket(vehicle, parkingSpot);
                    activeTickets.put(vehicle.getLicenseNumber() , ticket);
                    return ticket;
                }
            }
        }
        throw new Exception("No Available spot for vehicle: " + vehicle.getVehicleType());
    }

    public synchronized double unparkVehicle(String licenseNumber) throws Exception {
        ParkingTicket ticket = activeTickets.get(licenseNumber);
        if(ticket == null) throw new Exception("Ticket not found");
        ticket.getParkingSpot().removeVehicle();
        ticket.setExitTimeStamp(new Date().getTime());
        return feeStrategy.calculateFee(ticket);
    }

}
