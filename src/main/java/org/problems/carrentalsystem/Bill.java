package org.problems.carrentalsystem;

class Bill {
    private int reservationId;
    private User user;
    private Vehicle vehicle;

    public Bill(int reservationId, User user, Vehicle vehicle) {
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
    }

    public void generateBill() {
        System.out.println("Bill generated for reservation ID " + reservationId);
    }
}