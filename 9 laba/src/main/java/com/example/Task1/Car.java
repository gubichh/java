package com.example.Task1;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(getName() + " (автомобиль) завёл двигатель и поехал!");
    }
}
