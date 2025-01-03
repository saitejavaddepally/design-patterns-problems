package org.problems.parkinglot;

class ExitGate {
    private ParkingSpotManager parkingSpotManager;
    private CostComputation costComputation;

    public ExitGate(ParkingSpotManager parkingSpotManager, CostComputation costComputation) {
        this.parkingSpotManager = parkingSpotManager;
        this.costComputation = costComputation;
    }

    public void processExit(Ticket ticket) {
        long exitTime = System.currentTimeMillis();
        long duration = 100; // Convert to hours
        double cost = costComputation.calculateCost(duration);
        System.out.println("Total cost for vehicle " + ticket.getVehicle().getVehicleNo() + ": Rs." + cost);
        parkingSpotManager.releaseSpot(ticket.getSpot());
    }
}

