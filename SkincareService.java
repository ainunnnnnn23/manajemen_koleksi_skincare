package service;

import model.Skincare;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SkincareService {
    private List<Skincare> listProduk = new ArrayList<>();
    private int nextId = 1;
    private Scanner scanner = new Scanner(System.in);

    private final String[] kategoriList = {
            "Cleanser", "Exfoliator", "Serum", "Cream", "Toner", "Moisturizer",
            "Sunscreen", "Eye Care", "Masker", "Treatment", "Lip Care"
    };

    private final String[] tipeKulitList = {
            "Normal", "Berminyak", "Kombinasi", "Kering"
    };

    private void tampilkanKategori() {
        System.out.println("=== Daftar Kategori Skincare ===");
        for (int i = 0; i < kategoriList.length; i++) {
            System.out.println((i + 1) + ". " + kategoriList[i]);
        }
    }

    private void tampilkanTipeKulit() {
        System.out.println("=== Daftar Tipe Kulit ===");
        for (int i = 0; i < tipeKulitList.length; i++) {
            System.out.println((i + 1) + ". " + tipeKulitList[i]);
        }
    }

    public void tambahProduk() {
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();

        tampilkanKategori();
        System.out.print("Pilih nomor kategori: ");
        int noKategori = Integer.parseInt(scanner.nextLine());
        String kategori = kategoriList[noKategori - 1];

        System.out.print("Masukkan brand produk: ");
        String brand = scanner.nextLine();

        System.out.print("Masukkan ukuran produk (misal 30ml/100g): ");
        String ukuran = scanner.nextLine();

        System.out.print("Masukkan tanggal kadaluarsa (MM/YYYY): ");
        String kadaluarsa = scanner.nextLine();

        tampilkanTipeKulit();
        System.out.print("Pilih nomor tipe kulit: ");
        int noTipe = Integer.parseInt(scanner.nextLine());
        String tipeKulit = tipeKulitList[noTipe - 1];

        System.out.print("Masukkan fungsi produk: ");
        String fungsi = scanner.nextLine();

        Skincare produk = new Skincare(nextId++, nama, kategori, brand, ukuran, kadaluarsa, tipeKulit, fungsi);
        listProduk.add(produk);

        System.out.println("Produk berhasil ditambahkan!");
    }

    public void lihatProduk() {
        if (listProduk.isEmpty()) {
            System.out.println("Belum ada produk.");
        } else {
            System.out.println("=== Daftar Produk Skincare ===");
            for (Skincare p : listProduk) {
                System.out.println(p);
            }
        }
    }

    public void ubahProduk() {
        lihatProduk();
        System.out.print("Masukkan ID produk yang ingin diubah: ");
        int id = Integer.parseInt(scanner.nextLine());

        Skincare produk = null;
        for (Skincare p : listProduk) {
            if (p.getId() == id) {
                produk = p;
                break;
            }
        }

        if (produk == null) {
            System.out.println("Produk tidak ditemukan!");
            return;
        }

        System.out.print("Nama produk baru (Enter jika tidak diubah): ");
        String nama = scanner.nextLine();
        if (!nama.isEmpty()) produk.setNama(nama);

        tampilkanKategori();
        System.out.print("Pilih nomor kategori baru (Enter jika tidak diubah): ");
        String noKategori = scanner.nextLine();
        if (!noKategori.isEmpty()) produk.setKategori(kategoriList[Integer.parseInt(noKategori) - 1]);

        System.out.print("Brand baru (Enter jika tidak diubah): ");
        String brand = scanner.nextLine();
        if (!brand.isEmpty()) produk.setBrand(brand);

        System.out.print("Ukuran baru (Enter jika tidak diubah): ");
        String ukuran = scanner.nextLine();
        if (!ukuran.isEmpty()) produk.setUkuran(ukuran);

        System.out.print("Tanggal kadaluarsa baru (MM/YYYY) (Enter jika tidak diubah): ");
        String kadaluarsa = scanner.nextLine();
        if (!kadaluarsa.isEmpty()) produk.setKadaluarsa(kadaluarsa);

        tampilkanTipeKulit();
        System.out.print("Pilih nomor tipe kulit baru (Enter jika tidak diubah): ");
        String noTipe = scanner.nextLine();
        if (!noTipe.isEmpty()) produk.setTipeKulit(tipeKulitList[Integer.parseInt(noTipe) - 1]);

        System.out.print("Fungsi baru (Enter jika tidak diubah): ");
        String fungsi = scanner.nextLine();
        if (!fungsi.isEmpty()) produk.setFungsi(fungsi);

        System.out.println("Produk berhasil diubah!");
    }

    public void hapusProduk() {
        lihatProduk();
        System.out.print("Masukkan ID produk yang ingin dihapus: ");
        int id = Integer.parseInt(scanner.nextLine());

        listProduk.removeIf(p -> p.getId() == id);
        System.out.println("Produk berhasil dihapus!");
    }

    public void cariProduk() {
        System.out.println("Cari berdasarkan:");
        System.out.println("1. Nama Produk");
        System.out.println("2. Kategori");
        System.out.println("3. Brand");
        System.out.print("Pilih menu: ");
        int pilihan = Integer.parseInt(scanner.nextLine());

        System.out.print("Masukkan kata kunci: ");
        String keyword = scanner.nextLine().toLowerCase();

        System.out.println("Hasil pencarian:");
        for (Skincare p : listProduk) {
            if ((pilihan == 1 && p.getNama().toLowerCase().contains(keyword)) ||
                (pilihan == 2 && p.getKategori().toLowerCase().contains(keyword)) ||
                (pilihan == 3 && p.getBrand().toLowerCase().contains(keyword))) {
                System.out.println(p);
            }
        }
    }
}
