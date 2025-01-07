package org.problems.elevator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    public static void main(String[] args) {
        Display display = new Display(0, "IDLE");
        ElevatorCar elevator = new ElevatorCar(1, display, 0, "IDLE", "STOPPED");

        ElevatorController controller = new ElevatorController(elevator);

        InternalButton internalButton = new InternalButton(controller);
        ExternalButton externalButton = new ExternalButton(controller, new OddDispatchStrategy(controller));

        Floor floor1 = new Floor(1, externalButton);
        Floor floor2 = new Floor(2, externalButton);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);

        Building building = new Building(floors, controller);

        // Simulate pressing buttons
        floor1.pressButton("UP", 2);
        internalButton.pressButton(2);
        controller.acceptNewReq(1, "DOWN");
    }
}
