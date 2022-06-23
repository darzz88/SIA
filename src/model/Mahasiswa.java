
package model;

public class Mahasiswa extends User implements ConstantJurusan {

    String NIM;
    int jurusan;

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public int getJurusan() {
        return jurusan;
    }

    public void setJurusan(int jurusan) {
        this.jurusan = jurusan;
    }

    public String getNamaJurusan(int jurusan) {
        String namaJurusan = "";
        switch (jurusan) {
            case 1:
                namaJurusan = "Informatika";
                break;
            case 2:
                namaJurusan = "DKV";
                break;
            case 3:
                namaJurusan = "SI";
                break;
            default:
                throw new AssertionError();
        }
        return namaJurusan;
    }

    @Override
    public String toString() {
        String print = super.toString();
        print += "\nNIM: " + NIM + "\nJurusan: " + getNamaJurusan(this.jurusan);
        return print;
    }
    


}
