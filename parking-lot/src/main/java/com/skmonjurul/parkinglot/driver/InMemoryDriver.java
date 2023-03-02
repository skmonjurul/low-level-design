package com.skmonjurul.parkinglot.driver;

import com.skmonjurul.parkinglot.ParkingFloor;
import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.spot.ParkingSpotStatus;
import com.skmonjurul.parkinglot.spot.ParkingSpotType;
import com.skmonjurul.parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class InMemoryDriver implements Driver<ParkingSpot, String>{

    private List<ParkingSpot> spotList = new ArrayList<>();

    @Override
    public void save(ParkingSpot t) {
        spotList.add(t);
    }

    @Override
    public ParkingSpot findById(String number) {
        for (ParkingSpot ps : spotList) {
            if (ps.getNumber().equals(number)) return ps;
        }

        return null;
    }

    @Override
    public ParkingSpot findAvailableSpot(String spotType) {
        ParkingSpot parkingSpot = null;
        for (ParkingSpot ps : spotList) {
            if(ps.isParkingSpotFree() && ps.getParkingSpotType().equals(spotType)) {
                return ps;
            }
        }

        return null;
    }

}
