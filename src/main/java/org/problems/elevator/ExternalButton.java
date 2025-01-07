package org.problems.elevator;

public class ExternalButton {
    private ElevatorController controller;
    private ExternalButtonDispatchStrategy externalButtonDispatchStrategy;

    public ExternalButton(ElevatorController controller, ExternalButtonDispatchStrategy externalButtonDispatchStrategy) {
        this.controller = controller;
        this.externalButtonDispatchStrategy = externalButtonDispatchStrategy;
    }

    public void pressButton(String direction, int destinationFloor) {
        System.out.println("External button pressed to go " + direction + ".");
        int currentFloor = controller.getCurrentFloor();
        int targetFloor = currentFloor + (direction.equals("UP") ? 1 : -1);

        externalButtonDispatchStrategy.controlElevator(currentFloor, destinationFloor, direction);


    }
}
