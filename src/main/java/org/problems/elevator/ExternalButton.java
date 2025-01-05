package org.problems.elevator;

public class ExternalButton {
    private ElevatorController controller;

    public ExternalButton(ElevatorController controller) {
        this.controller = controller;
    }

    public void pressButton(String direction) {
        System.out.println("External button pressed to go " + direction + ".");
        int currentFloor = controller.getCurrentFloor();
        int targetFloor = currentFloor + (direction.equals("UP") ? 1 : -1);
        if (targetFloor >= 0) {
            controller.acceptNewReq(targetFloor, direction);
        } else {
            System.out.println("Invalid floor request.");
        }
    }
}
