package org.problems.patternlevelapplications.state.trafficlight;

public class TrafficLightDemo {
    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();

        for (int i = 0; i < 6; i++) {
            System.out.println("Current state : " + light.getState());
            light.next();
        }
    }
}
