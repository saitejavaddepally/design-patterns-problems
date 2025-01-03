package org.problems.parkinglot;

import org.problems.parkinglot.enums.VehicleType;

public class ParkingSpot {
    private int id;
    private VehicleType type;
    private boolean isOccupied;
    private Vehicle vehicle;

    public ParkingSpot(int id, VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public VehicleType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "id=" + id +
                ", type=" + type +
                ", isOccupied=" + isOccupied +
                ", vehicle=" + vehicle +
                '}';
    }
}
