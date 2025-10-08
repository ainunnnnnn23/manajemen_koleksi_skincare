package model;

public class SkincareLengkap extends Skincare {
    private String ukuran;
    private String tanggalKadaluarsa;
    private String tipeKulit;

    public SkincareLengkap(int id, String nama, String kategori, String brand, String manfaat,
                           String ukuran, String tanggalKadaluarsa, String tipeKulit) {
        super(id, nama, kategori, brand, manfaat);
        this.ukuran = ukuran;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.tipeKulit = tipeKulit;
    }

    public String getUkuran() { return ukuran; }
    public String getTanggalKadaluarsa() { return tanggalKadaluarsa; }
    public String getTipeKulit() { return tipeKulit; }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Ukuran: %s | Exp: %s | Kulit: %s",
                ukuran, tanggalKadaluarsa, tipeKulit);
    }
}
