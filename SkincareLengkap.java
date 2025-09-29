package model;

public class SkincareLengkap extends Skincare {
    private String manfaat;

    public SkincareLengkap(int id, String nama, String brand, String kategori, String manfaat) {
        super(id, nama, brand, kategori);
        this.manfaat = manfaat;
    }

    @Override
    public void tampilkanDeskripsi() {
        System.out.println(id + ". " + nama + " | Brand: " + brand + 
                " | Kategori: " + kategori + " | Manfaat: " + manfaat);
    }
}
