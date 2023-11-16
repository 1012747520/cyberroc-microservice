package com.example.cyberPunk.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectionTest {

    public static void main(String[] args) {
        String url = "jdbc:mysql://120.79.254.225:3306/mysql";
        String username = "root";
        String password = "84737866CRy";

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // Execute a query
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM cyberpunk.dishes";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process the results
            while (resultSet.next()) {
                // Do something with the data
            }

            // Close the resources
            resultSet.close();
            statement.close();
            connection.close();

            System.out.println("Database connection test successful!");
        } catch (Exception e) {
            // Handle the exception if the connection fails
            e.printStackTrace();
            System.out.println("Database connection test failed!");
        }
    }
}
