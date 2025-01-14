package org.problems.patternlevelapplications.state.atm;

public class HasCardState implements ATMState{

    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("A card is already inserted. ");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card Ejected");
    }

    @Override
    public void enterPin(int pin) {

        if (pin == 1234){
            System.out.println("Pin Correct, You can now withdraw cash");
        }
        else{
            System.out.println("Enter PIN before withdrawing cash.");
        }
    }

    @Override
    public void withDrawCash(int amount) {
        System.out.println("enter pin before withdrawing cash");
    }
}
