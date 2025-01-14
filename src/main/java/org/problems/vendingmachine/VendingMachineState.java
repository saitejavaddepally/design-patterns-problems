package org.problems.vendingmachine;

public interface VendingMachineState {
    void insertMoney(int amount);
    void selectItem(Item item);
    void dispenseItem(Item item);
}
