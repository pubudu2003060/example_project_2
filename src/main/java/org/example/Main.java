package org.example;

import org.example.databaseconfig.DatabaseConnection;
import org.example.models.Customer;
import org.example.models.Orders;
import org.example.operations.CustomerOperaation;

import java.sql.Connection;

public class Main {

    public static void main(String[] args) {



        DatabaseConnection db = new DatabaseConnection();
        Connection connection = db.getConnection();

        Customer customer = new Customer();
        customer.setName("pubudu");
        customer.setEmail("madushanp835@gmail.com");
        customer.setPassword("pubudu123");
        customer.setAddress("yaya 2/20 uwa tissapura");
        customer.setPhone(762691330);

        CustomerOperaation customerOperaation = new CustomerOperaation();
        customerOperaation.addCustomer(customer,connection);

    }
}