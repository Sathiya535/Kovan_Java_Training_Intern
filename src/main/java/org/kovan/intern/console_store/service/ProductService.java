package org.kovan.intern.console_store.service;
import org.kovan.intern.console_store.model.Product;
import java.util.ArrayList;
import java.util.List;
public class ProductService {
    private List<Product>products;
    public ProductService(){
        products=new ArrayList<>();
        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Phone", 20000));
        products.add(new Product(3, "Headphones", 2000));
        products.add(new Product(4, "Keyboard", 1500));


    }
    public void displayProducts(){
        System.out.println("Available Products : ");
        for(Product p : products){
            System.out.println(p.getId()+" - "+p.getName()+" - "+p.getPrice());
        }
    }
    public Product getProductById(int id){
        for(Product p : products){
            if(p.getId()==id){
                return p;
            }
        }
        return null;
    }
}
