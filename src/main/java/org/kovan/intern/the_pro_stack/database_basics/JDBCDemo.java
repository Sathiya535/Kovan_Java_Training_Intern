package org.kovan.intern.the_pro_stack.database_basics;

import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {

    public static void main(String[] args) {
//Store file in current folder
        String url = "jdbc:h2:./testdb";

        //Default for H2:
        //
        //Username = sa
        //
        //Password = empty
        String username = "sa";
        String password = "";
//Creates physical connection to database.
        try (Connection connection =
                     DriverManager.getConnection(url, username, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to database!");

            // Create Table
            String createTableSQL = """
                    CREATE TABLE IF NOT EXISTS Users (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        email VARCHAR(100)
                    )
                    """;
//Executes normal SQL queries
            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table ready!");

            //
            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            //
            String insertSQL =
                    "INSERT INTO Users (name, email) VALUES (?, ?)";
//Executes parameterized SQL safely.
            PreparedStatement ps =
                    connection.prepareStatement(insertSQL);

            ps.setString(1, name);
            ps.setString(2, email);

            ps.executeUpdate();
            System.out.println("User inserted!");

            //Fetch data from table.
            String selectSQL = "SELECT * FROM Users";
            ResultSet rs = statement.executeQuery(selectSQL);

            System.out.println("Users in Database:");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("email")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}