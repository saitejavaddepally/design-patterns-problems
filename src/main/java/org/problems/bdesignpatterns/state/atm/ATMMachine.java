package org.problems.bdesignpatterns.state.atm;

public class ATMMachine {

    ATMState noCardState;
    ATMState hasCardState;
    ATMState outOfServiceState;
    ATMState authenticatedState;

    private ATMState currentState;
    private int cashInMachine;

    public ATMMachine(int initialCash) {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        authenticatedState = new AuthenticatedState(this);
        outOfServiceState = new OutOfServiceState();

        currentState = noCardState;
        cashInMachine = initialCash;

    }

    public void setState(ATMState atmState){
        this.currentState = atmState;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getOutOfServiceState() {
        return outOfServiceState;
    }

    public ATMState getAuthenticatedState() {
        return authenticatedState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount) {
        currentState.withDrawCash(amount);
    }
}
