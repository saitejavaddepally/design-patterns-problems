package org.problems.parkinglot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager
{
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingStrategy parkingStrategy) {
        super(parkingSpots, parkingStrategy);
    }
}
