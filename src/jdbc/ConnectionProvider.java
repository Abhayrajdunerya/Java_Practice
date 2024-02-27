package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection con;

    private ConnectionProvider() { } 

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/jdbc_basics_demo";
        String user = "root";
        String password = "root";

        try {
            if (con == null) {
                // Class.forName("com.mysql.cj.jdbc.Driver"); // not necessary
                con = DriverManager.getConnection(url, user, password);
                System.out.println("DB CONNECTED");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
