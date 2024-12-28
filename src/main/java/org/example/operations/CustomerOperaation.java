package org.example.operations;

import org.example.models.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerOperaation {

    public void addCustomer(Customer customer, Connection connection) {
        String sql = "insert into customer (name,email,password,address,phonenumber) values (?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

            preparedStatement.setString(1, customer.getName());
            preparedStatement.setString(2, customer.getEmail());
            preparedStatement.setString(3, customer.getPassword());
            preparedStatement.setString(4, customer.getAddress());
            preparedStatement.setInt(5, customer.getPhone());

            int res = preparedStatement.executeUpdate();

            if (res > 0) {
                System.out.println("Customer added successfully");
            } else {
                System.out.println("Customer not added");
            }
        } catch (SQLException e) {
            System.out.println("Custemer add error " + e.getMessage());
        }
    }

}
