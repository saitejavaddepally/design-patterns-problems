package org.problems.elevator;

public class Floor {
    private int floorId;
    private ExternalButton button;

    public Floor(int floorId, ExternalButton button) {
        this.floorId = floorId;
        this.button = button;
    }

    public void pressButton(String direction) {
        System.out.println("Button pressed on floor " + floorId + " to go " + direction + ".");
        button.pressButton(direction);
    }
}
