package org.problems.asolidprinciples.isp.bad;

public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot worker is working");
    }

    @Override
    public void eat() {
        // Robot workers do not eat, but we have to implement this method
        throw new UnsupportedOperationException("Robot workers do not eat");
    }
}
