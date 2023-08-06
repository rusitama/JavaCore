package org.example;

import java.util.ArrayList;
import java.util.List;
class InternetShop {
    private static List<Customer> customers = new ArrayList<>();
    private static List<Product> products = new ArrayList<>();
    private static List<Order> orders = new ArrayList<>();

    static {
        customers.add(new Customer("John Smith", 30, "+123456789"));
        customers.add(new Customer("Alice Johnson", 25, "+987654321"));

        products.add(new Product("Laptop", 1000));
        products.add(new Product("Phone", 500));
        products.add(new Product("Headphones", 100));
        products.add(new Product("Keyboard", 50));
        products.add(new Product("Mouse", 30));
    }

    public static Order makePurchase(String customerName, String productName, int quantity)
            throws CustomerException, ProductException, AmountException {
        Customer customer = null;
        for (Customer c : customers) {
            if (c.getFullName().equals(customerName)) {
                customer = c;
                break;
            }
        }

        if (customer == null) {
            throw new CustomerException("Customer not found");
        }

        Product product = null;
        for (Product p : products) {
            if (p.getName().equals(productName)) {
                product = p;
                break;
            }
        }

        if (product == null) {
            throw new ProductException("Product not found");
        }

        if (quantity <= 0 || quantity > 10) {
            throw new AmountException("Invalid quantity, buying 1 item instead");
        }

        Order order = new Order(customer, product, quantity);
        orders.add(order);
        return order;
    }

    // Public method to access 'orders' list
    public static List<Order> getOrders() {
        return orders;
    }
}
