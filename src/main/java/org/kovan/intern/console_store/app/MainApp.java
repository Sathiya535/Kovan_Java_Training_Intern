package org.kovan.intern.console_store.app;

import org.kovan.intern.console_store.model.Product;
import org.kovan.intern.console_store.service.*;
import org.kovan.intern.console_store.model.Order;
import org.kovan.intern.console_store.service.OrderService;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductService productService = new ProductService();
        CartService cartService = new CartService();
        OrderService orderService = new OrderService();

        while (true) {

            System.out.println("=== Console E-Commerce Store ===");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    productService.displayProducts();
                    break;

                case 2:

                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    Product product = productService.getProductById(id);
                    cartService.addToCart(product);

                    break;

                case 3:
                    cartService.viewCart();
                    break;

                case 4:

                    double total = cartService.calculateTotal();

                    System.out.println("Total Amount: ₹" + total);

                    System.out.println("Select Payment Method:");
                    System.out.println("1. UPI");
                    System.out.println("2. Card");

                    int paymentChoice = sc.nextInt();

                    PaymentMethod payment;

                    if (paymentChoice == 1) {
                        payment = new UPIPayment();
                    } else {
                        payment = new CardPayment();
                    }

                    payment.pay(total);
                    Order order = new Order(1, cartService.getCart().getItems(), total);
                    orderService.saveOrder(order);

                    break;

                case 5:
                    System.out.println("Thank you for using the store!");
                    return;

                default:
                    System.out.println("Invalid choice!");

            }

        }

    }
}