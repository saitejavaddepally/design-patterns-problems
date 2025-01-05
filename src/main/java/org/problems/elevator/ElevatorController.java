package org.problems.elevator;

public class ElevatorController {

    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }

    public int getCurrentFloor() {
        return elevatorCar.getCurrentFloor();
    }


    public void acceptNewReq(int floor, String dir) {
        System.out.println("Controller accepting new request to go to floor " + floor + " in direction " + dir + ".");
        elevatorCar.move(floor, dir);
    }
}
