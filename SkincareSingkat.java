package model;

public class SkincareSingkat extends Skincare {

    public SkincareSingkat(int id, String nama, String kategori, String brand) {
        super(id, nama, kategori, brand, "-");
    }

    @Override
    public void tampilkanDeskripsi() {
        System.out.println(getId() + ". " + getNama() + " | " + getKategori() + " | " + getBrand());
    }
}
