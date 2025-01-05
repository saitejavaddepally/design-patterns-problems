package org.problems.elevator;

// Display Class
class Display {
    private int floor;
    private String direction;

    public Display(int floor, String direction) {
        this.floor = floor;
        this.direction = direction;
    }

    public void updateDisplay(int floor, String direction) {
        this.floor = floor;
        this.direction = direction;
        showStatus();
    }

    public void showStatus() {
        System.out.println("Display: Floor " + floor + ", Direction: " + direction);
    }
}