package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        try (Connection con = ConnectionProvider.getConnection(); 
                Scanner sc = new Scanner(System.in);) {
            /* // SQL statement
                String sql_stmt = "INSERT INTO students (roll_no, name, age, city) VALUES ('20I1001','Abhay Raj Dunerya',22,'Tikamgarh')";
                Statement stmt = con.createStatement();
                int rows = stmt.executeUpdate(sql_stmt);
                if (rows > 0) {
                    System.out.println("Inserted!");
                } else {
                    System.out.println("Not inserted!");
                }
            */

            // SQL prepared statement
            String sql_prepared_stmt = "INSERT INTO students (roll_no, name, age, city) VALUES (?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(sql_prepared_stmt);

            System.out.print("Enter roll no: ");
            String rollNo = sc.nextLine();

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter city: ");
            String city = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.println();

            pstmt.setString(1, rollNo);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setString(4, city);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Inserted!");
            } else {
                System.out.println("Not inserted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
