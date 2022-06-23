
package model;

public class MataKuliah {

    private String kode;
    private int SKS;
    private String namaMatkul;

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

    @Override
    public String toString() {
        String print = "\nKode Matkul: " + kode + "\nJumlah SKS: " + SKS + "\nNama Matkul: " + namaMatkul + "\n";
        return print;
    }

}
