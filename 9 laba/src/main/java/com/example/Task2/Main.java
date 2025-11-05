package com.example.Task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов Иван", "A-01", 1, List.of(5, 4, 3, 5)));
        students.add(new Student("Петров Пётр", "A-01", 1, List.of(2, 2, 3, 2)));
        students.add(new Student("Сидорова Анна", "B-02", 2, List.of(4, 4, 5, 5)));
        students.add(new Student("Кузнецов Олег", "C-03", 3, List.of(3, 2, 3, 3)));

        System.out.println("Исходный список студентов:");
        students.forEach(System.out::println);

        System.out.println("\nПосле проверки среднего балла:");
        processStudents(students);
        students.forEach(System.out::println);

        System.out.println("\nСтуденты, обучающиеся на 2 курсе:");
        printStudents(students, 2);
    }


    public static void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            double avg = s.getAverageGrade();

            if (avg < 3) {
                iterator.remove();
            } else {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }


    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}
