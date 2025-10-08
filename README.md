# Manajemen Koleksi Skincare  

## Deskripsi Program  
Program ini dibuat untuk mengelola koleksi produk skincare dengan menggunakan konsep Pemrograman Berorientasi Objek (OOP).
Menggunakan JDBC untuk bisa mengakses database.
Semua data produk disimpan sementara dalam ArrayList, yang berfungsi sebagai simulasi ORM (Object Relational Mapping) — data diolah melalui objek tanpa menggunakan database langsung.

Selain itu, program ini juga menerapkan **konsep OOP (Object Oriented Programming)**:
- **Abstraction** (menggunakan `abstract class`).
- **Polymorphism** (Overloading & Overriding).
- **Interface** (nilai tambah).

## Fitur-Fitur
Program ini memiliki fitur-fitur dasar untuk mengelola koleksi skincare, di antaranya:

**Tambah Produk (Singkat & Lengkap)**
Pengguna dapat menambahkan dua jenis produk:

Skincare Singkat → berisi informasi dasar seperti ID, nama, kategori, dan brand.

Skincare Lengkap → berisi informasi detail seperti ukuran, tanggal kadaluarsa, tipe kulit, serta manfaat produk.

**Lihat Semua Produk**
Menampilkan seluruh produk skincare yang sudah ditambahkan dengan format yang berbeda sesuai jenisnya.

**Hapus Produk Berdasarkan ID**
Menghapus data produk dari koleksi berdasarkan ID.

**Database JDBC**
Untuk Mengakses Database

**Simulasi ORM (Tanpa Database)**
Data dikelola di dalam program menggunakan ArrayList, bukan disimpan ke MySQL.
Hal ini mensimulasikan cara kerja ORM di dunia nyata.


## Penerapan Konsep Pemrograman Berorientasi Objek (OOP)
1. Abstraction
`Skincare` dibuat sebagai **abstract class** yang memiliki atribut dasar (`id, nama, brand, kategori`)  
dan **abstract method** `tampilkanDeskripsi()` yang wajib dioverride oleh setiap subclass.

<img width="697" height="561" alt="image" src="https://github.com/user-attachments/assets/bf75d09d-f549-4997-b9a8-d9a24dc0a676" />



2. Polymorphism

Overriding:
SkincareSingkat dan SkincareLengkap keduanya meng-override tampilkanDeskripsi() dengan format berbeda.

<img width="870" height="304" alt="image" src="https://github.com/user-attachments/assets/8e9ab692-df42-436d-bbb3-22a5eb67cfd8" />


Overloading:
Pada SkincareService, terdapat 2 method tambahProduk() dengan parameter berbeda:

<img width="400" height="110" alt="image" src="https://github.com/user-attachments/assets/b80d3575-b8a1-4eb9-b0c2-2814247f9abf" />


3. Interface (Nilai Tambah)

Interface CetakInfo ditambahkan untuk mencetak informasi singkat produk.

<img width="488" height="163" alt="image" src="https://github.com/user-attachments/assets/bd2c1d89-dc63-41cb-9414-74902d96799c" />


##  Struktur Package
<img width="215" height="331" alt="image" src="https://github.com/user-attachments/assets/f81c3508-abab-4428-a7cf-e0f5201e27fe" />



## Alur Program  
1. Saat dijalankan, program akan menampilkan menu utama:

<img width="283" height="138" alt="image" src="https://github.com/user-attachments/assets/bad638d6-2276-48e0-922a-265ab79ff9b1" />



   
## Tambah Produk (singkat)
2. Pengguna diminta memasukkan:
- Nama produk
- Kategori (dipilih dari daftar kategori skincare yang sudah disediakan)
- Brand
  
<img width="293" height="295" alt="image" src="https://github.com/user-attachments/assets/15b91e05-4f8a-4344-8822-7da13200e7e4" />




## Tambah produk (Lengkap)
3. Pengguna diminta memasukkan:
- Nama produk
- Kategori (dipilih dari daftar kategori skincare yang sudah disediakan)
- Brand
- manfaat
<img width="379" height="363" alt="image" src="https://github.com/user-attachments/assets/11c0f054-29e2-4895-8db3-3a5e4d3b24e2" />





## Lihat Produk
4. Pengguna melihat produk yang sudah di tambahkan.
<img width="634" height="220" alt="image" src="https://github.com/user-attachments/assets/300b0339-9149-4866-bbfe-d530bc46fc4a" />






## Hapus Produk
5. Pengguna memilih nomor produk yang ingin dihapus dari daftar.
<img width="633" height="235" alt="image" src="https://github.com/user-attachments/assets/717d10ce-e315-4fa8-bd79-c35a30acabd1" />



## Tampilkan dari Database (JDBC)
6. Pengguna memilih untuk menampilkan database
<img width="628" height="279" alt="image" src="https://github.com/user-attachments/assets/397815e0-b6a4-4cda-ae57-a0ed95ba1741" />


## Tampilkan dari ORM
6. Pengguna memilih untuk menampilkan ORM
<img width="636" height="234" alt="image" src="https://github.com/user-attachments/assets/b65e97bd-e73b-4ff0-b821-187ece0138f1" />



## Keluar
8. Program berhenti jika pengguna memilih menu keluar.
<img width="400" height="187" alt="image" src="https://github.com/user-attachments/assets/2b6d7a39-7bb3-41f5-8daf-116159ddc91b" />





 
