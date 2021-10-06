package database.controller;

import database.connection.SingletonConnection;
import database.model.DatabaseVariable;

import java.sql.PreparedStatement;

public class DatabaseController {

    SingletonConnection connection = SingletonConnection.getInstance();
    PreparedStatement preparedStatement;
    String query = "SELECT * FROM blogDatabase";
    String querySelectAllFrom = "SELECT * FROM ";

    public DatabaseController() throws Exception {
        preparedStatement.execute();
    }

    public Object selectAll() {
        String query = "SELECT * FROM " + DatabaseVariable.REGISTERED_USER;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(querySelectAllFrom + DatabaseVariable.REGISTERED_USER);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
