package com.design.creational.factory;

public class FactoryMain {
    public static void main(String[] args){
        Payment paymentType = PaymentFactory.getPaymentType("CreditCard");
        paymentType.payment(100);
    }
}
