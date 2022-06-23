
package model;

public class Doktor extends Mahasiswa {

    private String judulPenelitianDisertasi;
    private int nilaiSidang1;
    private int nilaiSidang2;
    private int nilaiSidang3;

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public int getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(int nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public int getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(int nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public int getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(int nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String toStringNilaiDisertasi() {
        String print = "\nJudul Penelitian Disertasi: " + judulPenelitianDisertasi + "\nNilai Sidang 1: " + nilaiSidang1 + "\nNilai Sidang 2: " + nilaiSidang2 + "\nNilai Sidang 3: " + nilaiSidang3;
        return print;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
