package com.design.creational.builder;

public class Loan {
    private String type;
    private double amount;
    private double interestRate;
    private int tenure;
    private double processingFee;
    private boolean insurance;

    private Loan (LoanBuilder builder){
        this.type=builder.type;
        this.amount=builder.amount;
        this.interestRate=builder.interestRate;
        this.tenure=builder.tenure;
        this.processingFee=builder.processingFee;
        this.insurance=builder.insurance;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", interestRate=" + interestRate +
                ", tenure=" + tenure +
                ", processingFee=" + processingFee +
                ", insurance=" + insurance +
                '}';
    }

    public static class LoanBuilder{
        private String type;
        private double amount;
        private double interestRate=10.0;
        private int tenure = 2;
        private double processingFee = 1000.0;
        private boolean insurance=false;

        public LoanBuilder(String type,double amount){
            this.type=type;
            this.amount=amount;
        }
        public LoanBuilder setInterestRate(double interestRate){
            this.interestRate=interestRate;
            return this;
        }
        public LoanBuilder setTenure(int tenure){
            this.tenure=tenure;
            return this;
        }
        public LoanBuilder setProcessingFee(double processingFee){
            this.processingFee=processingFee;
            return this;
        }
        public LoanBuilder includeInsurance(){
            this.insurance=true;
            return this;
        }
        public Loan build(){
            return new Loan(this);
        }
    }
}
