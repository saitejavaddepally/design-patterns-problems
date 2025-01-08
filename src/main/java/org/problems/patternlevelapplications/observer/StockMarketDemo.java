package org.problems.patternlevelapplications.observer;

// Demo
public class StockMarketDemo {
    public static void main(String[] args) {
        Stock googleStock = new Stock("GOOGL", 1500.00);

        StockTrader alice = new StockTrader("Alice");
        StockTrader bob = new StockTrader("Bob");

        googleStock.addObserver(alice);
        googleStock.addObserver(bob);

        googleStock.setPrice(1520.00); // Notify all observers
        googleStock.removeObserver(bob);
        googleStock.setPrice(1540.00); // Notify remaining observer
    }
}
