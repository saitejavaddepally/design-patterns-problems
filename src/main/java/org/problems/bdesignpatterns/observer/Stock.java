package org.problems.bdesignpatterns.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
class Stock implements StockMarket {
    private String symbol;
    private double price;
    private List<Observer> observers;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
        observers = new ArrayList<>();
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(symbol, price);
        }
    }
}
