package org.problems.patternlevelapplications.state.trafficlight;

public interface TrafficLightState {
    void next(TrafficLight light);
    String getState();
}


