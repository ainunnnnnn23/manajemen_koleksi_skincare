package model;

public abstract class Skincare {
    protected int id;
    protected String nama;
    protected String brand;
    protected String kategori;

    public Skincare(int id, String nama, String brand, String kategori) {
        this.id = id;
        this.nama = nama;
        this.brand = brand;
        this.kategori = kategori;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getBrand() { return brand; }
    public String getKategori() { return kategori; }

    public void setNama(String nama) { this.nama = nama; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setKategori(String kategori) { this.kategori = kategori; }

    // Abstract method (harus dioverride)
    public abstract void tampilkanDeskripsi();
}
