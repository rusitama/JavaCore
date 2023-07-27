package org.example;

public class Employee {
    private String fullName;
    private String position;
    private String phoneNumber;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String phoneNumber, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Метод вывода всей доступной информации об объекте
    public void displayInformation() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Позиция: " + position);
        System.out.println("Телефонный номер: " + phoneNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возвраст: " + age);
        System.out.println();
    }

    // Метод для повышения зарплаты сотрудникам старше определенного возраста
    public void increaseSalaryForEmployeesOver(int ageThreshold, double raiseAmount) {
        if (this.age > ageThreshold) {
            this.salary += raiseAmount;
        }
    }

    // Статический метод для повышения зарплаты всем сотрудникам старше определенного возраста
    public static void increaseSalaryForEmployeesOver(Employee[] employees, int ageThreshold, double raiseAmount) {
        for (Employee employee : employees) {
            employee.increaseSalaryForEmployeesOver(ageThreshold, raiseAmount);
        }
    }

    // Метод для вычисления среднего возраста сотрудников
    public static double averageAge(Employee[] employees) {
        int totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.age;
        }
        return (double) totalAge / employees.length;
    }

    // Метод для вычисления средней зарплаты сотрудников
    public static double averageSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        return totalSalary / employees.length;
    }

    // Метод повышения зарплаты
    public void increaseSalary(double raiseAmount) {
        this.salary += raiseAmount;
    }

    // Метод для повышения зарплаты всем сотрудникам, кроме руководителей
    public static void increaseSalaryForNonManagers(Employee[] employees, double raiseAmount) {
        for (Employee employee : employees) {
            // Проверяем, является ли сотрудник руководителем
            if (!(employee instanceof Manager)) {
                employee.increaseSalary(raiseAmount);
            }
        }
    }
}