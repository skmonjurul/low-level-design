package com.skmonjurul.parkinglot;

import com.skmonjurul.parkinglot.spot.ParkingSpotType;

import java.util.concurrent.atomic.AtomicInteger;

public class ParkingDisplayBoard {

    private Integer id;
    private AtomicInteger largeSpotCount;
    private AtomicInteger motorbikeSpotCount;
    private AtomicInteger compactSpotCount;
    private AtomicInteger handicappedSpotCount;
    private AtomicInteger electricSpotCount;

    public ParkingDisplayBoard(int id) {
        this.id = id;
        largeSpotCount = new AtomicInteger(0);
        motorbikeSpotCount = new AtomicInteger(0);
        compactSpotCount = new AtomicInteger(0);
        handicappedSpotCount = new AtomicInteger(0);
        electricSpotCount = new AtomicInteger(0);
    }

    public Integer getId() {
        return id;
    }

    public void incrementCount(ParkingSpotType parkingSpotType) {
        switch (parkingSpotType) {
            case COMPACT:
                compactSpotCount.incrementAndGet();
                break;
            case HANDICAPPED:
                handicappedSpotCount.incrementAndGet();
                break;
            case MOTORBIKE:
                motorbikeSpotCount.incrementAndGet();
                break;
            case ELECTRIC:
                electricSpotCount.incrementAndGet();
                break;
            case LARGE:
                largeSpotCount.incrementAndGet();
                break;
            default:
                // todo throw error
        }
    }



    public void decrementCount(ParkingSpotType parkingSpotType) {
        switch (parkingSpotType) {
            case COMPACT:
                compactSpotCount.decrementAndGet();
                break;
            case HANDICAPPED:
                handicappedSpotCount.decrementAndGet();
                break;
            case MOTORBIKE:
                motorbikeSpotCount.decrementAndGet();
                break;
            case ELECTRIC:
                electricSpotCount.decrementAndGet();
                break;
            case LARGE:
                largeSpotCount.decrementAndGet();
                break;
            default:
                // todo throw error
        }
    }


    public void display(String message) {
        System.out.println(message);
    }

    public void showEmptySpotNumber() {
        StringBuilder message = new StringBuilder();

        message.append("\n")
                .append("Handicapped: ")
                .append(handicappedSpotCount.get())
                .append("\n")
                .append("Compact: ")
                .append(compactSpotCount.get())
                .append("\n")
                .append("Large: ")
                .append(largeSpotCount.get())
                .append("\n")
                .append("Motorbike: ")
                .append(motorbikeSpotCount.get())
                .append("\n")
                .append("Electric: ")
                .append(electricSpotCount.get());

        display(message.toString());
    }


}
