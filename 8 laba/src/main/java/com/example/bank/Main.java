package com.example.bank;

public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("Алиса", 10000.0, 0.12);
        BankAccount current = new CurrentAccount("Боб", 10000.0, 0.06);

        int months = 6;

        System.out.println("Сберегательный счёт:");
        System.out.println("Владелец: " + savings.getOwner());
        System.out.println("Баланс: " + savings.getBalance() + " руб.");
        System.out.println("Проценты за " + months + " мес.: "
                + String.format("%.2f", savings.calculateInterest(months)) + " руб.");
        System.out.println();
        System.out.println("Расчётный счёт:");
        System.out.println("Владелец: " + current.getOwner());
        System.out.println("Баланс: " + current.getBalance() + " руб.");
        System.out.println("Проценты за " + months + " мес.: "
                + String.format("%.2f", current.calculateInterest(months)) + " руб.");
    }
}
