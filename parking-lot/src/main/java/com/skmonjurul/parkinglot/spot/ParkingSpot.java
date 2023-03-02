package com.skmonjurul.parkinglot.spot;

import com.skmonjurul.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    protected String number;
    protected final ParkingSpotType parkingSpotType;
    protected ParkingSpotStatus parkingSpotStatus;
    protected Vehicle vehicle;

    public ParkingSpot(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
        parkingSpotStatus = ParkingSpotStatus.FREE;
    }

    public void assignVehicle(Vehicle vehicle) {
        if (!this.parkingSpotStatus.equals(ParkingSpotStatus.FREE))
            // todo throw exception

        this.vehicle = vehicle;
        parkingSpotStatus = ParkingSpotStatus.OCCUPIED;
    }

    public void removeVehicle() {
        this.vehicle = null;
        parkingSpotStatus = ParkingSpotStatus.FREE;
    }

    public void changeSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public boolean isParkingSpotFree() {
        return parkingSpotStatus.equals(ParkingSpotStatus.FREE);
    }

    public String getNumber() {
        return number;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
