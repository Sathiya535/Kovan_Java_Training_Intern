package org.kovan.intern.the_pro_stack.database_basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleJDBCExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String username = "root";
        String password = "1234";

        try {
            // Get Connection
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully!");

            // Create Statement
            Statement stmt = con.createStatement();

            //  Execute Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            // Process Result
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                System.out.println(id + " " + name);
            }

            // Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
