package com.design.creational.factory;

public class PaymentFactory {
    public static Payment getPaymentType(String type){
        if (type.equalsIgnoreCase("CreditCard")){
            return new CreditCard();
        }else if (type.equalsIgnoreCase("UpiPayment")){
            return new UpiPayment();
        }else if (type.equalsIgnoreCase("DebitCard")){
            return new DebitCard();
        }
        throw new IllegalArgumentException("Invalid Payment Type");
    }
}
