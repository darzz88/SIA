
package model;

public class MatkulPilihan {

    private String kode;
    private int SKS;
    private String namaMatkul;
    private int minimumMahasiswa;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public int getSKS() {
        return SKS;
    }

    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public int getMinimumMahasiswa() {
        return minimumMahasiswa;
    }

    public void setMinimumMahasiswa(int minimumMahasiswa) {
        this.minimumMahasiswa = minimumMahasiswa;
    }

    @Override
    public String toString() {
        String print = "\nKode: " + kode + "\nSKS: " + SKS + "\nNama Matkul: " + namaMatkul + "\nMinimum Mahasiswa: " + minimumMahasiswa;
        return print;
    }

}
