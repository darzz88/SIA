
package model;

public class Staff extends User {

    private String NIK;

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    @Override
    public String toString() {
        String print = super.toString();
        print += "\nNIK: " + NIK;
        return print;
    }

}
