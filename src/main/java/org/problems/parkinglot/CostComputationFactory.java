package org.problems.parkinglot;

import org.problems.parkinglot.enums.VehicleType;

public class CostComputationFactory {

    public static CostComputation getCostComputationFactory(VehicleType vehicleType){

        if (vehicleType == VehicleType.FOUR_WHEELER){
            return new FourWheelerCostComputation();
        }

        else if (vehicleType == VehicleType.TWO_WHEELER){
            return new TwoWheelerCostComputation();
        }

        return null;
    }
}
