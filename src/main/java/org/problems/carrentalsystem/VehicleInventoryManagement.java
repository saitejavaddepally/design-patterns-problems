package org.problems.carrentalsystem;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
    static VehicleInventoryManagement vehicleInventoryManagement;

    public void addVehicle(VehicleType vehicleType) {

        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType);
        System.out.println("Adding vehicle " + vehicle.getVehicleType());
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAvailableVehicles() {
        return vehicles;
    }

    public void reserveVehicle(Vehicle vehicle) {
        Optional<Vehicle> vehicle2 = vehicles.stream()
                .filter(vehicle1 -> vehicle.getVehicleId() == vehicle1.getVehicleId()).
                findFirst();

        if (vehicle2.isPresent() && vehicle2.get().isAvailable()) {
            System.out.println("Reserving vehicle " + vehicle2.get().getVehicleId());
        } else if (vehicle2.isPresent() && !vehicle2.get().isAvailable()) {
            System.out.println("Vehicle " + vehicle2.get().getVehicleId() + "is not available for booking");
        } else {
            System.out.println("No vehicle of type " + vehicle.getVehicleId() + " is found!");
        }
    }

}
