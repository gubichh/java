package com.example.Task3;

public class FixedSalaryEmployee extends Employee {
    private final double monthlySalary;

    public FixedSalaryEmployee(long id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getAverageMonthlySalary() {
        return monthlySalary;
    }
}
