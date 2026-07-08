package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController extends BaseController {

    public LoginController() {
        super();
    }

    public String login(String idUser, String password) {

        String sql = "SELECT * FROM user WHERE idUser = ? AND Password = ?";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, idUser);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
            return rs.getString("role"); // Mengembalikan tulisan "kepala_gudang" dll
        }

        } catch (SQLException e) {

            System.out.println("Login gagal : " + e.getMessage());

        }

        return null;

    }
}