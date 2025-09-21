package model;

public class Skincare {
    private int id;
    private String nama;
    private String kategori;
    private String brand;
    private String ukuran;
    private String kadaluarsa;
    private String tipeKulit;
    private String fungsi;

    public Skincare(int id, String nama, String kategori, String brand, String ukuran,
                    String kadaluarsa, String tipeKulit, String fungsi) {
        this.id = id;
        this.nama = nama;
        this.kategori = kategori;
        this.brand = brand;
        this.ukuran = ukuran;
        this.kadaluarsa = kadaluarsa;
        this.tipeKulit = tipeKulit;
        this.fungsi = fungsi;
    }

    public int getId() { return id; }
    public String getNama() { return nama; }
    public String getKategori() { return kategori; }
    public String getBrand() { return brand; }
    public String getUkuran() { return ukuran; }
    public String getKadaluarsa() { return kadaluarsa; }
    public String getTipeKulit() { return tipeKulit; }
    public String getFungsi() { return fungsi; }

    public void setNama(String nama) { this.nama = nama; }
    public void setKategori(String kategori) { this.kategori = kategori; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setUkuran(String ukuran) { this.ukuran = ukuran; }
    public void setKadaluarsa(String kadaluarsa) { this.kadaluarsa = kadaluarsa; }
    public void setTipeKulit(String tipeKulit) { this.tipeKulit = tipeKulit; }
    public void setFungsi(String fungsi) { this.fungsi = fungsi; }

    @Override
    public String toString() {
        return id + ". " + nama + " | Brand: " + brand + " | Kategori: " + kategori +
                " | Ukuran: " + ukuran + " | Exp: " + kadaluarsa +
                " | Tipe Kulit: " + tipeKulit + " | Fungsi: " + fungsi;
    }
}
