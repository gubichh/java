package com.example.domain;

public class Bulldog extends Dog {
    private String country;

    public Bulldog(String name, int age, String country) {
        super(name, age);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void bark() {
        System.out.println(getName() + " рычит по-бульдожьи!");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Страна происхождения: " + country);
    }
}
