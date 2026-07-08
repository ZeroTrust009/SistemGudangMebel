package model;

public class BarangMasuk {

    private String idMasuk;
    private String tanggalMasuk;
    private int jumlah;
    private String kondisiBarang;
    private String idPerabot;
    private String idUser;
    private String keterangan;

    // Constructor kosong
    public BarangMasuk() {
    }

    // Constructor dengan parameter
    public BarangMasuk(String idMasuk, String tanggalMasuk, int jumlah,
            String kondisiBarang, String idPerabot,
            String idUser, String keterangan) {

        this.idMasuk = idMasuk;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlah = jumlah;
        this.kondisiBarang = kondisiBarang;
        this.idPerabot = idPerabot;
        this.idUser = idUser;
        this.keterangan = keterangan;
    }

    public String getIdMasuk() {
        return idMasuk;
    }

    public void setIdMasuk(String idMasuk) {
        this.idMasuk = idMasuk;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getKondisiBarang() {
        return kondisiBarang;
    }

    public void setKondisiBarang(String kondisiBarang) {
        this.kondisiBarang = kondisiBarang;
    }

    public String getIdPerabot() {
        return idPerabot;
    }

    public void setIdPerabot(String idPerabot) {
        this.idPerabot = idPerabot;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }
}