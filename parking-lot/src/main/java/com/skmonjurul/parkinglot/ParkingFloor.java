package com.skmonjurul.parkinglot;

import com.skmonjurul.parkinglot.spot.*;
import com.skmonjurul.parkinglot.vehicle.Vehicle;

import java.util.List;
import java.util.Map;

public class ParkingFloor {

    private Integer floorNumber;
    private ParkingDisplayBoard parkingDisplayBoard;
    private List<ParkingSpot> parkingSpotList;

    Map<String, ParkingSpot> handicappedSpots;
    Map<String, ParkingSpot> compactSpots;
    Map<String, ParkingSpot> largeSpots;
    Map<String, ParkingSpot> motorbikeSpots;
    Map<String, ParkingSpot> electricSpots;


    public void addParkingSpot(ParkingSpot parkingSpot) {
        switch (parkingSpot.getParkingSpotType()) {
            case LARGE:
                largeSpots.put(parkingSpot.getNumber(), parkingSpot);
                break;
            case COMPACT:
                compactSpots.put(parkingSpot.getNumber(), parkingSpot);
                break;
            case ELECTRIC:
                electricSpots.put(parkingSpot.getNumber(), parkingSpot);
                break;
            case MOTORBIKE:
                motorbikeSpots.put(parkingSpot.getNumber(), parkingSpot);
                break;
            case HANDICAPPED:
                handicappedSpots.put(parkingSpot.getNumber(), parkingSpot);
                break;
            default:
                // todo throw exception
        }
    }


    public void assignVehicleToSpot(Vehicle vehicle, ParkingSpot parkingSpot) {
        // assign the vehicle if the spot is free
        // after assigning mark the spot occupied
        parkingSpot.assignVehicle(vehicle);

        parkingDisplayBoard.decrementCount(parkingSpot.getParkingSpotType());
        // todo for display we can make it observer pattern
        // todo parkingDisplay board will only be responsible for displaying
        // todo the free spot
        // todo all the spot count need to stay in this class only
        parkingDisplayBoard.showEmptySpotNumber();
    }

    public void removeVehicleFromSpot(ParkingSpot parkingSpot) {
        // remove the vehicle
        // mark the spot available
        parkingSpot.removeVehicle();
        parkingDisplayBoard.incrementCount(parkingSpot.getParkingSpotType());
        // todo for display we can make it observer pattern
        parkingDisplayBoard.showEmptySpotNumber();
    }
}
