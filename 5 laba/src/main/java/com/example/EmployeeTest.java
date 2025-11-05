package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setEmpId(101);
        emp.setName("Василий Михальцевич");
        emp.setSalary(10_35.27);
        emp.setSsn("0-1-2-34-56-78457340573405737406");

        System.out.println("Employee ID/Идентификатор сотрудника: " + emp.getEmpId());
        System.out.println("Employee Name/Имя сотрудника: " + emp.getName());
        System.out.println("Employee Soc Sec/Номер социального страхования сотрудника: " + emp.getSsn());
        System.out.println("Employee salary/Зарплата сотрудника: " + emp.getSalary() + " руб.");
    }
}
