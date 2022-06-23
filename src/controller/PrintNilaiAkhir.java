
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doktor;
import model.Magister;
import model.Sarjana;


public class PrintNilaiAkhir {

    public void printNilaiAkhir(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister,
            ArrayList<Doktor> arrDoktor, String NIM, String kodeMK) {

        int nilai1 = 0;
        int nilai2 = 0;
        int nilai3 = 0;
        
        //Sarjana
        if (!arrSarjana.isEmpty()) { 
            for (int i = 0; i < arrSarjana.size(); i++) { 
                if (arrSarjana.get(i).getNIM().equals(NIM)) { 
                    if (!arrSarjana.get(i).arrMatkulDiambil.isEmpty()) { 
                        for (int j = 0; j < arrSarjana.get(i).arrMatkulDiambil.size(); j++) { 
                            if (arrSarjana.get(i).arrMatkulDiambil.get(j).matkul.getKode().equals(kodeMK)) {
                                nilai1 = arrSarjana.get(i).arrMatkulDiambil.get(j).getN1(); 
                                nilai2 = arrSarjana.get(i).arrMatkulDiambil.get(j).getN2();
                                nilai3 = arrSarjana.get(i).arrMatkulDiambil.get(j).getN3();
                            }
                        }
                    }
                }
            }
        }
        
        //Magister
        if (!arrMagister.isEmpty()) {
            for (int i = 0; i < arrMagister.size(); i++) {
                if (arrMagister.get(i).getNIM().equals(NIM)) {
                    if (!arrMagister.get(i).arrMatkulDiambil.isEmpty()) { 
                        for (int j = 0; j < arrMagister.get(i).arrMatkulDiambil.size(); j++) {
                            if (arrMagister.get(i).arrMatkulDiambil.get(j).matkul.getKode().equals(kodeMK)) { 
                                nilai1 = arrMagister.get(i).arrMatkulDiambil.get(j).getN1();
                                nilai2 = arrMagister.get(i).arrMatkulDiambil.get(j).getN2();
                                nilai3 = arrMagister.get(i).arrMatkulDiambil.get(j).getN3();
                            }
                        }
                    }
                }
            }
        }
        
        //Doktor
        if (!arrDoktor.isEmpty()) {
            for (int i = 0; i < arrDoktor.size(); i++) {
                if (arrDoktor.get(i).getNIM().equals(NIM)) {
                    nilai1 = arrDoktor.get(i).getNilaiSidang1();
                    nilai2 = arrDoktor.get(i).getNilaiSidang2();
                    nilai3 = arrDoktor.get(i).getNilaiSidang3();
                }
            }
        }
        
        double rataRata = (nilai1+nilai2+nilai3)/3;
        
        if (rataRata == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }else{
            JOptionPane.showMessageDialog(null, "Nilai 1: " + nilai1 + "\nNilai 2: " + nilai2 + "\nNilai 3: " + nilai3 + "\nRata-rata: " + rataRata);
        }

    }
}
