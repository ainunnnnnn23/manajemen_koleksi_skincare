package manajemenkoleksiskincare;

import java.util.Scanner;
import java.util.List;
import model.Skincare;
import service.SkincareService;

public class Main {
    private static final SkincareService skincareService = new SkincareService();
    private static final Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Koleksi Skincare ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Cari Produk"); // Opsi menu baru
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                pilihan = input.nextInt();
                input.nextLine();
                
                switch (pilihan) {
                    case 1 -> tambahProduk();
                    case 2 -> lihatProduk();
                    case 3 -> ubahProduk();
                    case 4 -> hapusProduk();
                    case 5 -> cariProduk(); // Panggil metode baru
                    case 6 -> System.out.println("Terima kasih telah menggunakan program ini!");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan angka.");
                input.nextLine();
                pilihan = 0;
            }
        } while (pilihan != 6);
    }
    
    // Metode untuk menampilkan daftar kategori
    public static void tampilkanKategori() {
        System.out.println("\n=== Daftar Kategori Skincare ===");
        String[] daftarKategori = SkincareService.DAFTAR_KATEGORI;
        for (int i = 0; i < daftarKategori.length; i++) {
            System.out.println((i + 1) + ". " + daftarKategori[i]);
        }
    }

    // Metode untuk memilih kategori
    public static String pilihKategori() {
        tampilkanKategori();
        System.out.print("Pilih nomor kategori: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        if (index >= 0 && index < SkincareService.DAFTAR_KATEGORI.length) {
            return SkincareService.DAFTAR_KATEGORI[index];
        } else {
            System.out.println("Kategori tidak valid, default ke 'Lainnya'.");
            return "Lainnya";
        }
    }

    // Metode untuk menambah produk
    private static void tambahProduk() {
        System.out.print("Masukkan nama produk: ");
        String nama = input.nextLine();
        String kat = pilihKategori();
        System.out.print("Masukkan brand produk: ");
        String br = input.nextLine();
        System.out.print("Masukkan ukuran produk (misal 30ml/100g): ");
        String uk = input.nextLine();
        System.out.print("Masukkan tanggal kadaluarsa (MM/YYYY): ");
        String exp = input.nextLine();
        
        Skincare produkBaru = new Skincare(nama, kat, br, uk, exp);
        skincareService.tambahProduk(produkBaru);
        System.out.println("Produk berhasil ditambahkan!");
    }
    
    // Metode untuk melihat semua produk
    private static void lihatProduk() {
        List<Skincare> produkList = skincareService.lihatProduk();
        if (produkList.isEmpty()) {
            System.out.println("Belum ada produk yang tersimpan.");
        } else {
            System.out.println("\n=== Daftar Koleksi Skincare ===");
            for (int i = 0; i < produkList.size(); i++) {
                System.out.println((i + 1) + ". " + produkList.get(i));
            }
        }
    }
    
    // Metode untuk mengubah produk
    private static void ubahProduk() {
        lihatProduk();
        List<Skincare> produkList = skincareService.lihatProduk();
        if (!produkList.isEmpty()) {
            System.out.print("Pilih nomor produk yang ingin diubah: ");
            int index = input.nextInt() - 1;
            input.nextLine();

            if (index >= 0 && index < produkList.size()) {
                System.out.print("Masukkan nama baru: ");
                String namaBaru = input.nextLine();
                String katBaru = pilihKategori();
                System.out.print("Masukkan brand baru: ");
                String brBaru = input.nextLine();
                System.out.print("Masukkan ukuran baru: ");
                String ukBaru = input.nextLine();
                System.out.print("Masukkan tanggal kadaluarsa baru (MM/YYYY): ");
                String expBaru = input.nextLine();

                Skincare produkBaru = new Skincare(namaBaru, katBaru, brBaru, ukBaru, expBaru);
                skincareService.ubahProduk(index, produkBaru);
                System.out.println("Produk berhasil diubah!");
            } else {
                System.out.println("Nomor produk tidak valid!");
            }
        }
    }
    
    // Metode untuk menghapus produk
    private static void hapusProduk() {
        lihatProduk();
        List<Skincare> produkList = skincareService.lihatProduk();
        if (!produkList.isEmpty()) {
            System.out.print("Pilih nomor produk yang ingin dihapus: ");
            int index = input.nextInt() - 1;
            input.nextLine();

            if (skincareService.hapusProduk(index)) {
                System.out.println("Produk berhasil dihapus!");
            } else {
                System.out.println("Nomor produk tidak valid!");
            }
        }
    }
    
    // Metode untuk mencari produk
    private static void cariProduk() {
        System.out.print("Masukkan kata kunci pencarian (nama, brand, atau kategori): ");
        String keyword = input.nextLine();
        List<Skincare> hasil = skincareService.cariProduk(keyword);
        
        if (hasil.isEmpty()) {
            System.out.println("Tidak ada produk yang ditemukan dengan kata kunci '" + keyword + "'.");
        } else {
            System.out.println("\n=== Hasil Pencarian ===");
            for (Skincare produk : hasil) {
                System.out.println("- " + produk);
            }
        }
    }
}