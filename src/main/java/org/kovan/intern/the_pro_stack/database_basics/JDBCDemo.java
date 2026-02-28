package org.kovan.intern.the_pro_stack.database_basics;

import java.sql.*;

public class JDBCDemo {

    public static void main(String[] args) {

        String url = "jdbc:h2:./testdb";  // local database file
        String username = "sa"; //sa->System Administrator ->default username for H2 database.
        String password = "";

        try (Connection connection =
                     DriverManager.getConnection(url, username, password)) {

            System.out.println("Connected to database!");

            //   Create Table
            String createTableSQL = """
                    CREATE TABLE IF NOT EXISTS Users (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100),
                        email VARCHAR(100)
                    )
                    """;

            Statement statement = connection.createStatement();
            statement.execute(createTableSQL);
            System.out.println("Table created!");

            //2. Insert User (Using PreparedStatement)
            String insertSQL =
                    "INSERT INTO Users (name, email) VALUES (?, ?)";

            PreparedStatement ps =
                    connection.prepareStatement(insertSQL);

            ps.setString(1, "Sathiya");
            ps.setString(2, "sathiya@email.com");

            ps.executeUpdate();
            System.out.println("User inserted!");

            //3. Select Users
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