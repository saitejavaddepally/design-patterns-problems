package org.problems.parkinglot;

class EntryGate {
    private ParkingSpotManager parkingSpotManager;

    public EntryGate(ParkingSpotManager parkingSpotManager) {
        this.parkingSpotManager = parkingSpotManager;
    }

    public Ticket generateTicket(Vehicle vehicle) {
        ParkingSpot spot = parkingSpotManager.assignSpot(vehicle);
        if (spot == null) {
            System.out.println("No parking spot available for vehicle: " + vehicle.getVehicleNo());
            return null;
        }
        long entryTime = System.currentTimeMillis();
        return new Ticket(entryTime, vehicle, spot);
    }
}