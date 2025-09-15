# Manajemen Koleksi Skincare  

## Deskripsi Program  
Program ini adalah sistem manajemen koleksi skincare yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data produk. Program ini dibangun dengan mengikuti pola desain Model-View-Controller (MVC) untuk memastikan struktur kode yang terorganisir, modular, dan mudah dikelola.

## Fitur-Fitur
Program ini memiliki fitur-fitur dasar untuk mengelola koleksi skincare, di antaranya:

**Tambah Produk:** Memungkinkan pengguna untuk memasukkan data produk skincare baru ke dalam koleksi.

**Lihat Produk:** Menampilkan semua produk yang tersimpan dalam koleksi.

**Ubah Produk:** Mengedit detail produk yang sudah ada.

**Hapus Produk:** Menghapus produk dari koleksi.

**Cari Produk:** Mencari produk berdasarkan kata kunci yang cocok dengan nama, merek, atau kategori.

## Penerapan Konsep Pemrograman Berorientasi Objek (OOP)
Program ini mengimplementasikan beberapa konsep OOP yang penting:

**Class:** Terdapat tiga kelas utama (Skincare, SkincareService, dan Main) yang memiliki fungsi dan tanggung jawab masing-masing.

**Properties & Constructor:** Kelas Skincare memiliki properti (namaProduk, brand, kategori, dll.) dan sebuah constructor untuk membuat objek baru.

**Access Modifier:** Properti pada kelas Skincare menggunakan access modifier private untuk memastikan data hanya dapat diakses melalui metode getter dan setter.

## Struktur Program (Pola MVC)
Struktur program ini dirancang berdasarkan pola desain MVC untuk memisahkan logika, data, dan tampilan. Berikut adalah penjelasan struktur paketnya:

**packages model:** Paket ini berisi kelas Model yaitu Skincare.java. Tugasnya hanya merepresentasikan data atau objek, menyimpan properti dan metode dasar seperti getter dan setter.

**packages service:** Paket ini berisi kelas Controller yaitu SkincareService.java. Tugasnya adalah menangani semua logika bisnis dan operasi CRUD. Ini menjadi "jembatan" antara data (Model) dan tampilan (View).

**packages manajemenkoleksiskincare:** Paket ini berisi kelas View yaitu Main.java. Kelas ini bertanggung jawab untuk berinteraksi langsung dengan pengguna, menampilkan menu, menerima input, dan memanggil metode yang relevan dari SkincareService.

## Alur Program  
1. Saat dijalankan, program akan menampilkan menu utama:
   
<img width="391" height="185" alt="image" src="https://github.com/user-attachments/assets/b28587d0-694a-4b6d-baf5-a8f5ee2dfc26" />

   
## Tambah Produk
2. Pengguna diminta memasukkan:
- Nama produk
- Kategori (dipilih dari daftar kategori skincare yang sudah disediakan)
- Brand
- Ukuran
- Tanggal kadaluarsa
  
<img width="503" height="509" alt="image" src="https://github.com/user-attachments/assets/1dadd979-9352-45d1-9991-5dbdbc3f99fe" />

## Lihat Produk
3. Program akan menampilkan daftar produk yang sudah tersimpan.
<img width="647" height="198" alt="image" src="https://github.com/user-attachments/assets/fc9cefb6-76bc-43a5-bc33-c89d78282bd8" />


## Ubah Produk
4. Pengguna memilih nomor produk yang ingin diubah, kemudian memasukkan data baru.
<img width="665" height="534" alt="image" src="https://github.com/user-attachments/assets/0e634f16-e950-4d0b-b218-0618900acbc2" />


## Hapus Produk
5. Pengguna memilih nomor produk yang ingin dihapus dari daftar.
<img width="655" height="225" alt="image" src="https://github.com/user-attachments/assets/321b11ba-010c-4e71-8b4c-ee4d5f439706" />



## Cari Produk
6. Pengguna menacari produk yg ingin di cari dengan memasukkan nama/brand/ atau kategori.
<img width="658" height="216" alt="image" src="https://github.com/user-attachments/assets/2fe1849b-8078-42b2-945b-d6f19a5eb90c" />



## Keluar
7. Program berhenti jika pengguna memilih menu keluar.
<img width="414" height="172" alt="image" src="https://github.com/user-attachments/assets/dff76f19-e3b1-4f88-88dd-064bddb835ac" />



 
