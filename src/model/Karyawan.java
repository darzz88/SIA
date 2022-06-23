
package model;

import java.util.ArrayList;

public class Karyawan extends Staff {

    private int salary;
    public ArrayList<PresensiStaff> arrPresensi = new ArrayList<>();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
