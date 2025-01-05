package org.problems.elevator;

public class InternalButton {
    private ElevatorController controller;

    public InternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    public void pressButton(int destinationFloor) {
        System.out.println("Internal button pressed for floor " + destinationFloor + ".");
        String direction = controller.getCurrentFloor() < destinationFloor ? "UP" : "DOWN";
        controller.acceptNewReq(destinationFloor, direction);
    }
}
