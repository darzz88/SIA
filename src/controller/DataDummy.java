
package controller;

import java.util.ArrayList;
import model.Doktor;
import model.DosenHonorer;
import model.DosenTetap;
import model.Karyawan;
import model.Magister;
import model.MatkulAjar;
import model.MatkulAmbil;
import model.Presensi;
import model.PresensiStaff;
import model.Sarjana;

public class DataDummy {

    public void createDataDummy(ArrayList<Sarjana> arrSarjana, ArrayList<Magister> arrMagister,
            ArrayList<Doktor> arrDoktor, ArrayList<Karyawan> arrKaryawan,
            ArrayList<DosenTetap> arrDosenTetap, ArrayList<DosenHonorer> arrDosenHonorer) {

        //Sarjana
        Sarjana sarjana_1 = new Sarjana();
        Presensi presensiSarjana_1 = new Presensi();
        Presensi presensiSarjana_2 = new Presensi();
        MatkulAmbil matkulAMbilSarjana_1 = new MatkulAmbil();
        Presensi presensiSarjana_3 = new Presensi();
        Presensi presensiSarjana_4 = new Presensi();
        MatkulAmbil matkulAMbilSarjana_2 = new MatkulAmbil();

        sarjana_1.setNIM("1120010");
        sarjana_1.setNama("Budi");
        sarjana_1.setAlamat("Cicaheum 123");
        sarjana_1.setJurusan(1);
        sarjana_1.setTTL("Bandung, 32 Feb 2002");
        sarjana_1.setTelepon("021123456");

        matkulAMbilSarjana_1.matkul.setNamaMatkul("PBO");
        matkulAMbilSarjana_1.matkul.setKode("001");
        matkulAMbilSarjana_1.matkul.setSKS(2);

        presensiSarjana_1.setTanggal("20 Feb 2021");
        presensiSarjana_1.setStatus(1);
        presensiSarjana_2.setTanggal("25 Feb 2021");
        presensiSarjana_2.setStatus(0);

        matkulAMbilSarjana_1.arrPresensi.add(presensiSarjana_1);
        matkulAMbilSarjana_1.arrPresensi.add(presensiSarjana_2);

        matkulAMbilSarjana_1.setN1(30);
        matkulAMbilSarjana_1.setN2(40);
        matkulAMbilSarjana_1.setN3(20);

        sarjana_1.arrMatkulDiambil.add(matkulAMbilSarjana_1);
        
        //matkul ke 2
        matkulAMbilSarjana_2.matkul.setNamaMatkul("Sisber");
        matkulAMbilSarjana_2.matkul.setKode("009");
        matkulAMbilSarjana_2.matkul.setSKS(3);

        presensiSarjana_3.setTanggal("1 Des 2021");
        presensiSarjana_3.setStatus(0);
        presensiSarjana_4.setTanggal("5 Des 2021");
        presensiSarjana_4.setStatus(1);

        matkulAMbilSarjana_2.arrPresensi.add(presensiSarjana_3);
        matkulAMbilSarjana_2.arrPresensi.add(presensiSarjana_4);

        matkulAMbilSarjana_2.setN1(80);
        matkulAMbilSarjana_2.setN2(90);
        matkulAMbilSarjana_2.setN3(70);

        sarjana_1.arrMatkulDiambil.add(matkulAMbilSarjana_2);

        arrSarjana.add(sarjana_1);

        //Magister
        Magister magister_1 = new Magister();
        Presensi presensiMagister_1 = new Presensi();
        Presensi presensiMagister_2 = new Presensi();
        MatkulAmbil matkulAmbilMagister_1 = new MatkulAmbil();

        magister_1.setNIM("1120015");
        magister_1.setNama("Cecep");
        magister_1.setAlamat("Cibeureum 123");
        magister_1.setJurusan(1);
        magister_1.setTTL("Bandung, 35 Feb 2002");
        magister_1.setTelepon("021456789");
        magister_1.setJudulPenelitianTesis("Pengaruh Mental Terhadap Kehidupan");

        matkulAmbilMagister_1.matkul.setNamaMatkul("PBO");
        matkulAmbilMagister_1.matkul.setKode("001");
        matkulAmbilMagister_1.matkul.setSKS(2);

        presensiMagister_1.setTanggal("15 Mar 2021");
        presensiMagister_1.setStatus(1);
        presensiMagister_2.setTanggal("20 Mar 2021");
        presensiMagister_2.setStatus(1);

        matkulAmbilMagister_1.arrPresensi.add(presensiMagister_1);
        matkulAmbilMagister_1.arrPresensi.add(presensiMagister_2);

        matkulAmbilMagister_1.setN1(80);
        matkulAmbilMagister_1.setN2(81);
        matkulAmbilMagister_1.setN3(85);

        magister_1.arrMatkulDiambil.add(matkulAmbilMagister_1);

        arrMagister.add(magister_1);

        //Doktor
        Doktor doktor_1 = new Doktor();

        doktor_1.setNIM("1120020");
        doktor_1.setNama("Dodi");
        doktor_1.setAlamat("Cipeuyeum 123");
        doktor_1.setJurusan(1);
        doktor_1.setTTL("Bandung, 40 Feb 2002");
        doktor_1.setTelepon("02178910");
        doktor_1.setJudulPenelitianDisertasi("Pengaruh Kelulusan Terhadap Mental");
        doktor_1.setNilaiSidang1(85);
        doktor_1.setNilaiSidang2(90);
        doktor_1.setNilaiSidang3(87);

        arrDoktor.add(doktor_1);

        //Karyawan
        Karyawan karyawan_1 = new Karyawan();
        PresensiStaff presensiKaryawan_1 = new PresensiStaff();
        PresensiStaff presensiKaryawan_2 = new PresensiStaff();

        karyawan_1.setNIK("1001");
        karyawan_1.setNama("Josh");
        karyawan_1.setAlamat("TKI 2");
        karyawan_1.setTTL("Bandung, 1 Jan 1980");
        karyawan_1.setTelepon("02177885021");
        karyawan_1.setSalary(3_000_000);

        presensiKaryawan_1.setTanggal("15 Aug 2021");
        presensiKaryawan_1.setJam("7 : 00");
        presensiKaryawan_1.setStatus(0);

        presensiKaryawan_2.setTanggal("20 Aug 2021");
        presensiKaryawan_2.setJam("7 : 00");
        presensiKaryawan_2.setStatus(1);

        karyawan_1.arrPresensi.add(presensiKaryawan_1);
        karyawan_1.arrPresensi.add(presensiKaryawan_2);

        arrKaryawan.add(karyawan_1);

        //Dosen Tetap
        DosenTetap dosenTetap_1 = new DosenTetap();
        MatkulAjar matkulAjarTetap_1 = new MatkulAjar();
        PresensiStaff presensiTetap_1 = new PresensiStaff();
        PresensiStaff presensiTetap_2 = new PresensiStaff();

        dosenTetap_1.setNIK("1005");
        dosenTetap_1.setNama("Tyler");
        dosenTetap_1.setAlamat("THI 5");
        dosenTetap_1.setTTL("Bandung, 5 Mar 1975");
        dosenTetap_1.setTelepon("02112398765");
        dosenTetap_1.setSalary(5_500_000);
        dosenTetap_1.setDepartemen("Informatika");

        matkulAjarTetap_1.matkul.setNamaMatkul("PBO");
        matkulAjarTetap_1.matkul.setKode("001");
        matkulAjarTetap_1.matkul.setSKS(2);

        presensiTetap_1.setTanggal("15 Jun 2021");
        presensiTetap_1.setJam("10 : 00");
        presensiTetap_1.setStatus(1);

        presensiTetap_2.setTanggal("20 Jun 2021");
        presensiTetap_2.setJam("10 : 00");
        presensiTetap_2.setStatus(1);

        matkulAjarTetap_1.arrPresensiStaff.add(presensiTetap_1);
        matkulAjarTetap_1.arrPresensiStaff.add(presensiTetap_2);

        dosenTetap_1.arrMatkulDiajar.add(matkulAjarTetap_1);

        arrDosenTetap.add(dosenTetap_1);

        //Dosen Honorer
        DosenHonorer dosenHonorer_1 = new DosenHonorer();
        MatkulAjar matkulAjarHonorer_1 = new MatkulAjar();
        PresensiStaff presensiHonorer_1 = new PresensiStaff();
        PresensiStaff presensiHonorer_2 = new PresensiStaff();

        dosenHonorer_1.setNIK("1010");
        dosenHonorer_1.setNama("Gerard");
        dosenHonorer_1.setAlamat("Mulberry 10");
        dosenHonorer_1.setTTL("Bandung, 10 Des 1970");
        dosenHonorer_1.setTelepon("02159873654");
        dosenHonorer_1.setHonorPerSKS(1_000_000);
        dosenHonorer_1.setDepartemen("DKV");

        matkulAjarHonorer_1.matkul.setNamaMatkul("Art");
        matkulAjarHonorer_1.matkul.setKode("002");
        matkulAjarHonorer_1.matkul.setSKS(3);

        presensiHonorer_1.setTanggal("20 Sep 2021");
        presensiHonorer_1.setJam("8 : 00");
        presensiHonorer_1.setStatus(0);

        presensiHonorer_2.setTanggal("25 Sep 2021");
        presensiHonorer_2.setJam("8 : 00");
        presensiHonorer_2.setStatus(1);

        matkulAjarHonorer_1.arrPresensiStaff.add(presensiHonorer_1);
        matkulAjarHonorer_1.arrPresensiStaff.add(presensiHonorer_2);

        dosenHonorer_1.arrMatkulDiajar.add(matkulAjarHonorer_1);

        arrDosenHonorer.add(dosenHonorer_1);
    }
}
