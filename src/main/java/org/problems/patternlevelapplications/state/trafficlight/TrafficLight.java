package org.problems.patternlevelapplications.state.trafficlight;

public class TrafficLight {
    private TrafficLightState state;

    public TrafficLight(){
        this.state = new RedLight();
    }

    public void setState(TrafficLightState state){
        this.state = state;
    }

    public void next(){
        state.next(this);
    }

    public String getState() {
        return state.getState();
    }
}
