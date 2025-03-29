package org.problems.bdesignpatterns.state.trafficlight;

public class RedLight implements  TrafficLightState{
    @Override
    public void next(TrafficLight light) {
        light.setState(new GreenLight());
    }

    @Override
    public String getState() {
        return "Red Light";
    }
}
