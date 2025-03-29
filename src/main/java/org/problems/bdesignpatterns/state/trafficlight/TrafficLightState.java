package org.problems.bdesignpatterns.state.trafficlight;

public interface TrafficLightState {
    void next(TrafficLight light);
    String getState();
}


