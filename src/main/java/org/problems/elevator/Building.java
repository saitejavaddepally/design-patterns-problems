package org.problems.elevator;

import java.util.List;

public class Building {
    private List<Floor> floors;
    private ElevatorController controller;

    public Building(List<Floor> floors, ElevatorController controller) {
        this.floors = floors;
        this.controller = controller;
    }

    public void selectFloor(int floorId, String direction) {
        System.out.println("Floor " + floorId + " selected.");
        controller.acceptNewReq(floorId, direction);
    }
}
