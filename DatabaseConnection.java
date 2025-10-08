package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/koleksiskincare";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void tampilkanData() {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = conn.createStatement()) {

            String query = "SELECT * FROM produk_skincare";
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("=== DATA PRODUK SKINCARE ===");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + ". " +
                        rs.getString("nama") + " | " +
                        rs.getString("kategori") + " | " +
                        rs.getString("brand") + " | " +
                        rs.getString("manfaat")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
