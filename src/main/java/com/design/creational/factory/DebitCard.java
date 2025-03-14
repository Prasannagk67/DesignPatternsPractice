package com.design.creational.factory;

public class DebitCard implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Debit Card :"+amount);
    }
}
