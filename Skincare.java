package model;

public class Skincare {
    // Properties dengan access modifier private
    private String namaProduk;
    private String kategori;
    private String brand;
    private String ukuran;
    private String expired;

    // Constructor untuk inisialisasi objek
    public Skincare(String namaProduk, String kategori, String brand, String ukuran, String expired) {
        this.namaProduk = namaProduk;
        this.kategori = kategori;
        this.brand = brand;
        this.ukuran = ukuran;
        this.expired = expired;
    }

    // Getter untuk semua properti
    public String getNamaProduk() {
        return namaProduk;
    }

    public String getKategori() {
        return kategori;
    }

    public String getBrand() {
        return brand;
    }

    public String getUkuran() {
        return ukuran;
    }

    public String getExpired() {
        return expired;
    }

    // Setter untuk semua properti
    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }
    
    // Metode toString() untuk menampilkan data produk
    @Override
    public String toString() {
        return "Nama: " + namaProduk +
               " | Brand: " + brand +
               " | Kategori: " + kategori +
               " | Ukuran: " + ukuran +
               " | Exp: " + expired;
    }
}