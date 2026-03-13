package org.kovan.intern.the_pro_stack.database_basics;

import java.sql.*;

public class SQLInjectionProof {

    static String url = "jdbc:mysql://localhost:3306/testdb";
    static String dbUser = "root";
    static String dbPassword = "1234";

    public static void main(String[] args) throws Exception {

        // Malicious input
        String username = "' OR '1'='1";
        String password = "anything";

        System.out.println("---- Using Statement ----");
        loginWithStatement(username, password);

        System.out.println("---- Using PreparedStatement ----");
        loginWithPreparedStatement(username, password);
    }

    //Vulnerable Method
    public static void loginWithStatement(String user, String pass) throws Exception {

        Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM users WHERE name = '" + user +
                "' AND password = '" + pass + "'";

        System.out.println("Executing Query: " + sql);

        ResultSet rs = stmt.executeQuery(sql);

        if (rs.next()) {
            System.out.println("Login Successful (SQL Injection Happened 😱)");
        } else {
            System.out.println("Login Failed");
        }

        con.close();
    }

    //Safe Method
    public static void loginWithPreparedStatement(String user, String pass) throws Exception {

        Connection con = DriverManager.getConnection(url, dbUser, dbPassword);

        String sql = "SELECT * FROM users WHERE name = ? AND password = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, user);
        ps.setString(2, pass);

        System.out.println("Executing Safe Query...");

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed (Safe )");
        }

        con.close();
    }
}