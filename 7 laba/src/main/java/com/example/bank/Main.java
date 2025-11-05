package com.example.bank;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Алиса", 10000.0, 0.12);
        CurrentAccount current = new CurrentAccount("Боб", 10000.0, 0.06);

        int months = 6;

        double savingsInterest = savings.calculateInterest(months);
        double currentInterest = current.calculateInterest(months);

        System.out.println("Владелец сберегательного счёта: " + savings.getOwner());
        System.out.println("Текущий баланс: " + savings.getBalance() + " руб.");
        System.out.println("Начисленные проценты за " + months + " мес.: "
                + String.format("%.2f", savingsInterest) + " руб.");

        System.out.println();

        System.out.println("Владелец расчётного счёта: " + current.getOwner());
        System.out.println("Текущий баланс: " + current.getBalance() + " руб.");
        System.out.println("Начисленные проценты за " + months + " мес.: "
                + String.format("%.2f", currentInterest) + " руб.");
    }
}
