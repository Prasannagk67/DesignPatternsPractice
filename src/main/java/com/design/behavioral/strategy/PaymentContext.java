package com.design.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    public void payAmount(double amount){
        if(paymentStrategy == null){
            System.out.println("Please select a Payment Method");
        }else{
            paymentStrategy.pay(amount);
        }
    }
}
