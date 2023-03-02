package com.skmonjurul.parkinglot;

import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class ParkingTicket {
    private int id;
    private LocalDateTime created_at;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
    private static AtomicInteger counter = new AtomicInteger(0);

    public ParkingTicket(ParkingSpot parkingSpot, Vehicle vehicle) {
        this.id = counter.incrementAndGet();
        this.created_at = LocalDateTime.now();
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
