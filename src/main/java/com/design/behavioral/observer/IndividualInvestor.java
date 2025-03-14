package com.design.behavioral.observer;

public class IndividualInvestor implements Investor{
    private String name;
    public IndividualInvestor(String name) {
        this.name = name;
    }
    @Override
    public void update(double stockPrice) {
        System.out.println("Investor " + name + " notified. New stock price: $" + stockPrice);
    }
}
