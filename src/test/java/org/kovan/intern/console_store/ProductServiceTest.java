package org.kovan.intern.console_store;

import org.junit.jupiter.api.Test;
import org.kovan.intern.console_store.model.Product;
import org.kovan.intern.console_store.service.ProductService;

import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Test
    void testGetProductById() {

        ProductService productService = new ProductService();

        Product product = productService.getProductById(1);

        assertNotNull(product);
    }

    @Test
    void testInvalidProduct() {

        ProductService productService = new ProductService();

        Product product = productService.getProductById(99);

        assertNull(product);
    }

}