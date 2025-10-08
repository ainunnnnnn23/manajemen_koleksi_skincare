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
            System.out.println("1. Tambah Produk Singkat");
            System.out.println("2. Tambah Produk Lengkap");
            System.out.println("3. Lihat Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Tampilkan dari Database (JDBC)");
            System.out.println("6. Tampilkan dari ORM (Simulasi)");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");

            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                pilihan = -1;
            }

            switch (pilihan) {
                case 1 -> service.tambahProduk();
                case 2 -> service.tambahProdukLengkap();
                case 3 -> service.lihatProduk();
                case 4 -> service.hapusProduk();
                case 5 -> service.tampilkanDariDatabase();
                case 6 -> service.tampilkanDariORM();
                case 7 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);

        scanner.close();
    }
}
