package org.problems.carrentalsystem;

import java.util.Date;

class Reservation {
    private int reservationId;
    private User user;
    private Vehicle vehicle;
    private Date bookingDate;
    private Location bookedFrom;
    private Location bookedTo;
    private Bill bill;

    public Reservation(int reservationId, User user, Vehicle vehicle, Date bookingDate, Location bookedFrom, Location bookedTo) {
        this.reservationId = reservationId;
        this.user = user;
        this.vehicle = vehicle;
        this.bookingDate = bookingDate;
        this.bookedFrom = bookedFrom;
        this.bookedTo = bookedTo;
    }

    public void payBill() {
        if (bill != null) {
            System.out.println("Bill paid for reservation ID " + reservationId);
        } else {
            System.out.println("No bill to pay.");
        }
    }
}