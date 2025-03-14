package com.design.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        IndividualInvestor investor1 = new IndividualInvestor("Alice");
        IndividualInvestor investor2 = new IndividualInvestor("Bob");
        CompanyInvestor company1 = new CompanyInvestor("XYZ Corp");
        stockMarket.registerObserver(investor1);
        stockMarket.registerObserver(investor2);
        stockMarket.registerObserver(company1);
        stockMarket.setStockPrice(150.75);
        System.out.println("-----");
        stockMarket.setStockPrice(155.50);
        System.out.println("-----");
        stockMarket.removeObserver(investor1);
        stockMarket.setStockPrice(160.00);
    }
}
