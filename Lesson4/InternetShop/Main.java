package org.example;

import java.util.List;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            InternetShop.makePurchase("John Smith", "Laptop", 3);
            InternetShop.makePurchase("Alice Johnson", "Phone", 12); // Will throw AmountException
            InternetShop.makePurchase("Bob Marley", "Tablet", 2); // Will throw CustomerException
            InternetShop.makePurchase("John Smith", "Tablet", -1); // Will throw AmountException
        } catch (CustomerException ce) {
            System.out.println("Customer Error: " + ce.getMessage());
        } catch (ProductException pe) {
            System.out.println("Product Error: " + pe.getMessage());
        } catch (AmountException ae) {
            System.out.println("Amount Error: " + ae.getMessage());
        }

        // Accessing 'orders' list using the public method
        List<Order> orders = InternetShop.getOrders();
        // Вывод итогового количества совершенных покупок
        System.out.println("Total Purchases: " + orders.size());
    }
}