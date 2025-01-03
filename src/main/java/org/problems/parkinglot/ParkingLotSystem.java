package org.problems.parkinglot;

import org.problems.parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotSystem {
    public static void main(String[] args) {

        VehicleType currentVehicleEntry = VehicleType.FOUR_WHEELER;

        // Create Manager and Strategies
        ParkingSpotManager manager = ParkingSpotManagerFactory.getParkingSpotManager(currentVehicleEntry);
        EntryGate entryGate = new EntryGate(manager);

        // cost computation
        CostComputation costComputation = CostComputationFactory.getCostComputationFactory(currentVehicleEntry);
        ExitGate exitGate = new ExitGate(manager, costComputation);

        // Vehicle enters
        Vehicle bike = new Vehicle(101, currentVehicleEntry);
        Ticket ticket = entryGate.generateTicket(bike);

        System.out.println("Your assigned spot and ticket is " + ticket);

        // Vehicle exits
        if (ticket != null) {
            exitGate.processExit(ticket);
        }
    }
}
