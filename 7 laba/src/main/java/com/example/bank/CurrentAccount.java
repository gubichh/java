package com.example.bank;

public class CurrentAccount extends BankAccount {
    private final double bonusFactor;

    public CurrentAccount(String owner, double balance, double annualRate, double bonusFactor) {
        super(owner, balance, annualRate);
        this.bonusFactor = bonusFactor;
    }

    public CurrentAccount(String owner, double balance, double annualRate) {
        this(owner, balance, annualRate, 0.25);
    }

    @Override
    public double calculateInterest(int months) {
        double m = annualRate / 12.0;
        return balance * m * months * bonusFactor;
    }
}
