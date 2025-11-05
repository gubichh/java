package com.example;

import com.example.domain.*;

public class DogTest {
    public static void main(String[] args) {
        Bulldog b = new Bulldog("Брут", 5, "Англия");
        Labrador l = new Labrador("Лаки", 3, "Золотистый");
        Husky h = new Husky("Снежок", 4, 28.5);

        b.showInfo();
        b.bark();
        System.out.println();

        l.showInfo();
        l.bark();
        System.out.println();

        h.showInfo();
        h.bark();
    }
}
