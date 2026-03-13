package org.kovan.intern.console_store.model;

import java.util.List;

public class Order {
    private int orderId;
    private List<Product>product;
    private double totalPrice;
    public Order(int orderId,List<Product>product,double totalPrice){
        this.orderId=orderId;
        this.product=product;
        this.totalPrice=totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProduct() {
        return product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
