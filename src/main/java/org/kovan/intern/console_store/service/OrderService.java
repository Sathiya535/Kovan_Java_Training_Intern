package org.kovan.intern.console_store.service;

import com.google.gson.Gson;
import org.kovan.intern.console_store.model.Order;

import java.io.FileWriter;
import java.io.IOException;

public class OrderService {

    public void saveOrder(Order order) {

        Gson gson = new Gson();

        try {

            FileWriter writer = new FileWriter("orders.json", true);

            String json = gson.toJson(order);

            writer.write(json);
            writer.write("\n");

            writer.close();

            System.out.println("Order saved successfully!");

        } catch (IOException e) {

            System.out.println("Error saving order");

        }
    }
}