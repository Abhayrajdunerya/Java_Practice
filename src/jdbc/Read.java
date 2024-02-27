package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {
        try (Connection con = ConnectionProvider.getConnection(); Scanner sc = new Scanner(System.in);) {
            String sql = "SELECT * FROM students";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(sql);

            ArrayList<Student> students = new ArrayList<>();

            while (set.next()) {
                String rollNo = set.getString(1);
                String name = set.getString(2);
                int age = set.getInt(3);
                String city = set.getString(4);

                students.add(new Student(rollNo, name, age, city));
            }

            System.out.println(students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student {
    private String rollNo;
    private String name;
    private int age;
    private String city;
    
    public Student(String rollNo, String name, int age, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "\n  Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", city=" + city + "]\n";
    }

    
}
