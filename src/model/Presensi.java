
package model;

public class Presensi implements ConstantStatusKehadiran {

    private String tanggal;
    private int status;

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatusMeaning(int status) {
        String statusMeaning = "";
        switch (status) {
            case 0:
                statusMeaning = "Alpha";
                break;
            case 1:
                statusMeaning = "Hadir";
                break;
            default:
                throw new AssertionError();
        }
        return statusMeaning;
    }

    @Override
    public String toString() {
        String print = "\nTanggal: " + tanggal + " | Status: " + getStatusMeaning(this.status) + "\n";
        return print;
    }

}
