package org.problems.parkinglot;

import org.problems.parkinglot.enums.VehicleType;

public class Vehicle {

    int vehicleNo;
    VehicleType vehicleType;

    public Vehicle(int vehicleNo, VehicleType vehicleType) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleNo=" + vehicleNo +
                ", vehicleType=" + vehicleType +
                '}';
    }
}
