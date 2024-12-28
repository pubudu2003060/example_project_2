package org.example;

import org.example.databaseconfig.DatabaseConnection;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        Connection connection = db.getConnection();

    }
}