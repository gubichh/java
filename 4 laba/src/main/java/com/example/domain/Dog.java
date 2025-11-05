package com.example.domain;

public class Dog {
    private String name;
    private int age;

    public Dog() {}

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public void bark() {
        System.out.println(name + " лает: Гав-гав!");
    }

    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " лет");
    }
}
