package com.design.creational.builder;

public class LoanMain {
    public static void main(String[] args){
        Loan homeLoan = new Loan.LoanBuilder("Home Loan",500000).build();
        System.out.println(homeLoan);
        Loan carLoan = new Loan.LoanBuilder("Car Loan",9000000)
                .setInterestRate(7.5)
                .setTenure(60)
                .build();
        System.out.println(carLoan);
        Loan personalLoan = new Loan.LoanBuilder("Personal Loan",60000000)
                .setInterestRate(9.8)
                .setTenure(90)
                .setProcessingFee(800)
                .build();
        System.out.println(personalLoan);
    }
}
