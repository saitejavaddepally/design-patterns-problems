package org.problems.parkinglot;

public class Ticket {
    private long entryTime;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(long entryTime, Vehicle vehicle, ParkingSpot spot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.spot = spot;
    }

    public long getEntryTime() {
        return entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return spot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "entryTime=" + entryTime +
                ", vehicle=" + vehicle +
                ", spot=" + spot +
                '}';
    }
}
