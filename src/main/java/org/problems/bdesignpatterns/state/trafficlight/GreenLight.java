package org.problems.bdesignpatterns.state.trafficlight;

public class GreenLight implements TrafficLightState{
    @Override
    public void next(TrafficLight light) {
        light.setState(new RedLight());
    }

    @Override
    public String getState() {
        return "Green light";
    }
}
