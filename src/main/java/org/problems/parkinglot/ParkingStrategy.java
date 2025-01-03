package org.problems.parkinglot;

import java.util.*;

public interface ParkingStrategy {
    ParkingSpot findParkingSpot(List<ParkingSpot> parkingSpots, Vehicle vehicle);
}
