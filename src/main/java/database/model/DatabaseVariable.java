package database.model;

import database.connection.SingletonConnection;

import java.sql.PreparedStatement;

public class DatabaseVariable {

    SingletonConnection connection = SingletonConnection.getInstance();

    public static final String REGISTERED_USER = "registereduser";


}
