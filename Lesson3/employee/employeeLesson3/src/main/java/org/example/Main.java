package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Сардро Саркисян", "Manager", "456-7890", 50000, 35);
        employees[1] = new Employee("Джон Смит", "Инженер", "654-3210", 60000, 50);
        employees[2] = new Employee("Майкл Джексон", "Бухгалтер", "123-4567", 45000, 42);
        employees[3] = new Employee("Эмели Блант", "Программист", "555-6666", 55000, 28);
        employees[4] = new Employee("Давид Симонс", "Аналитик", "333-4444", 52000, 55);

        // Отображение информации о сотрудниках
        for (Employee employee : employees) {
            employee.displayInformation();
        }

        // Увеличить зарплату сотрудникам старше 45 лет на $5000
        Employee.increaseSalaryForEmployeesOver(employees, 45, 5000);

        // Отображение информации о сотрудниках после повышения зарплаты
        System.out.println("Отображение информации о сотрудниках после повышения зарплаты:");
        for (Employee employee : employees) {
            employee.displayInformation();
        }

        // Рассчитать и отобразить средний возраст и среднюю зарплату сотрудников
        double averageAge = Employee.averageAge(employees);
        double averageSalary = Employee.averageSalary(employees);
        System.out.println("Средний возвраст сотрудников: " + averageAge);
        System.out.println("Средняя зарплата сотрудников: " + averageSalary);

        // Повышение зарплаты всем, кроме руководителей, на $5000
        Employee.increaseSalaryForNonManagers(employees, 5000);

        // Вывод информации о сотрудниках после повышения зарплаты
        System.out.println("Вывод информации о сотрудниках после повышения зарплаты:");
        for (Employee employee : employees) {
            employee.displayInformation();
        }
    }
}