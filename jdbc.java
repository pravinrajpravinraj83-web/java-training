import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "09120912";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish Connection
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Database Connected Successfully!");

            // Close Connection
            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Connection Failed.");
            e.printStackTrace();
        }
    }
}