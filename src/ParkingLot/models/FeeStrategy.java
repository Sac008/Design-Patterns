package ParkingLot.models;

public interface FeeStrategy {

    double calculateFee(ParkingTicket parkingTicket);
}
