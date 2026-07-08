package model;

public class Laporan {

    private String idLaporan;
    private String tanggal;
    private String isiLaporan;
    private String idUser;

    // Constructor kosong
    public Laporan() {
    }

    // Constructor dengan parameter
    public Laporan(String idLaporan, String tanggal,
            String isiLaporan, String idUser) {

        this.idLaporan = idLaporan;
        this.tanggal = tanggal;
        this.isiLaporan = isiLaporan;
        this.idUser = idUser;
    }

    public String getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(String idLaporan) {
        this.idLaporan = idLaporan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getIsiLaporan() {
        return isiLaporan;
    }

    public void setIsiLaporan(String isiLaporan) {
        this.isiLaporan = isiLaporan;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }
}