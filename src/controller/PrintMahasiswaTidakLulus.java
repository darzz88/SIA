
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Magister;
import model.Sarjana;

public class PrintMahasiswaTidakLulus {
    
    public void printMahasiswaTidakLulus(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister, String kodeMK){
        double rataRata = 0;
        int counterTidakLulus = 0;
        int counterJumlahAmbil = 0;
        String namaMatkul = "";
        
        //Sarjana
        if (!arrSarjana.isEmpty()){
            for (int i = 0; i < arrSarjana.size(); i++) {
                for (int j = 0; j < arrSarjana.get(i).arrMatkulDiambil.size(); j++) {
                    if (arrSarjana.get(i).arrMatkulDiambil.get(j).matkul.getKode().equals(kodeMK)) {
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN1();
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN2();
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN3();
                        rataRata = rataRata / 3;
                        
                        if (rataRata < 56) {
                            counterTidakLulus += 1;
                        }
                        
                        counterJumlahAmbil += 1;
                        rataRata = 0; //reset
                        namaMatkul = arrSarjana.get(i).arrMatkulDiambil.get(j).matkul.getNamaMatkul();
                    }
                }
            }
        }
        
        //Magister
        if (!arrMagister.isEmpty()) {
            for (int i = 0; i < arrMagister.size(); i++) {
                for (int j = 0; j < arrMagister.get(i).arrMatkulDiambil.size(); j++) {
                    if (arrMagister.get(i).arrMatkulDiambil.get(j).matkul.getKode().equals(kodeMK)) {
                        rataRata += arrMagister.get(i).arrMatkulDiambil.get(j).getN1();
                        rataRata += arrMagister.get(i).arrMatkulDiambil.get(j).getN2();
                        rataRata += arrMagister.get(i).arrMatkulDiambil.get(j).getN3();
                        rataRata = rataRata / 3;
                        
                        if (rataRata < 56) {
                            counterTidakLulus += 1;
                        }
                        
                        counterJumlahAmbil += 1;
                        rataRata = 0; //reset
                        namaMatkul = arrMagister.get(i).arrMatkulDiambil.get(j).matkul.getNamaMatkul();
                    }
                }
            }
        }
        
        if (counterJumlahAmbil == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }else{
            JOptionPane.showMessageDialog(null, counterTidakLulus + " dari " + counterJumlahAmbil + "\nTidak lulus matakuliah " + namaMatkul);
        }
        
    }
    
}
