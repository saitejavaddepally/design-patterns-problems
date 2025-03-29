package org.problems.bdesignpatterns.state.atm;

class OutOfServiceState implements ATMState {
    public void insertCard() {
        System.out.println("ATM is out of service.");
    }

    public void ejectCard() {
        System.out.println("No card to eject.");
    }

    public void enterPin(int pin) {
        System.out.println("ATM is out of service.");
    }

    public void withDrawCash(int amount) {
        System.out.println("ATM is out of service.");
    }
}