package org.kovan.intern.console_store.service;

import org.kovan.intern.console_store.model.Cart;
import org.kovan.intern.console_store.model.Product;

public class CartService {

    private Cart cart;

    public CartService() {
        cart = new Cart();
    }

    public void addToCart(Product product) {

        if (product != null) {
            cart.addProduct(product);
            System.out.println(product.getName() + " added to cart.");
        } else {
            System.out.println("Product not found.");
        }

    }

    public void viewCart() {

        if (cart.getItems().isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        System.out.println("Your Cart:");

        for (Product p : cart.getItems()) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }

    }

    public double calculateTotal() {

        double total = 0;

        for (Product p : cart.getItems()) {
            total += p.getPrice();
        }

        return total;
    }

    public Cart getCart() {
        return cart;
    }
}