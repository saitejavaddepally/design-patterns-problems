package org.problems.parkinglot;

public interface CostComputation {
    double calculateCost(long duration);
}


class TwoWheelerCostComputation implements CostComputation {
    @Override
    public double calculateCost(long duration) {
        return duration * 10; // Example: Rs.10/hour
    }
}

class FourWheelerCostComputation implements CostComputation {
    @Override
    public double calculateCost(long duration) {
        return duration * 20; // Example: Rs.20/hour
    }
}