package ParkingLot.models;

import java.util.Date;
import java.util.UUID;

public class ParkingTicket {

    String ticketId;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    final long entryTimeStamp;

    public void setExitTimeStamp(long exitTimeStamp) {
        this.exitTimeStamp = exitTimeStamp;
    }

    long exitTimeStamp;

    public ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketId = UUID.randomUUID().toString();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.entryTimeStamp = new Date().getTime();
    }


    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public long getEntryTimeStamp() {
        return entryTimeStamp;
    }

    public long getExitTimeStamp() {
        return exitTimeStamp;
    }

}
