package com.design.creational.factory;

public class UpiPayment implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Upi Payment :"+amount);
    }
}
