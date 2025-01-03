package org.problems.parkinglot;

import org.problems.parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {

    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        List<ParkingSpot> spots = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            spots.add(new ParkingSpot(i, VehicleType.TWO_WHEELER));
            spots.add(new ParkingSpot(i + 5, VehicleType.FOUR_WHEELER));
        }

        if (vehicleType == VehicleType.FOUR_WHEELER){
            // Create Parking Spots
            return new FourWheelerParkingSpotManager(spots, new NearestParkingStrategy());
        }

        else if (vehicleType == VehicleType.TWO_WHEELER){
            return new TwoWheelerParkingSpotManager(spots, new NearestParkingStrategy());
        }

        return null;
    }
}
