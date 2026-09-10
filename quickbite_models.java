package com.quickbite.models;

import java.util.Date;
import java.util.List;

public class Customer {
    private String customerId;
    private String fullName;
    private String email;
    private String phone;
    private String passwordHash;

    public boolean register() {
        return true;
    }

    public boolean login() {
        return true;
    }

    public Order placeOrder() {
        return new Order();
    }
}

public class Order {
    private String orderId;
    private Date orderDate;
    private String status;
    private double totalAmount;
    private List<OrderItem> items;

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }
}

public class OrderItem {
    private String itemId;
    private int quantity;
    private double unitPrice;

    public double getSubtotal() {
        return this.quantity * this.unitPrice;
    }
}

public class MenuItem {
    private String dishId;
    private String dishName;
    private double price;
    private int stockQuantity;

    public void updateStock(int qty) {
        this.stockQuantity += qty;
    }
}