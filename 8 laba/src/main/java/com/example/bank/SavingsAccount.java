package com.example.bank;

public class SavingsAccount implements BankAccount {
    private final String owner;
    private final double balance;
    private final double annualRate;

    public SavingsAccount(String owner, double balance, double annualRate) {
        this.owner = owner;
        this.balance = balance;
        this.annualRate = annualRate;
    }

    @Override
    public double calculateInterest(int months) {
        double m = annualRate / 12.0;
        return balance * (Math.pow(1.0 + m, months) - 1.0);
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
