package org.problems.vendingmachine;

public class HasMoneyState implements VendingMachineState{

    VendingMachine vendingMachine;
    public HasMoneyState(VendingMachine vendingMachine){
        vendingMachine.setState(vendingMachine.getDispenseMoneyState());
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
