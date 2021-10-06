package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private Connection connection;

    public DatabaseConnection() {
        if (connect() != null) {
            connection = connect();
        }
    }

    Connection connect() {
        String url = "jdbc:mysql://localhost:3306/" + System.getenv("PROJECT_NAME") +
                "?" +
                "useUniCode=yes" +
                "&" +
                "characterEncoding=UTF-8";
        Properties properties = new Properties();
        properties.put("user", System.getenv("USERNAME"));
        properties.put("password", System.getenv("PASSWORD"));

        try {
            return DriverManager.getConnection(url, properties);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean isConnected() {
        return connection != null;
    }
}
