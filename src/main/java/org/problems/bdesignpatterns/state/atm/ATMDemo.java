package org.problems.bdesignpatterns.state.atm;

public class ATMDemo {
    public static void main(String[] args) {
        ATMMachine atm = new ATMMachine(5000); // Initialize ATM with 5000 cash

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(2000);
        atm.ejectCard();

        atm.insertCard();
        atm.enterPin(9999); // Incorrect PIN
        atm.ejectCard();

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(4000); // Exceeds remaining balance
        atm.withdrawCash(1000);
    }
}
