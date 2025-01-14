package org.problems.vendingmachine;

public class DispenseState implements VendingMachineState{

    VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(int amount) {

    }

    @Override
    public void selectItem(Item item) {

    }

    @Override
    public void dispenseItem(Item item) {

    }
}
