package com.example.Task1;

public class Bus extends Vehicle {
    public Bus(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(getName() + " (автобус) поехал по маршруту!");
    }
}
