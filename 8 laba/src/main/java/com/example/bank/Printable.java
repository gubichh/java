package com.example.bank;

public interface Printable {


    String Information = " Информация ";


    void printDetails();

    default void printHeader() {
        System.out.println(Information);
    }


    static void printFooter() {
        System.out.println("Выполнил Губин Михаил Иванович Т-318");
    }
}
