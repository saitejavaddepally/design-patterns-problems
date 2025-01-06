package org.problems.carrentalsystem;

public class Store {

    int storeId;
    Location location;
    VehicleInventoryManagement vehicleInventoryManagement;


    public Store(int storeId, Location location) {
        this.storeId = storeId;
        this.location = location;
        vehicleInventoryManagement = new VehicleInventoryManagement();
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }
}
