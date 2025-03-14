package com.design.behavioral.strategy;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;
    public CreditCard(String cardNumber){
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Payment Done By CreditCard of :"+amount+"Rs");
    }
}
