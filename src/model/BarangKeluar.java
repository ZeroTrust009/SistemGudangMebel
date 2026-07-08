package model;

public class BarangKeluar {

    private String idKeluar;
    private String tanggalKeluar;
    private int jumlah;
    private String kondisiBarang;
    private String idPerabot;
    private String idUser;
    private String keterangan;

    // Constructor kosong
    public BarangKeluar() {
    }

    // Constructor dengan parameter
    public BarangKeluar(String idKeluar, String tanggalKeluar, int jumlah,
            String kondisiBarang, String idPerabot,
            String idUser, String keterangan) {

        this.idKeluar = idKeluar;
        this.tanggalKeluar = tanggalKeluar;
        this.jumlah = jumlah;
        this.kondisiBarang = kondisiBarang;
        this.idPerabot = idPerabot;
        this.idUser = idUser;
        this.keterangan = keterangan;
    }

    public String getIdKeluar() {
        return idKeluar;
    }

    public void setIdKeluar(String idKeluar) {
        this.idKeluar = idKeluar;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
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