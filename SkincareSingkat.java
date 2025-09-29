package model;

public class SkincareSingkat extends Skincare {
    public SkincareSingkat(int id, String nama, String brand, String kategori) {
        super(id, nama, brand, kategori);
    }

    @Override
    public void tampilkanDeskripsi() {
        System.out.println(id + ". " + nama + " | Brand: " + brand + " | Kategori: " + kategori);
    }
}
