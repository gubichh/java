package com.example.Task3;

public abstract class Employee {
    private final long id;
    private final String name;

    protected Employee(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() { return id; }
    public String getName() { return name; }


    public abstract double getAverageMonthlySalary();
}
