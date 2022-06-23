
package controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;

public class PrintGajiStaff {

    public void printGajiStaff(ArrayList<Karyawan> arrKaryawan, ArrayList<DosenTetap> arrDosenTetap, ArrayList<DosenHonorer> arrDosenHonorer, String NIK) {

        double gajiAkhir = 0;
        double unit = 0;
        double salary = 0;
        String nama = "";
        String type = "";

        //Karyawan
        if (!arrKaryawan.isEmpty()) {
            for (int i = 0; i < arrKaryawan.size(); i++) {
                if (arrKaryawan.get(i).getNIK().equals(NIK)) {
                    nama = arrKaryawan.get(i).getNama();
                    salary = arrKaryawan.get(i).getSalary();
                    type = "karyawan";
                    if (!arrKaryawan.get(i).arrPresensi.isEmpty()) {
                        for (int j = 0; j < arrKaryawan.get(i).arrPresensi.size(); j++) {
                            if (arrKaryawan.get(i).arrPresensi.get(j).getStatus() == 1) {
                                unit++;
                            }
                        }
                    }
                }
            }
        }

        //Tetap
        if (!arrDosenTetap.isEmpty()) {
            for (int i = 0; i < arrDosenTetap.size(); i++) {
                if (arrDosenTetap.get(i).getNIK().equals(NIK)) {
                    nama = arrDosenTetap.get(i).getNama();
                    salary = arrDosenTetap.get(i).getSalary();
                    type = "tetap";
                    if (!arrDosenTetap.get(i).arrMatkulDiajar.isEmpty()) { 
                        for (int j = 0; j < arrDosenTetap.get(i).arrMatkulDiajar.size(); j++) {
                            if (!arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.isEmpty()) {
                                for (int k = 0; k < arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.size(); k++) {
                                    if (arrDosenTetap.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.get(k).getStatus() == 1) { 
                                        unit++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Honorer
        if (!arrDosenHonorer.isEmpty()) {
            for (int i = 0; i < arrDosenHonorer.size(); i++) {
                if (arrDosenHonorer.get(i).getNIK().equals(NIK)) {
                    nama = arrDosenHonorer.get(i).getNama();
                    salary = arrDosenHonorer.get(i).getHonorPerSKS();
                    type = "honorer";
                    if (!arrDosenHonorer.get(i).arrMatkulDiajar.isEmpty()) { //check arr matkul
                        for (int j = 0; j < arrDosenHonorer.get(i).arrMatkulDiajar.size(); j++) {
                            if (!arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.isEmpty()) { //check arr presensi
                                for (int k = 0; k < arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.size(); k++) {
                                    if (arrDosenHonorer.get(i).arrMatkulDiajar.get(j).arrPresensiStaff.get(k).getStatus() == 1) { //check kehadiran, 1 =  hadir
                                        unit += arrDosenHonorer.get(i).arrMatkulDiajar.get(j).matkul.getSKS(); //unit dijadikan berapa sks diajar karena honornya untuk per sks
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
            switch (type) {
                case "karyawan":
                    gajiAkhir = unit / 22 * salary;
                    break;
                case "tetap":
                    gajiAkhir = salary + (unit * 25000);
                    break;
                case "honorer":
                    gajiAkhir = unit * salary;
                    break;
                default:
                    throw new AssertionError();
            }
            JOptionPane.showMessageDialog(null, "Gaji untuk bapa/ibu " + nama + "\nadalah: " + (long) gajiAkhir + " rupiah");
        }
    }
}
