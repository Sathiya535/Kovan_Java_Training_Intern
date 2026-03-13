package org.kovan.intern.console_store;

import org.junit.jupiter.api.Test;
import org.kovan.intern.console_store.model.Product;
import org.kovan.intern.console_store.service.CartService;

import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    void testAddProductToCart() {

        CartService cartService = new CartService();

        Product product = new Product(1, "Laptop", 50000);

        cartService.addToCart(product);

        assertEquals(1, cartService.getCart().getItems().size());
    }

    @Test
    void testCalculateTotal() {

        CartService cartService = new CartService();

        cartService.addToCart(new Product(1, "Laptop", 50000));
        cartService.addToCart(new Product(2, "Phone", 20000));

        double total = cartService.calculateTotal();

        assertEquals(70000, total);
    }

}