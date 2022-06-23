
package model;

import java.util.ArrayList;

public class Dosen extends Staff {

    public ArrayList<MatkulAjar> arrMatkulDiajar = new ArrayList<>();
    private String departemen;

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
