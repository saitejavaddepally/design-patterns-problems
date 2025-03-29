package org.problems.bdesignpatterns.observer;

// Concrete Observer
class StockTrader implements Observer {
    private String name;

    public StockTrader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(name + " received update: " + stockSymbol + " price is now " + price);
    }
}
