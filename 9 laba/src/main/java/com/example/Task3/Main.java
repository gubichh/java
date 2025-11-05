package com.example.Task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> staff = new ArrayList<>();


        staff.add(new FixedSalaryEmployee(101, "Иванов", 1900));
        staff.add(new HourlySalaryEmployee(102, "Петров", 14.5));
        staff.add(new FixedSalaryEmployee(103, "Сидорова", 2100));
        staff.add(new HourlySalaryEmployee(104, "Антонов", 17.2));
        staff.add(new FixedSalaryEmployee(105, "Белова", 2100)); // одинаковая ЗП для проверки вторичной сортировки
        staff.add(new HourlySalaryEmployee(106, "Громов", 11.3));
        staff.add(new FixedSalaryEmployee(107, "Дмитриев", 1500));
        staff.add(new HourlySalaryEmployee(108, "Ершов", 16.0));
        staff.add(new FixedSalaryEmployee(109, "Жуков", 1950));
        staff.add(new HourlySalaryEmployee(110, "Зотов", 21.0));


        staff.sort(
                Comparator.comparingDouble(Employee::getAverageMonthlySalary).reversed()
                        .thenComparing(Employee::getName)
        );


        System.out.println("Полный список (отсортирован):");
        for (Employee e : staff) {
            System.out.printf("ID: %d | %s | %.2f%n",
                    e.getId(), e.getName(), e.getAverageMonthlySalary());
        }


        System.out.println("\nПервые 5 имён:");
        int firstCount = Math.min(5, staff.size());
        for (int i = 0; i < firstCount; i++) {
            System.out.println(staff.get(i).getName());
        }


        System.out.println("\nПоследние 3 ID:");
        int start = Math.max(0, staff.size() - 3);
        for (int i = start; i < staff.size(); i++) {
            System.out.println(staff.get(i).getId());
        }
    }
}
