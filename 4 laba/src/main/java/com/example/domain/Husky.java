package com.example.domain;

public class Husky extends Dog {
    private double weight;

    public Husky(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    @Override
    public void bark() {
        System.out.println(getName() + " воет как северный волк!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight + " кг");
    }
}
