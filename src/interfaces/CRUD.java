package interfaces;

import java.util.List;

public interface CRUD<T> {

    void tambah(T data);

    void ubah(T data);

    void hapus(String id);

    T cari(String id);

    List<T> tampilSemua();

}