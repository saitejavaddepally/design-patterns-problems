package org.problems.bdesignpatterns.state.atm;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void enterPin(int pin);
    void withDrawCash(int amount);
}
