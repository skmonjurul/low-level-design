package com.skmonjurul.parkinglot.repo;

import com.skmonjurul.parkinglot.driver.Driver;
import com.skmonjurul.parkinglot.driver.InMemoryDriver;
import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.vehicle.VehicleType;

public class ParkingSpotRepo {

    private Driver<ParkingSpot, String> driver;

    public ParkingSpotRepo (Driver<ParkingSpot, String> driver) {
        this.driver = driver;
    }

    public ParkingSpot getAvailableSpot(String spotType) {
        return driver.findAvailableSpot(spotType);
    }

}
