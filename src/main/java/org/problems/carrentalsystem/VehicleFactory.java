package org.problems.carrentalsystem;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType) {

        if (vehicleType == VehicleType.CAR){
            return new Car();
        }
        else if( vehicleType == VehicleType.BIKE){
            return new Bike();
        }
        else {
            throw new IllegalArgumentException("Invalid vehicleType passed " + vehicleType);
        }
    }
}
