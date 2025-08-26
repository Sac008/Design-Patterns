package ParkingLot.models;

import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.VehicleType;

import java.util.List;

public class ParkingLotDemo {

    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot(new FlatRateFeeStrategy());


        List<ParkingSpot> parkingSpotFloor1 = List.of(
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.BIKE, "101"),
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.COMPACT, "102"),
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.LARGE, "103")
        );

        List<ParkingSpot> parkingSpotFloor2 = List.of(
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.BIKE , "201"),
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.COMPACT , "202"),
                ParkingSpotFactory.createNewParkingSpot(ParkingSpotType.LARGE , "203")
        );


        // ADD A FLOOR WITH DIFFERENT TYPES OF SPOTS
        ParkingLevel floor1 = new ParkingLevel(1 , parkingSpotFloor1);
        ParkingLevel floor2 = new ParkingLevel(2 , parkingSpotFloor2);

        parkingLot.addParkingLevel(floor1);
        parkingLot.addParkingLevel(floor2);

//        parkingLot.setFeeStrategy(new VehicleBasedFeeStratey());

        Vehicle car1 = new Car("ABC1234" , VehicleType.CAR);
        Vehicle car2 = new Car("DEF0987" , VehicleType.CAR);
        Vehicle truck1 = new Car("MNO234", VehicleType.TRUCK);

//        Park Vehicles
        try {
            ParkingTicket ticket1 = parkingLot.parkVehicle(car1);
            System.out.println("Car 1 parked , Ticket Id: " + ticket1.getTicketId());

            ParkingTicket ticket2 = parkingLot.parkVehicle(car2);
            System.out.println("Car 2 parked , Ticket Id: " + ticket2.getTicketId());

            ParkingTicket ticket3 = parkingLot.parkVehicle(truck1);
            System.out.println("Truck 1 parked , Ticket Id: " + ticket1.getTicketId());

            Vehicle car3 = new Car("UP501234" , VehicleType.CAR);
            parkingLot.parkVehicle(car3);
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

//        Unpark vehicles
        try {
            double fee = parkingLot.unparkVehicle(car1.getLicenseNumber());
            System.out.println("Vehicle: " + car1.getLicenseNumber() + ", Fee: " + fee);
            fee = parkingLot.unparkVehicle("1");
        }

        catch (Exception e) {
            System.out.println("Exception while Parking:  " + e.getMessage());
        }

    }
}
