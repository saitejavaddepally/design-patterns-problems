package org.problems.elevator;

public class OddDispatchStrategy implements ExternalButtonDispatchStrategy{

    ElevatorController controller;

    public OddDispatchStrategy(ElevatorController controller){
        this.controller = controller;
    }

    @Override
    public void controlElevator(int currentFloor, int destinationFloor, String direction) {

        // some logic to control the elevator
        if (destinationFloor >= 0) {
            controller.acceptNewReq(destinationFloor, direction);
        } else {
            System.out.println("Invalid floor request.");
        }
    }
}
