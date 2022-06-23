
package view;

import javax.swing.JOptionPane;
import controller.Controller;

public class MainMenu {

    private String checkNama, checkNIM, checkKodeMK, checkNIK;

    public MainMenu() {
        Controller control = new Controller();
        control.createDataDummy();
        boolean isDoneMenu = false;
        
        while (isDoneMenu != true) {
            int pilihan = Integer.parseInt(JOptionPane.showInputDialog("1. Check User Data "
                    + "\n2. Check Nilai Akhir Mahasiswa "
                    + "\n3. Check Rata-Rata Akhir Sebuah MK "
                    + "\n4. Check Berapa Yang Tidak Lulus Dari Sebuah MK "
                    + "\n5. Check Presensi dan Nama Matkul DIambil "
                    + "\n6. Check Total Jam Kerja Dosen "
                    + "\n7. Check Gaji Staff "
                    + "\n8. Exit "
                    + "\nMasukkan Nomor Menu: "));

            switch (pilihan) {
                case 1:
                    checkNama = JOptionPane.showInputDialog("Masukkan nama: ");
                    control.printUserData(checkNama);
                    break;

                case 2:
                    checkNIM = JOptionPane.showInputDialog("Masukkan NIM: ");
                    checkKodeMK = JOptionPane.showInputDialog("Masukkan Kode MK: \n(Masukkan - untuk dokter)");
                    control.printNilaiAkhir(checkNIM, checkKodeMK);
                    break;

                case 3:
                    checkKodeMK = JOptionPane.showInputDialog("Masukkan Kode MK: ");
                    control.printRataRataNilaiMK(checkKodeMK);
                    break;

                case 4:
                    checkKodeMK = JOptionPane.showInputDialog("Masukkan Kode MK: ");
                    control.printMahasiswaTidakLulus(checkKodeMK);
                    break;

                case 5:
                    checkNIM = JOptionPane.showInputDialog("Masukkan NIM: ");
                    control.printMatkulAmbil(checkNIM);
                    break;

                case 6:
                    checkNIK = JOptionPane.showInputDialog("Masukkan NIK Dosen: ");
                    control.printTotalJamDosen(checkNIK);
                    break;

                case 7:
                    checkNIK = JOptionPane.showInputDialog("Masukkan NIK: ");
                    control.printGajiStaff(checkNIK);
                    break;

                case 8:
                    isDoneMenu = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Check kembali input");
            }
        }
    }

}
