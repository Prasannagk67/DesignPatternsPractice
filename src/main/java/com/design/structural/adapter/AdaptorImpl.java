package com.design.structural.adapter;

public class AdaptorImpl implements Payment {
    private CardPayment cardPayment;
    public AdaptorImpl (CardPayment cardPayment){
        this.cardPayment = cardPayment;
    }
    @Override
    public void payment(String account, double amount) {
        cardPayment.makePayment(account,amount);
    }
}
