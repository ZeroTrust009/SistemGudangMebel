package model;

public class Produk {

    private String idPerabot;
    private String namaPerabot;
    private String jenisPerabot;
    private String statusPerabot;
    private int stok;
    private double harga;
    private String zona;
    private String nomorRak;
    private String posisiRak;

    // Constructor kosong
    public Produk() {
    }

    // Constructor dengan parameter
    public Produk(String idPerabot, String namaPerabot, String jenisPerabot,
                  String statusPerabot, int stok, double harga,
                  String zona, String nomorRak, String posisiRak) {

        this.idPerabot = idPerabot;
        this.namaPerabot = namaPerabot;
        this.jenisPerabot = jenisPerabot;
        this.statusPerabot = statusPerabot;
        this.stok = stok;
        this.harga = harga;
        this.zona = zona;
        this.nomorRak = nomorRak;
        this.posisiRak = posisiRak;
    }

    public String getIdPerabot() {
        return idPerabot;
    }

    public void setIdPerabot(String idPerabot) {
        this.idPerabot = idPerabot;
    }

    public String getNamaPerabot() {
        return namaPerabot;
    }

    public void setNamaPerabot(String namaPerabot) {
        this.namaPerabot = namaPerabot;
    }

    public String getJenisPerabot() {
        return jenisPerabot;
    }

    public void setJenisPerabot(String jenisPerabot) {
        this.jenisPerabot = jenisPerabot;
    }

    public String getStatusPerabot() {
        return statusPerabot;
    }

    public void setStatusPerabot(String statusPerabot) {
        this.statusPerabot = statusPerabot;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public String getNomorRak() {
        return nomorRak;
    }

    public void setNomorRak(String nomorRak) {
        this.nomorRak = nomorRak;
    }

    public String getPosisiRak() {
        return posisiRak;
    }

    public void setPosisiRak(String posisiRak) {
        this.posisiRak = posisiRak;
    }
}