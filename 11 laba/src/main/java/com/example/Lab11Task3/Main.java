package com.example.Lab11Task3;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String inputFile = "text_input.txt";
        String outputFile = "text_filtered.txt";
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите слово для поиска: ");
        String keyword = scanner.nextLine();


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {
            System.out.println("Введите строки текста (пустая строка — завершить ввод):");
            while (true) {
                String line = scanner.nextLine();
                if (line.isEmpty()) break;
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Строки записаны в файл " + inputFile);
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
            return;
        }


        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer2 = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    writer2.write(line);
                    writer2.newLine();
                }
            }
            System.out.println("Строки с заданным словом записаны в файл " + outputFile);
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}
