package org.problems.elevator;

public interface ExternalButtonDispatchStrategy {
    void controlElevator(int currentFloor, int destinationFloor, String direction);
}
