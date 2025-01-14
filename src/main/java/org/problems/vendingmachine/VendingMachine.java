package org.problems.vendingmachine;

public class VendingMachine {

    private VendingMachineState dispenseMoneyState;
    private VendingMachineState hasMoneyState;
    private VendingMachineState idleState;
    private VendingMachineState outOfStockState;

    private VendingMachineState currentState;

    public VendingMachine(){
        idleState = new IdleState(this);
        hasMoneyState = new HasMoneyState(this);
        dispenseMoneyState = new DispenseState(this);

        currentState = idleState;
    }

    public void setState(VendingMachineState vendingMachineState){
        currentState = vendingMachineState;
    }

    public VendingMachineState getDispenseMoneyState() {
        return dispenseMoneyState;
    }

    public VendingMachineState getHasMoneyState() {
        return hasMoneyState;
    }

    public VendingMachineState getIdleState() {
        return idleState;
    }

    public VendingMachineState getOutOfStockState() {
        return outOfStockState;
    }
}
