package org.problems.carrentalsystem;

public class Location {
    String address;
    String city;
    String pinCode;

    public Location(String address, String city, String pinCode) {
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }
}
