
package controller;

import java.util.ArrayList;
import model.Doktor;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Magister;
import model.Sarjana;

public class Controller {

    ArrayList<Sarjana> arrSarjana = new ArrayList();
    ArrayList<Magister> arrMagister = new ArrayList();
    ArrayList<Doktor> arrDoktor = new ArrayList();
    ArrayList<Karyawan> arrKaryawan = new ArrayList();
    ArrayList<DosenTetap> arrDosenTetap = new ArrayList();
    ArrayList<DosenHonorer> arrDosenHonorer = new ArrayList();
    
    public void createDataDummy() {
        new DataDummy().createDataDummy(arrSarjana, arrMagister, arrDoktor, arrKaryawan, arrDosenTetap, arrDosenHonorer);
    }
    
    public void printUserData(String nama) {
        new PrintUserData().printUserData(arrSarjana, arrMagister, arrDoktor, arrKaryawan, arrDosenTetap, arrDosenHonorer, nama);
    }
    
    public void printNilaiAkhir(String NIM, String kodeMK){
        new PrintNilaiAkhir().printNilaiAkhir(arrSarjana, arrMagister, arrDoktor, NIM, kodeMK);
    }
    
    public void printRataRataNilaiMK(String kodeMK){
        new PrintRataRataNilaiMK().printRataRataNilaiMK(arrSarjana, arrMagister, kodeMK);
    }
    
    public void printMahasiswaTidakLulus(String kodeMK){
        new PrintMahasiswaTidakLulus().printMahasiswaTidakLulus(arrSarjana, arrMagister, kodeMK);
    }
    
    public void printMatkulAmbil(String NIM){
        new PrintMatkulAmbil().printMatkulAmbil(arrSarjana, arrMagister, NIM);
    }
    
    public void printTotalJamDosen (String NIK){
        new PrintTotalJamDosen().printTotalJamDosen(arrDosenTetap, arrDosenHonorer, NIK);
    }
    
    public void printGajiStaff(String NIK){
        new PrintGajiStaff().printGajiStaff(arrKaryawan, arrDosenTetap, arrDosenHonorer, NIK);
    }
}
