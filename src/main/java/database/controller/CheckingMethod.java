package database.controller;

import database.connection.SingletonConnection;
import database.util.Print;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CheckingMethod {

    public static SingletonConnection connection;

    public void runChecking() {
//        boolean checkingConnection = false;
//        try {
//            checkingConnection = new DatabaseConnection().isConnected();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        new Print().printConnectionStatus(checkingConnection);
//
//        System.out.println(System.getenv("USERNAME"));
//        System.out.println(System.getenv("PASSWORD"));

        connection = SingletonConnection.getInstance();
    }
}
