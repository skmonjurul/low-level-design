package com.skmonjurul.parkinglot.vehicle;

import com.skmonjurul.parkinglot.ParkingTicket;

public abstract class Vehicle {
    protected String licenseNumber;
    protected final VehicleType vehicleType;
    protected ParkingTicket parkingTicket;

    public Vehicle(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void assignTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }
}
