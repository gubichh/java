package com.example.bank;

public abstract class BankAccount {
    protected final String owner;
    protected double balance;
    protected final double annualRate;

    protected BankAccount(String owner, double balance, double annualRate) {
        this.owner = owner;
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public abstract double calculateInterest(int months);

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
