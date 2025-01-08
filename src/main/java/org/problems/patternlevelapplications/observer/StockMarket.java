package org.problems.patternlevelapplications.observer;

// Subject Interface
public interface StockMarket {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

