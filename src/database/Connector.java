package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    private static final String URL = "jdbc:mysql://localhost:3306/sistem_gudang";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    public static Connection getConnection() {

        try {

            if (connection == null || connection.isClosed()) {

                connection = DriverManager.getConnection(URL, USER, PASSWORD);

                System.out.println("=================================");
                System.out.println("KONEKSI DATABASE BERHASIL");
                System.out.println("Database : sistem_gudang");
                System.out.println("=================================");

            }

        } catch (SQLException e) {

            System.out.println("=================================");
            System.out.println("KONEKSI DATABASE GAGAL");
            System.out.println("Pesan Error : " + e.getMessage());
            System.out.println("=================================");

        }

        return connection;
    }
}