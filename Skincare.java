package model;

public class Skincare {
    private int id;
    private String nama;
    private String kategori;
    private String brand;
    private String manfaat;

    public Skincare(int id, String nama, String kategori, String brand, String manfaat) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.brand = brand;
        this.manfaat = manfaat;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getKategori() { return kategori; }
    public String getBrand() { return brand; }
    public String getManfaat() { return manfaat; }

    @Override
    public String toString() {
        return String.format("[%d] %s (%s) - %s | Manfaat: %s", id, nama, brand, kategori, manfaat);
    }
    
    public void tampilkanDeskripsi() {
        System.out.println(toString());
    }
}
