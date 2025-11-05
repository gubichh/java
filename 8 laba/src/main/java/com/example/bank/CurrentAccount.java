package com.example.bank;

public class CurrentAccount implements BankAccount, Printable {
    private final String owner;
    private final double balance;
    private final double annualRate;

    public CurrentAccount(String owner, double balance, double annualRate) {
        this.owner = owner;
        this.balance = balance;
        this.annualRate = annualRate;
    }

    @Override
    public double calculateInterest(int months) {
        double m = annualRate / 12.0;
        return balance * m * months;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }


    @Override
    public void printDetails() {
        printHeader();
        System.out.println("Владелец: " + owner);
        System.out.println("Баланс: " + balance);
        System.out.println("Годовая ставка: " + annualRate);
        Printable.printFooter();
    }
}
