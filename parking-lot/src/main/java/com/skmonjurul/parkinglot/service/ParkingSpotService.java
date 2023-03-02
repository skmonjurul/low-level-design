package com.skmonjurul.parkinglot.service;

import com.skmonjurul.parkinglot.repo.ParkingSpotRepo;
import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.spot.ParkingSpotType;
import com.skmonjurul.parkinglot.vehicle.VehicleType;

public class ParkingSpotService {

    ParkingSpotRepo parkingSpotRepo;

    public ParkingSpotService(ParkingSpotRepo parkingSpotRepo) {
        this.parkingSpotRepo = parkingSpotRepo;
    }



    public ParkingSpot getAvailableSpot(VehicleType vehicleType) {
        return parkingSpotRepo.getAvailableSpot(getSpotType(vehicleType));
    }

    private String getSpotType(VehicleType vehicleType) {
        if (vehicleType.equals(VehicleType.CAR)) return ParkingSpotType.COMPACT.toString();
        else if (vehicleType.equals(VehicleType.MOTORBIKE)) {
            return ParkingSpotType.MOTORBIKE.toString();
        }

        return null;
    }
}
