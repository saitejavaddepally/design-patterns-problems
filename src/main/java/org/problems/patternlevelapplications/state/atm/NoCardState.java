package org.problems.patternlevelapplications.state.atm;

public class NoCardState implements ATMState{

    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted. Please enter your PIN.");
        atmMachine.setState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void enterPin(int pin) {

    }

    @Override
    public void withDrawCash(int amount) {

    }
}
