package database.connection;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseConnectionTest {

    DatabaseConnection connection = null;

    @Before
    public void init() {
        connection = new DatabaseConnection();
    }

    @Test
    public void connectTest() {
        assertNotNull(new DatabaseConnection().connect());
    }

    @Test
    public void isConnectedTest() {
        String result = String.valueOf(new DatabaseConnection().isConnected());
        String expected = "true";
        assertEquals(expected, result);
        assertTrue(new DatabaseConnection().isConnected());
    }
}