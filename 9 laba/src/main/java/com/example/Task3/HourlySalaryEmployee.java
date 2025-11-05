package com.example.Task3;

public class HourlySalaryEmployee extends Employee {
    private final double hourlyRate;

    public HourlySalaryEmployee(long id, String name, double hourlyRate) {
        super(id, name);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double getAverageMonthlySalary() {

        return 20.8 * 8 * hourlyRate;
    }
}
