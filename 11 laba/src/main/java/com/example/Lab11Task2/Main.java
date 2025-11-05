package com.example.Lab11Task2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "temperatures.txt";
        Scanner scanner = new Scanner(System.in);


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Введите 15 значений температуры воздуха:");
            for (int i = 0; i < 15; i++) {
                System.out.print((i + 1) + ") ");
                double temp = scanner.nextDouble();
                writer.write(temp + "\n");
            }
            System.out.println("\nТемпературы успешно записаны в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
            return;
        }


        double sum = 0;
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    sum += Double.parseDouble(line);
                    count++;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка формата числа: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Средняя температура: %.2f°C%n", average);
        } else {
            System.out.println("Не удалось рассчитать среднюю температуру (файл пуст).");
        }
    }
}
