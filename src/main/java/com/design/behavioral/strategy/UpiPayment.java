package com.design.behavioral.strategy;

public class UpiPayment implements PaymentStrategy{
    private String upiId;
    public UpiPayment(String upiId){
        this.upiId=upiId;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Payment Done by UpiId of :"+amount+"Rs");
    }
}
