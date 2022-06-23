
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Magister;
import model.Sarjana;

public class PrintRataRataNilaiMK {

    public void printRataRataNilaiMK(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister, String kodeMK) {
        
        double rataRata = 0;
        int counterJumlahNilai = 0;
        String namaMatkul = "";
        
        //Sarjana
        if (!arrSarjana.isEmpty()){
            for (int i = 0; i < arrSarjana.size(); i++) {
                for (int j = 0; j < arrSarjana.get(i).arrMatkulDiambil.size(); j++) {
                    if (arrSarjana.get(i).arrMatkulDiambil.get(j).matkul.getKode().equals(kodeMK)) {
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN1();
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN2();
                        rataRata += arrSarjana.get(i).arrMatkulDiambil.get(j).getN3();
                        counterJumlahNilai += 3;
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
                        counterJumlahNilai += 3;
                        namaMatkul = arrMagister.get(i).arrMatkulDiambil.get(j).matkul.getNamaMatkul();
                    }
                }
            }
        }
        
        rataRata = rataRata / counterJumlahNilai;
        
        if (counterJumlahNilai == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }else{
            JOptionPane.showMessageDialog(null, "Rata-rata nilai dari matkul " + namaMatkul + "\nadalah: " + rataRata);
        }
    }
}
