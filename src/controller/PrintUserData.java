
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Doktor;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Magister;
import model.Sarjana;

public class PrintUserData {

    public void printUserData(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister,
            ArrayList<Doktor> arrDoktor, ArrayList<Karyawan> arrKaryawan,
            ArrayList<DosenTetap> arrDosenTetap, ArrayList<DosenHonorer> arrDosenHonorer,
            String nama) {
        
        String print = "Nama Tidak Ditemukkan";

        if (!arrSarjana.isEmpty()) {
            for (int i = 0; i < arrSarjana.size(); i++) {
                if (arrSarjana.get(i).getNama().equals(nama)) {
                    print = arrSarjana.get(i).toString();
                }
            }
        }

        if (!arrMagister.isEmpty()) {
            for (int i = 0; i < arrMagister.size(); i++) {
                if (arrMagister.get(i).getNama().equals(nama)) {
                    print = arrMagister.get(i).toString();
                }
            }
        }

        if (!arrDoktor.isEmpty()) {
            for (int i = 0; i < arrDoktor.size(); i++) {
                if (arrDoktor.get(i).getNama().equals(nama)) {
                    print = arrDoktor.get(i).toString();
                }
            }
        }

        if (!arrKaryawan.isEmpty()) {
            for (int i = 0; i < arrKaryawan.size(); i++) {
                if (arrKaryawan.get(i).getNama().equals(nama)) {
                    print = arrKaryawan.get(i).toString();
                }
            }
        }

        if (!arrDosenHonorer.isEmpty()) {
            for (int i = 0; i < arrDosenHonorer.size(); i++) {
                if (arrDosenHonorer.get(i).getNama().equals(nama)) {
                    print = arrDosenHonorer.get(i).toString();
                }
            }
        }

        if (!arrDosenTetap.isEmpty()) {
            for (int i = 0; i < arrDosenTetap.size(); i++) {
                if (arrDosenTetap.get(i).getNama().equals(nama)) {
                    print = arrDosenTetap.get(i).toString();
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, print);

    }
}
