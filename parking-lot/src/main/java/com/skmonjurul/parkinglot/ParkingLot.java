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

    private ParkingLot() {}

    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    public ParkingTicket getParkingTicket(Vehicle vehicle) {
        return null;
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
