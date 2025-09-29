package service;

import model.Skincare;
import model.SkincareLengkap;
import model.SkincareSingkat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkincareService {
    private List<Skincare> listProduk = new ArrayList<>();
    private int nextId = 1;
    private Scanner scanner = new Scanner(System.in);

    private final String[] kategoriList = {
            "Cleanser", "Exfoliator", "Serum", "Cream", "Toner",
            "Moisturizer", "Sunscreen", "Eye Care", "Masker", "Treatment", "Lip Care"
    };

    private void tampilkanKategori() {
        System.out.println("=== Daftar Kategori Skincare ===");
        for (int i = 0; i < kategoriList.length; i++) {
            System.out.println((i + 1) + ". " + kategoriList[i]);
        }
    }

    // Overloading: tambahProduk versi singkat
    public void tambahProduk() {
        System.out.println("Tambah Produk (Singkat)");
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();

        tampilkanKategori();
        System.out.print("Pilih nomor kategori: ");
        int noKategori = Integer.parseInt(scanner.nextLine());
        if (noKategori < 1 || noKategori > kategoriList.length) {
            System.out.println("Kategori tidak valid!");
            return;
        }
        String kategori = kategoriList[noKategori - 1];

        System.out.print("Masukkan brand: ");
        String brand = scanner.nextLine();

        Skincare produk = new SkincareSingkat(nextId++, nama, brand, kategori);
        listProduk.add(produk);
        System.out.println("Produk singkat berhasil ditambahkan!");
    }

    // Overloading: tambahProduk versi lengkap
    public void tambahProduk(boolean lengkap) {
        if (!lengkap) {
            tambahProduk();
            return;
        }

        System.out.println("Tambah Produk (Lengkap)");
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();

        tampilkanKategori();
        System.out.print("Pilih nomor kategori: ");
        int noKategori = Integer.parseInt(scanner.nextLine());
        if (noKategori < 1 || noKategori > kategoriList.length) {
            System.out.println("Kategori tidak valid!");
            return;
        }
        String kategori = kategoriList[noKategori - 1];

        System.out.print("Masukkan brand: ");
        String brand = scanner.nextLine();

        System.out.print("Masukkan manfaat: ");
        String manfaat = scanner.nextLine();

        Skincare produk = new SkincareLengkap(nextId++, nama, brand, kategori, manfaat);
        listProduk.add(produk);
        System.out.println("Produk lengkap berhasil ditambahkan!");
    }

    public void lihatProduk() {
        if (listProduk.isEmpty()) {
            System.out.println("Belum ada produk.");
        } else {
            System.out.println("=== Daftar Produk Skincare ===");
            for (Skincare p : listProduk) {
                p.tampilkanDeskripsi();
            }
        }
    }

    public void hapusProduk() {
        lihatProduk();
        System.out.print("Masukkan ID produk yang ingin dihapus: ");
        int id = Integer.parseInt(scanner.nextLine());

        listProduk.removeIf(p -> p.getId() == id);
        System.out.println("Produk berhasil dihapus!");
    }
}
