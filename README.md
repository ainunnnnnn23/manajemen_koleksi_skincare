# Manajemen Koleksi Skincare  

## Deskripsi Program  
Program ini dibuat untuk mengelola koleksi produk skincare.  
Fitur yang tersedia meliputi:
- Menambahkan produk skincare (versi singkat dan lengkap).
- Menampilkan daftar produk.
- Menghapus produk berdasarkan ID.

Selain itu, program ini juga menerapkan **konsep OOP (Object Oriented Programming)**:
- **Abstraction** (menggunakan `abstract class`).
- **Polymorphism** (Overloading & Overriding).
- **Interface** (nilai tambah).

## Fitur-Fitur
Program ini memiliki fitur-fitur dasar untuk mengelola koleksi skincare, di antaranya:

**Tambah Produk (Singkat/Lengkap):** Memungkinkan pengguna untuk memasukkan data produk skincare baru ke dalam koleksi.

**Lihat Produk:** Menampilkan semua produk yang tersimpan dalam koleksi.

**Hapus Produk:** Menghapus produk dari koleksi.


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
<img width="360" height="242" alt="image" src="https://github.com/user-attachments/assets/02f956e9-b405-439b-9c50-85f97f27bc51" />


## Alur Program  
1. Saat dijalankan, program akan menampilkan menu utama:

<img width="304" height="99" alt="image" src="https://github.com/user-attachments/assets/89e8624a-5edc-4aee-8cf8-b4dd7ce3c498" />


   
## Tambah Produk (singkat)
2. Pengguna diminta memasukkan:
- Nama produk
- Kategori (dipilih dari daftar kategori skincare yang sudah disediakan)
- Brand
  
<img width="349" height="411" alt="image" src="https://github.com/user-attachments/assets/932d4d8a-d976-473d-9c2c-ade7855301ac" />



## Tambah produk (Lengkap)
3. Pengguna diminta memasukkan:
- Nama produk
- Kategori (dipilih dari daftar kategori skincare yang sudah disediakan)
- Brand
- manfaat
<img width="385" height="429" alt="image" src="https://github.com/user-attachments/assets/8ca86869-4bf3-4809-b3ad-4d22bf562a45" />




## Lihat Produk
4. Pengguna melihat produk yang sudah di tambahkan.
<img width="616" height="189" alt="image" src="https://github.com/user-attachments/assets/51ba779d-0255-4503-8d23-b572fdc7d505" />





## Hapus Produk
5. Pengguna memilih nomor produk yang ingin dihapus dari daftar.
<img width="614" height="217" alt="image" src="https://github.com/user-attachments/assets/9ff16a74-61ab-4848-9629-2afdd6ea28d0" />



## Keluar
6. Program berhenti jika pengguna memilih menu keluar.
<img width="409" height="165" alt="image" src="https://github.com/user-attachments/assets/d056d786-bafe-4ae3-b518-31c6bf2af9ec" />




 
