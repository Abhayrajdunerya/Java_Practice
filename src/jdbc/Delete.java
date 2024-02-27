package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;



public class Delete {
    public static void main(String[] args) {
        try (Connection con = ConnectionProvider.getConnection(); Scanner sc = new Scanner(System.in)) {
            String sql = "DELETE FROM students WHERE roll_no=?";

            PreparedStatement pstmt = con.prepareStatement(sql);

            System.out.print("Enter roll no: ");
            String rollNo = sc.nextLine();

            pstmt.setString(1, rollNo);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Deleted!");
            } else {
                System.out.println("Not deleted!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
