package org.example;

public class Manager extends Employee {
    public Manager(String fullName, String position, String phoneNumber, double salary, int age) {
        super(fullName, position, phoneNumber, salary, age);
    }
    // В этом классе нет нужды переопределять метод повышения зарплаты,
    // так как руководителю мы не хотим позволять повышать свою зарплату.
}
