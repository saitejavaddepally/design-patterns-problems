package org.problems.parkinglot;

import java.util.List;

public class ParkingSpotManager {
    private List<ParkingSpot> parkingSpots;
    private ParkingStrategy parkingStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot assignSpot(Vehicle vehicle) {
        ParkingSpot spot = parkingStrategy.findParkingSpot(parkingSpots, vehicle);
        if (spot != null) {
            spot.parkVehicle(vehicle);
        }
        return spot;
    }

    public void releaseSpot(ParkingSpot spot) {
        spot.removeVehicle();
    }

}
