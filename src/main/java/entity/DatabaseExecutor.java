package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseExecutor {

    private static final String ADDRESS = "jdbc:postgresql://localhost:5432";
    private static final String DATABASE_NAME = "CourseProject";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "root";

    public static ResultSet executeQuery(String query) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                ADDRESS + "/" + DATABASE_NAME, USERNAME, PASSWORD);
        ResultSet resultSet = connection.createStatement().executeQuery(query);
        connection.close();
        return resultSet;
    }

    public static boolean execute(String query) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                ADDRESS + "/" + DATABASE_NAME, USERNAME, PASSWORD);
        boolean result = connection.createStatement().execute(query);
        connection.close();
        return result;
    }

    public static int executeUpdate(String query) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(
                ADDRESS + "/" + DATABASE_NAME, USERNAME, PASSWORD);
        int result = connection.createStatement().executeUpdate(query);
        connection.close();
        return result;
    }
}
