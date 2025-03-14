package com.design.creational.factory;

public class CreditCard implements Payment{
    @Override
    public void payment(double amount) {
        System.out.println("Credit Card :"+amount);
    }
}
