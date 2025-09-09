package manajemenkoleksiskincare;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // ArrayList untuk menyimpan koleksi skincare
    static ArrayList<String> namaProduk = new ArrayList<>();
    static ArrayList<String> kategori = new ArrayList<>();
    static ArrayList<String> brand = new ArrayList<>();
    static ArrayList<String> ukuran = new ArrayList<>();
    static ArrayList<String> expired = new ArrayList<>();

    // Daftar kategori skincare
    static String[] daftarKategori = {
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

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;

            do {
                System.out.println("\n=== Manajemen Koleksi Skincare ===");
                System.out.println("1. Tambah Produk");
                System.out.println("2. Lihat Produk");
                System.out.println("3. Ubah Produk");
                System.out.println("4. Hapus Produk");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();
                input.nextLine(); // clear buffer

                switch (pilihan) {
                    case 1 -> tambahProduk(input);
                    case 2 -> lihatProduk();
                    case 3 -> ubahProduk(input);
                    case 4 -> hapusProduk(input);
                    case 5 -> System.out.println("Terima kasih telah menggunakan program ini!");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 5);
        }
    }

    // Fungsi untuk menampilkan daftar kategori
    public static void tampilkanKategori() {
        System.out.println("\n=== Daftar Kategori Skincare ===");
        for (int i = 0; i < daftarKategori.length; i++) {
            System.out.println((i + 1) + ". " + daftarKategori[i]);
        }
    }

    // Fungsi untuk memilih kategori
    public static String pilihKategori(Scanner input) {
        tampilkanKategori();
        System.out.print("Pilih nomor kategori: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < daftarKategori.length) {
            return daftarKategori[index];
        } else {
            System.out.println("Kategori tidak valid, default ke 'Lainnya'.");
            return "Lainnya";
        }
    }

    // Fungsi untuk menambah produk
    public static void tambahProduk(Scanner input) {
        System.out.print("Masukkan nama produk: ");
        String nama = input.nextLine();
        String kat = pilihKategori(input);
        System.out.print("Masukkan brand produk: ");
        String br = input.nextLine();
        System.out.print("Masukkan ukuran produk (misal 30ml/100g): ");
        String uk = input.nextLine();
        System.out.print("Masukkan tanggal kadaluarsa (MM/YYYY): ");
        String exp = input.nextLine();

        namaProduk.add(nama);
        kategori.add(kat);
        brand.add(br);
        ukuran.add(uk);
        expired.add(exp);

        System.out.println("Produk berhasil ditambahkan!");
    }

    // Fungsi untuk melihat semua produk
    public static void lihatProduk() {
        if (namaProduk.isEmpty()) {
            System.out.println("Belum ada produk yang tersimpan.");
        } else {
            System.out.println("\n=== Daftar Koleksi Skincare ===");
            for (int i = 0; i < namaProduk.size(); i++) {
                System.out.println((i + 1) + ". " + namaProduk.get(i) +
                                   " | Brand: " + brand.get(i) +
                                   " | Kategori: " + kategori.get(i) +
                                   " | Ukuran: " + ukuran.get(i) +
                                   " | Exp: " + expired.get(i));
            }
        }
    }

    // Fungsi untuk mengubah data produk
    public static void ubahProduk(Scanner input) {
        lihatProduk();
        if (!namaProduk.isEmpty()) {
            System.out.print("Pilih nomor produk yang ingin diubah: ");
            int index = input.nextInt() - 1;
            input.nextLine();

            if (index >= 0 && index < namaProduk.size()) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = input.nextLine();
                String katBaru = pilihKategori(input);
                System.out.print("Masukkan brand baru: ");
                String brBaru = input.nextLine();
                System.out.print("Masukkan ukuran baru: ");
                String ukBaru = input.nextLine();
                System.out.print("Masukkan tanggal kadaluarsa baru (MM/YYYY): ");
                String expBaru = input.nextLine();

                namaProduk.set(index, namaBaru);
                kategori.set(index, katBaru);
                brand.set(index, brBaru);
                ukuran.set(index, ukBaru);
                expired.set(index, expBaru);

                System.out.println("Produk berhasil diubah!");
            } else {
                System.out.println("Nomor produk tidak valid!");
            }
        }
    }

    // Fungsi untuk menghapus produk
    public static void hapusProduk(Scanner input) {
        lihatProduk();
        if (!namaProduk.isEmpty()) {
            System.out.print("Pilih nomor produk yang ingin dihapus: ");
            int index = input.nextInt() - 1;
            input.nextLine();

            if (index >= 0 && index < namaProduk.size()) {
                namaProduk.remove(index);
                kategori.remove(index);
                brand.remove(index);
                ukuran.remove(index);
                expired.remove(index);
                System.out.println("Produk berhasil dihapus!");
            } else {
                System.out.println("Nomor produk tidak valid!");
            }
        }
    }
}
