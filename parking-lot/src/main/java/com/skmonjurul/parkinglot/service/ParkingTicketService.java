package com.skmonjurul.parkinglot.service;

import com.skmonjurul.parkinglot.ParkingTicket;
import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.vehicle.Vehicle;
import com.skmonjurul.parkinglot.vehicle.VehicleType;

public class ParkingTicketService {
    private ParkingSpotService parkingSpotService;

    public ParkingTicketService(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }

    public ParkingTicket getTicket(Vehicle vehicle) {
        ParkingSpot parkingSpot = parkingSpotService.getAvailableSpot(vehicle.getVehicleType());
        return new ParkingTicket(parkingSpot, vehicle);
    }
}
