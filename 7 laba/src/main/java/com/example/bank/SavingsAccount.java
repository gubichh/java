package com.example.bank;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String owner, double balance, double annualRate) {

        super(owner, balance, annualRate);
    }

    @Override
    public double calculateInterest(int months) {
        double m = annualRate / 12.0;
        return balance * (Math.pow(1.0 + m, months) - 1.0);
    }
}
