import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; // Add this import statement
import java.sql.SQLException;
import java.sql.Statement; // Add this import statement

public class App {

    // Database credentials
    static String url = "jdbc:mysql://localhost:3306/";
    static String username = "root";
    static String password = "password";

    public static void main(String[] args) {

        // // Load the MySQL JDBC driver
        // try {
        //     Class.forName("com.mysql.cj.jdbc.Driver");
        //     System.out.println("MySQL JDBC driver loaded.");
        // } catch (ClassNotFoundException e) {
        //     System.out.println("Failed to load the MySQL JDBC driver.");
        //     e.printStackTrace();
        //     return;
        // }

        // Establishing a connection
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Perform database operations here
            // Show schemas/databases
            String showSchemasQuery = "SHOW DATABASES";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(showSchemasQuery);

                while (resultSet.next()) {
                    String schemaName = resultSet.getString(1);
                    System.out.println(schemaName);
                }

                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("Failed to execute the query.");
                e.printStackTrace();
            }

            // Closing the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}