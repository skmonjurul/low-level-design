package com.skmonjurul.parkinglot;

import com.skmonjurul.parkinglot.vehicle.Vehicle;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private List<EntryGate> entranceGateList;
    private List<ExitGate> exitGateList;
    private List<ParkingFloor> parkingFloorList;

    private static ParkingLot instance;

    private ParkingLot(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static ParkingLot getInstance(String name, String address) {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot(name, address);
                }
            }
        }
        return instance;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle, EntryGate entryGate) {
        // todo may be we can get entry gate id
        // then we need to loop through the list to find the entry gate
        return entryGate.getParkingTicket(vehicle);
    }


    public void addEntryGate(EntryGate entryGate) {
        entranceGateList.add(entryGate);
    }

    public void addExitGate(ExitGate exitGate) {
        exitGateList.add(exitGate);
    }

    public void addParkingFloor(ParkingFloor parkingFloor) {
        parkingFloorList.add(parkingFloor);
    }


}
