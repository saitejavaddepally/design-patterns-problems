package org.problems.patternlevelapplications.state.atm;

class AuthenticatedState implements ATMState {
    private ATMMachine atmMachine;

    public AuthenticatedState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("A card is already inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("PIN already entered.");
    }

    @Override
    public void withDrawCash(int amount) {
        if (amount <= atmMachine.getCashInMachine()) {
            System.out.println("Withdrawing " + amount + " cash.");
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - amount);

            if (atmMachine.getCashInMachine() <= 0) {
                System.out.println("ATM is out of cash.");
                atmMachine.setState(atmMachine.getOutOfServiceState());
            } else {
                System.out.println("Transaction complete. Please eject your card.");
            }
        } else {
            System.out.println("Insufficient cash in the ATM.");
        }
    }
}