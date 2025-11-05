package com.example.Task1;

public class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(getName() + " (мотоцикл) завёл мотор и тронулся!");
    }
}
