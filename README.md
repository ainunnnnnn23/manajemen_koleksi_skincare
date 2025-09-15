# Manajemen Koleksi Skincare  

## Deskripsi Program  
Program ini adalah sistem manajemen koleksi skincare berbasis konsol yang memungkinkan pengguna untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data produk. Program ini dibangun dengan mengikuti pola desain Model-View-Controller (MVC) untuk memastikan struktur kode yang terorganisir, modular, dan mudah dikelola.

Fitur-Fitur
Program ini memiliki fitur-fitur dasar untuk mengelola koleksi skincare, di antaranya:

Tambah Produk: Memungkinkan pengguna untuk memasukkan data produk skincare baru ke dalam koleksi.

Lihat Produk: Menampilkan semua produk yang tersimpan dalam koleksi.

Ubah Produk: Mengedit detail produk yang sudah ada.

Hapus Produk: Menghapus produk dari koleksi.

Cari Produk: Mencari produk berdasarkan kata kunci yang cocok dengan nama, merek, atau kategori.

## Penerapan Konsep Pemrograman Berorientasi Objek (OOP)
Program ini mengimplementasikan beberapa konsep OOP yang penting:

Class: Terdapat tiga kelas utama (Skincare, SkincareService, dan Main) yang memiliki fungsi dan tanggung jawab masing-masing.

Properties & Constructor: Kelas Skincare memiliki properti (namaProduk, brand, kategori, dll.) dan sebuah constructor untuk membuat objek baru.

Access Modifier: Properti pada kelas Skincare menggunakan access modifier private untuk memastikan data hanya dapat diakses melalui metode getter dan setter.

## Struktur Program (Pola MVC)
Struktur program ini dirancang berdasarkan pola desain MVC untuk memisahkan logika, data, dan tampilan. Berikut adalah penjelasan struktur paketnya:

packages model: Paket ini berisi kelas Model yaitu Skincare.java. Tugasnya hanya merepresentasikan data atau objek, menyimpan properti dan metode dasar seperti getter dan setter.

packages service: Paket ini berisi kelas Controller yaitu SkincareService.java. Tugasnya adalah menangani semua logika bisnis dan operasi CRUD. Ini menjadi "jembatan" antara data (Model) dan tampilan (View).

packages manajemenkoleksiskincare: Paket ini berisi kelas View yaitu Main.java. Kelas ini bertanggung jawab untuk berinteraksi langsung dengan pengguna, menampilkan menu, menerima input, dan memanggil metode yang relevan dari SkincareService.

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
  
  <img width="396" height="486" alt="image" src="https://github.com/user-attachments/assets/288373bf-6ce9-4e9b-bd52-794a2489a054" />

## Lihat Produk
3. Program akan menampilkan daftar produk yang sudah tersimpan.
   <img width="606" height="187" alt="image" src="https://github.com/user-attachments/assets/6ce7ca68-0cc9-4ad8-8710-0bf81313d8f6" />

## Ubah Produk
4. Pengguna memilih nomor produk yang ingin diubah, kemudian memasukkan data baru.
<img width="621" height="510" alt="image" src="https://github.com/user-attachments/assets/4eeecf2e-9ae5-41a6-b591-1c8d076d37f0" />


## Hapus Produk
5. Pengguna memilih nomor produk yang ingin dihapus dari daftar.
<img width="613" height="369" alt="image" src="https://github.com/user-attachments/assets/9f136dc5-7ecc-483c-a00c-c246a365086c" />


## Keluar
6. Program berhenti jika pengguna memilih menu keluar.
<img width="414" height="175" alt="image" src="https://github.com/user-attachments/assets/ab0301f7-7fe3-487e-b971-9e27d28f3475" />


 
