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

<img width="231" height="196" alt="image" src="https://github.com/user-attachments/assets/c4b73e8d-8549-41e8-a1fd-a81db486ca59" />


**packages manajemenkoleksiskincare:** Paket manajemenkoleksiskincare berisi kelas Main.java yang bertugas berinteraksi dengan pengguna, menampilkan menu, menerima input, termasuk daftar kategori skincare, dan memanggil metode yang relevan dari SkincareService.


**packages model:** Paket model berisi kelas Produk.java sebagai kelas induk dengan properti dasar produk (nama produk, brand, kategori, ukuran, dan tanggal kadaluarsa), 

serta kelas Skincare.java yang menjadi turunan (subclass) dari Produk untuk merepresentasikan produk skincare secara spesifik.

**packages service:** Paket service berisi kelas SkincareService.java yang menangani logika bisnis dan operasi CRUD sebagai penghubung antara data dan tampilan.

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
  
<img width="556" height="497" alt="image" src="https://github.com/user-attachments/assets/d7d83c48-0ed8-4643-9b96-f52a159d9a99" />


## Lihat Produk
3. Program akan menampilkan daftar produk yang sudah tersimpan.
<img width="986" height="183" alt="image" src="https://github.com/user-attachments/assets/5fec605f-6922-4219-9af1-e577b97bbcc4" />


## Ubah Produk
4. Pengguna memilih nomor produk yang ingin diubah, kemudian memasukkan data baru.
<img width="987" height="619" alt="image" src="https://github.com/user-attachments/assets/f4bfc0c4-603a-4713-85d0-0b627aa3585d" />



## Hapus Produk
5. Pengguna memilih nomor produk yang ingin dihapus dari daftar.
<img width="949" height="213" alt="image" src="https://github.com/user-attachments/assets/0cf53c27-77c0-4e19-b5d7-cb9031b83d52" />




## Cari Produk
6. Pengguna menacari produk yg ingin di cari dengan memasukkan nama/brand/ atau kategori.
<img width="951" height="293" alt="image" src="https://github.com/user-attachments/assets/f3b4f513-6485-446e-a933-38a9a625df2f" />



## Keluar
7. Program berhenti jika pengguna memilih menu keluar.
<img width="392" height="184" alt="image" src="https://github.com/user-attachments/assets/8a4b0c31-d368-4651-98ea-539c8f76e9d1" />




 
