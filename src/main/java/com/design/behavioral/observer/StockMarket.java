package com.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
    private List<Investor> investors = new ArrayList<>();
    private double stockPrice;
    public void setStockPrice(double stockPrice){
        this.stockPrice=stockPrice;
        notifyObserver();
    }
    public double getStockPrice(){
        return stockPrice;
    }
    @Override
    public void registerObserver(Investor investor) {
        investors.add(investor);
    }

    @Override
    public void removeObserver(Investor investor) {
        investors.remove(investor);
    }

    @Override
    public void notifyObserver() {
        for (Investor investor : investors){
            investor.update(stockPrice);
        }
    }
}
