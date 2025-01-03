package org.problems.parkinglot;

import java.util.List;

public class NearestParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.getType() == vehicle.getVehicleType() && spot.isAvailable()) {
                return spot;
            }
        }
        return null;
    }
}
