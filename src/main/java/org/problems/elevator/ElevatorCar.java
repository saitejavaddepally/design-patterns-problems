package org.problems.elevator;

class ElevatorCar {
    private int id;
    private Display display;
    private int currentFloor;
    private String direction;
    private String status;

    public ElevatorCar(int id, Display display, int currentFloor, String direction, String status) {
        this.id = id;
        this.display = display;
        this.currentFloor = currentFloor;
        this.direction = direction;
        this.status = status;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int destinationFloor, String dir) {
        System.out.println("Elevator " + id + " moving from floor " + currentFloor + " to floor " + destinationFloor + " in direction " + dir + ".");
        this.currentFloor = destinationFloor;
        this.direction = dir;
        this.status = "MOVING";
        display.updateDisplay(currentFloor, direction);
        this.status = "STOPPED";
    }
}