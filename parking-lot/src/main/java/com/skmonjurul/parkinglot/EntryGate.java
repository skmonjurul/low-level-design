package com.skmonjurul.parkinglot;

import com.skmonjurul.parkinglot.service.ParkingSpotService;
import com.skmonjurul.parkinglot.service.ParkingTicketService;
import com.skmonjurul.parkinglot.spot.ParkingSpot;
import com.skmonjurul.parkinglot.vehicle.Vehicle;

public class EntryGate {

    private int id;
    ParkingTicketService parkingTicketService;

    public EntryGate (ParkingTicketService parkingTicketService) {
        this.parkingTicketService = parkingTicketService;
    }

    public EntryGate(int id) {
        this.id = id;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return parkingTicketService.getTicket(vehicle);
    }


    public int getId() {
        return id;
    }

}
