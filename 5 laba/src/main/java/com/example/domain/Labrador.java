package com.example.domain;

public class Labrador extends Dog {
    private String color;

    public Labrador(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void bark() {
        System.out.println(getName() + " радостно лает!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Окрас: " + color);
    }
}
