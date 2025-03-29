package org.problems.bdesignpatterns.observer;

// Subject Interface
public interface StockMarket {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

