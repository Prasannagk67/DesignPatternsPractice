package com.design.structural.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Payment payment = new AdaptorImpl(new CardPayment());
        payment.payment("prasanna@gmail.com",500);
    }
}
