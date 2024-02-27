package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        try (Connection con = ConnectionProvider.getConnection(); Scanner sc = new Scanner(System.in)) {
            String sql = "UPDATE students SET name=?, age=?, city=? WHERE roll_no=?";

            System.out.print("Enter your roll no: ");
            String rollNo = sc.nextLine();

            System.out.print("Enter new name: ");
            String name = sc.nextLine();

            System.out.print("Enter new city: ");
            String city = sc.nextLine();

            System.out.print("Enter new age: ");
            int age = sc.nextInt();

            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(4, rollNo);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, city);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Updated!");
            } else {
                System.out.println("Not updated!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
