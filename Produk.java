package model;

public class Produk {
    private String namaProduk;
    private String brand;
    private String kategori;
    private String tanggalKadaluarsa;
    private String ukuran;

    public Produk(String namaProduk, String brand, String kategori, String tanggalKadaluarsa, String ukuran) {
        this.namaProduk = namaProduk;
        this.brand = brand;
        this.kategori = kategori;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.ukuran = ukuran;
    }

    public String getNamaProduk() { return namaProduk; }
    public void setNamaProduk(String namaProduk) { this.namaProduk = namaProduk; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getKategori() { return kategori; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    public String getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) { this.tanggalKadaluarsa = tanggalKadaluarsa; }

    public String getUkuran() { return ukuran; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }

    public void displayInfo() {
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Brand       : " + brand);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Ukuran      : " + ukuran);
        System.out.println("Kadaluarsa  : " + tanggalKadaluarsa);
    }
}
