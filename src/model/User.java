package model;

public class User {

    private String idUser;
    private String password;
    private String role;

    // Constructor kosong
    public User() {
    }

    // Constructor dengan parameter
    public User(String idUser, String password, String role) {
        this.idUser = idUser;
        this.password = password;
        this.role = role;
    }

    // Getter dan Setter
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}