package service;

import model.Skincare;
import java.util.ArrayList;
import java.util.List;

public class SkincareService {
    private final List<Skincare> skincareList;

    public static final String[] DAFTAR_KATEGORI = {
        "Cleanser",
        "Exfoliator",
        "Serum",
        "Cream",
        "Toner",
        "Moisturizer",
        "Sunscreen",
        "Eye Care",
        "Masker",
        "Treatment",
        "Lip Care"
    };

    public SkincareService() {
        this.skincareList = new ArrayList<>();
        // Anda bisa tambahkan data dummy di sini untuk pengujian, misalnya:
        // skincareList.add(new Skincare("Hydrating Toner", "Toner", "Hada Labo", "100ml", "12/2025"));
    }

    // Metode CRUD: Tambah
    public void tambahProduk(Skincare produk) {
        this.skincareList.add(produk);
    }
    
    // Metode CRUD: Lihat
    public List<Skincare> lihatProduk() {
        return this.skincareList;
    }
    
    // Metode CRUD: Ubah
    public boolean ubahProduk(int index, Skincare produkBaru) {
        if (index >= 0 && index < skincareList.size()) {
            skincareList.set(index, produkBaru);
            return true;
        }
        return false;
    }
    
    // Metode CRUD: Hapus
    public boolean hapusProduk(int index) {
        if (index >= 0 && index < skincareList.size()) {
            skincareList.remove(index);
            return true;
        }
        return false;
    }

    // Metode Fitur Tambahan: Cari
    // Metodenya akan mengembalikan daftar produk yang cocok dengan kata kunci
    public List<Skincare> cariProduk(String keyword) {
        List<Skincare> hasilPencarian = new ArrayList<>();
        // Ubah kata kunci ke huruf kecil untuk pencarian yang tidak peka huruf besar-kecil
        String lowerKeyword = keyword.toLowerCase();
        
        for (Skincare produk : skincareList) {
            // Cek apakah kata kunci ada di nama produk, brand, atau kategori
            if (produk.getNamaProduk().toLowerCase().contains(lowerKeyword) ||
                produk.getBrand().toLowerCase().contains(lowerKeyword) ||
                produk.getKategori().toLowerCase().contains(lowerKeyword)) {
                hasilPencarian.add(produk);
            }
        }
        return hasilPencarian;
    }
}