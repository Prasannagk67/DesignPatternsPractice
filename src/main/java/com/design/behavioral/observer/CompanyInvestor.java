package com.design.behavioral.observer;

public class CompanyInvestor implements Investor{
    private String companyName;
    public CompanyInvestor(String companyName) {
        this.companyName = companyName;
    }
    @Override
    public void update(double stockPrice) {
        System.out.println("Company " + companyName + " notified. New stock price: $" + stockPrice);
    }
}
