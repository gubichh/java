package com.example.Lab11Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "info.txt";


        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("ФИО: Губин Михаил Иванович\n");
            writer.write("Группа: Т-318\n");
            writer.write("Специальность: Разработка и соправождение информационных технологий\n");
            writer.write("Колледж бизнеса и права\n");
            System.out.println("Информация успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }


        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("\nСведения о файле:");
            System.out.println("Имя файла: " + file.getName());
            System.out.println("Путь: " + file.getAbsolutePath());
            System.out.println("Размер: " + file.length() + " байт");
            System.out.println("Можно читать: " + file.canRead());
            System.out.println("Можно записывать: " + file.canWrite());
            System.out.println("Файл существует: " + file.exists());
        } else {
            System.out.println("Файл не найден!");
        }


        System.out.println("\nСодержимое файла:");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
