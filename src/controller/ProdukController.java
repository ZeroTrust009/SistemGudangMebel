package controller;

import interfaces.CRUD;
import model.Produk;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdukController extends BaseController implements CRUD<Produk> {

    @Override
    public void tambah(Produk data) {

        String sql = "INSERT INTO produk "
                + "(idPerabot, NamaPerabot, JenisPerabot, StatusPerabot, "
                + "stok, harga, zona, nomor_rak, posisi_rak) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            PreparedStatement ps = connection.prepareStatement(sql);

            ps.setString(1, data.getIdPerabot());
            ps.setString(2, data.getNamaPerabot());
            ps.setString(3, data.getJenisPerabot());
            ps.setString(4, data.getStatusPerabot());
            ps.setInt(5, data.getStok());
            ps.setDouble(6, data.getHarga());
            ps.setString(7, data.getZona());
            ps.setString(8, data.getNomorRak());
            ps.setString(9, data.getPosisiRak());

            ps.executeUpdate();

        } catch (SQLException e) {

            System.out.println("Gagal menyimpan data : " + e.getMessage());

        }

    }

    @Override
    public void ubah(Produk data) {
        throw new UnsupportedOperationException("Belum diimplementasikan.");
    }

    @Override
    public void hapus(String id) {
        throw new UnsupportedOperationException("Belum diimplementasikan.");
    }

    @Override
    public Produk cari(String id) {
        throw new UnsupportedOperationException("Belum diimplementasikan.");
    }

    @Override
    public List<Produk> tampilSemua() {

        List<Produk> daftarProduk = new ArrayList<>();

        String sql = "SELECT * FROM produk";

        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                Produk produk = new Produk();

                produk.setIdPerabot(rs.getString("idPerabot"));
                produk.setNamaPerabot(rs.getString("NamaPerabot"));
                produk.setJenisPerabot(rs.getString("JenisPerabot"));
                produk.setStatusPerabot(rs.getString("StatusPerabot"));
                produk.setStok(rs.getInt("stok"));
                produk.setHarga(rs.getDouble("harga"));
                produk.setZona(rs.getString("zona"));
                produk.setNomorRak(rs.getString("nomor_rak"));
                produk.setPosisiRak(rs.getString("posisi_rak"));

                daftarProduk.add(produk);

            }

        } catch (SQLException e) {

            System.out.println("Gagal mengambil data : " + e.getMessage());

        }

        return daftarProduk;

    }

}
