
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DosenHonorer;
import model.DosenTetap;


public class PrintTotalJamDosen {

    public void printTotalJamDosen(ArrayList<DosenTetap> arrDosenTetap, ArrayList<DosenHonorer> arrDosenHonorer, String NIK) {

        int totalJam = 0;
        int jumlahSKS = 0;
        String nama = "";

        //Dosen Tetap
        if (!arrDosenTetap.isEmpty()) { 
            for (int i = 0; i < arrDosenTetap.size(); i++) {
                if (arrDosenTetap.get(i).getNIK().equals(NIK)) { 
                    nama = arrDosenTetap.get(i).getNama();
                    if (!arrDosenTetap.get(i).arrMatkulDiajar.isEmpty()) { 
                        for (int j = 0; j < arrDosenTetap.get(i).arrMatkulDiajar.size(); j++) {
                            if (!arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.isEmpty()) { 
                                for (int k = 0; k < arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.size(); k++) {
                                    if (arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.get(k).getStatus() == 1) { 
                                        jumlahSKS = arrDosenTetap.get(i).arrMatkulDiajar.get(j).matkul.getSKS();
                                        totalJam += jumlahSKS; //1 sks = 1 jam
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

        //Dosen Honorer
        if (!arrDosenHonorer.isEmpty()) {
            for (int i = 0; i < arrDosenHonorer.size(); i++) {
                if (arrDosenHonorer.get(i).getNIK().equals(NIK)) {
                    nama = arrDosenHonorer.get(i).getNama();
                    if (!arrDosenHonorer.get(i).arrMatkulDiajar.isEmpty()) {
                        for (int j = 0; j < arrDosenHonorer.get(i).arrMatkulDiajar.size(); j++) {
                            if (!arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.isEmpty()) {
                                for (int k = 0; k < arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.size(); k++) {
                                    if (arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.get(k).getStatus() == 1) {
                                        jumlahSKS = arrDosenHonorer.get(i).arrMatkulDiajar.get(j).matkul.getSKS();
                                        totalJam += jumlahSKS;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        if (nama.equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        } else {
            JOptionPane.showMessageDialog(null, "Jam kerja bapa/ibu " + nama + "\nadalah: " + totalJam + " jam");
        }
    }

}
