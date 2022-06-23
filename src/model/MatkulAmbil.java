
package model;

import java.util.ArrayList;

public class MatkulAmbil {

    public MataKuliah matkul = new MataKuliah();
    public ArrayList<Presensi> arrPresensi = new ArrayList<>();
    private int n1;
    private int n2;
    private int n3;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        String print = "";
        
        print += matkul.toString();

        print += arrPresensi.toString();

        print += "\nN1: " + n1 + " | N2: " + n2 + " | N3: " + n3 + "\n";

        return print;
    }

}
