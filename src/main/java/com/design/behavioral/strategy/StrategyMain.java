package com.design.behavioral.strategy;

public class StrategyMain {
    public static void main(String[] args){
        PaymentContext paymentContext = new PaymentContext();
        paymentContext.setPaymentStrategy(new UpiPayment("1234567@ybl"));
        paymentContext.payAmount(800);
    }
}
