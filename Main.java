package manajemenkoleksiskincare;

import service.SkincareService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SkincareService service = new SkincareService();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Manajemen Koleksi Skincare ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Ubah Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Cari Produk");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = Integer.parseInt(scanner.nextLine());

            switch (pilihan) {
                case 1 -> service.tambahProduk();
                case 2 -> service.lihatProduk();
                case 3 -> service.ubahProduk();
                case 4 -> service.hapusProduk();
                case 5 -> service.cariProduk();
                case 6 -> System.out.println("Terima kasih!");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        scanner.close();
    }
}
