
package model;

import java.util.ArrayList;

public class MatkulAjar {

    public MataKuliah matkul = new MataKuliah();
    public ArrayList<PresensiStaff> arrPresensiStaff = new ArrayList<>();

    @Override
    public String toString() {
        System.out.println(matkul.toString());

        System.out.println(arrPresensiStaff.toString());

        String print = "";

        return print;
    }
}
